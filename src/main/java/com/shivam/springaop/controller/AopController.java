package com.shivam.springaop.controller;

import com.shivam.springaop.model.Circle;
import com.shivam.springaop.service.ShapeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AopController {

    @Autowired
    ShapeService shapeService;

    @RequestMapping(value = "api/test")
    public String getTest() {
        Circle circle = new Circle();
        circle.setArea(100);
        circle.setRadius(15);

        shapeService.setCircle(circle);
        System.out.println("shapeService circle: " + shapeService.getCircle().getArea());
        return "SHIVAM";
    }
}
