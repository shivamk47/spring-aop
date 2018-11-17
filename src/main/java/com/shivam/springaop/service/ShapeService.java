package com.shivam.springaop.service;

import com.shivam.springaop.model.Circle;
import com.shivam.springaop.model.Square;
import org.springframework.stereotype.Service;

@Service
public class ShapeService {

    private Circle circle;

    private Square square;

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }
}
