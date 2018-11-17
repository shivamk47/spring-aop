package com.shivam.springaop.model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class Circle {

    private int radius;

    private int area;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
