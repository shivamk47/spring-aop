package com.shivam.springaop.model;

import org.springframework.stereotype.Component;

@Component
public class Square {

    private int length;

    private int area;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
