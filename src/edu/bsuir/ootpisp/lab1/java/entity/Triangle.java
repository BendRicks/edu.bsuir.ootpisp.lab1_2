package edu.bsuir.ootpisp.lab1.java.entity;

import java.awt.Point;
import java.util.ArrayList;

public class Triangle extends Polygon{

    public Triangle(){

    }
    public Triangle(ArrayList<Point> figureDots){
        this.dots = figureDots;
    }

    public void buildFigure(PaintPanel renderPanel){
        ArrayList<Point> dots = (ArrayList<Point>) renderPanel.getFigureDots().clone();
        ArrayList<Figure> list = renderPanel.getFigures();
        Triangle triangle = new Triangle(dots);
        triangle.setBorderColor(renderPanel.getBorderColor());
        triangle.setFillColor(renderPanel.getFillColor());
        list.add(triangle);
    }

}
