package com.example.charp10;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @ClassName MyClassLoader
 * @Author nihui
 * @Date 2019/5/12 16:36
 * @Version 1.0
 * @Description TODO
 */
public class MyClassLoader extends ClassLoader {

    //设置默认的class文件存放路径target/classes/com/example/charp10
    private final static Path DEFAULT_CLASS_DIR= Paths.get("target/classes/com/example/","charp10");

    private final Path  classDir;


    public MyClassLoader() {
        super();
        this.classDir = DEFAULT_CLASS_DIR;
    }


    //允许通过参数传入类路径


    public MyClassLoader(String classDir) {
        super();
        this.classDir = Paths.get(classDir);
    }

    public MyClassLoader(String classDir,ClassLoader parent) {
        super(parent);
        this.classDir = Paths.get(classDir);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] classBytes = this.readClassBytes(name);
        if (null==classBytes||classBytes.length==0){
            throw new ClassNotFoundException("Can not load the class"+name);
        }
        return this.defineClass(name,classBytes,0,classBytes.length);

    }

    private byte[] readClassBytes(String name) throws ClassNotFoundException {
        String classPath = name.replace(".","/");
        Path classFullPath = classDir.resolve(Paths.get(classPath+".class"));
        System.out.println(classFullPath.toString());
        if (!classFullPath.toFile().exists()){
            throw new ClassNotFoundException("The class "+name+"not fund");
        }
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            Files.copy(classFullPath,baos);
            return baos.toByteArray();
        } catch (IOException e) {
            throw new ClassNotFoundException("load the class "+name+" occur error.",e);
        }
    }

    @Override
    public String toString() {
        return "My ClassLoader";
    }
}
