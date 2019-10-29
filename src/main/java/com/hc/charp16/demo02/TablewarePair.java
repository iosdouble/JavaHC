package com.hc.charp16.demo02;

/**
 * @Classname TablewarePair
 * @Description TODO
 * @Date 2019/7/19 7:34 PM
 * @Created by nihui
 */
public class TablewarePair {
    private final Tableware leftTool;
    private final Tableware rightTool;

    public TablewarePair(Tableware leftTool, Tableware rightTool) {
        this.leftTool = leftTool;
        this.rightTool = rightTool;
    }

    public Tableware getLeftTool() {
        return leftTool;
    }

    public Tableware getRightTool() {
        return rightTool;
    }
}
