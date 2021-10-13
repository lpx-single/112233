package com.smallhomework.untity;

public class Goods {
    private String goodNum;
    private int length;
    private int width;
    private int height;

    public Goods() {
    }

    public Goods(String goodNum, int length, int width, int height) {
        this.goodNum = goodNum;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void setGoodNum(String goodNum) {
        this.goodNum = goodNum;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setPassword(int width) {
        this.width = width;
    }

    public void setSex(int height) {
        this.height = height;
    }

    public String getGoodNum() {
        return goodNum;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
