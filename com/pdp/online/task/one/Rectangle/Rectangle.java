package com.pdp.online.task.one.Rectangle;

public class Rectangle {
    private int width;
    private int height;
    private int result;

    public Rectangle(int width, int height, int result) {
        this.width = width;
        this.height = height;
        this.result = result;

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getResult() {
        return result;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int calculate() {
        return this.height * this.width;

    }

    public void disply() {
        System.out.println(this.width + " * " + this.height + " = " + calculate());
    }
}
