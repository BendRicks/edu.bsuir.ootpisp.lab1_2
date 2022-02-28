package edu.bsuir.ootpisp.lab1.java.entity;

import java.awt.*;
import java.util.ArrayList;

public class Circle extends Ellipse {

    public Circle() {}

    public Circle(ArrayList<Point> dots){
        this.dots = dots;
    }

    public void buildFigure(PaintPanel renderPanel){
        ArrayList<Point> dots = (ArrayList<Point>) renderPanel.getFigureDots().clone();
        ArrayList<Figure> list = renderPanel.getFigures();
        Circle circle = new Circle(dots);
        circle.setBorderColor(renderPanel.getBorderColor());
        circle.setFillColor(renderPanel.getFillColor());
        list.add(circle);
    }

}
