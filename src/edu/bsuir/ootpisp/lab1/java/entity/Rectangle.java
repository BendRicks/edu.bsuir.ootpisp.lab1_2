package edu.bsuir.ootpisp.lab1.java.entity;

import java.awt.*;
import java.util.ArrayList;

public class Rectangle extends Polygon {

    public Rectangle(){

    }
    public Rectangle(ArrayList<Point> dots){
        this.dots = dots;
    }

    public void buildFigure(PaintPanel renderPanel){
        ArrayList<Point> dots = (ArrayList<Point>) renderPanel.getFigureDots().clone();
        ArrayList<Figure> list = renderPanel.getFigures();
        Rectangle rectangle = new Rectangle(dots);
        rectangle.setBorderColor(renderPanel.getBorderColor());
        rectangle.setFillColor(renderPanel.getFillColor());
        list.add(rectangle);
    }
}
