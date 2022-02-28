package edu.bsuir.ootpisp.lab1.java.entity;

import java.util.ArrayList;
import java.awt.Point;

public class Polygon extends Closed {

    public Polygon(){

    }

    public Polygon(ArrayList<Point> figureDots){
        this.dots =  figureDots;
    }

    public void buildFigure(PaintPanel renderPanel){
        ArrayList<Point> dots = (ArrayList<Point>) renderPanel.getFigureDots().clone();
        ArrayList<Figure> list = renderPanel.getFigures();
        Polygon polygon = new Polygon(dots);
        polygon.setBorderColor(renderPanel.getBorderColor());
        polygon.setFillColor(renderPanel.getFillColor());
        list.add(polygon);
    }

}
