package edu.bsuir.ootpisp.lab1.java.entity;

import java.awt.*;
import java.util.ArrayList;

public class Ellipse extends Closed {

    public Ellipse(){}

    public Ellipse(ArrayList<Point> dots){
        this.dots = dots;
    }

    public void buildFigure(PaintPanel renderPanel){
        ArrayList<Point> dots = (ArrayList<Point>) renderPanel.getFigureDots().clone();
        ArrayList<Figure> list = renderPanel.getFigures();
        Ellipse ellipse = new Ellipse(dots);
        ellipse.setBorderColor(renderPanel.getBorderColor());
        ellipse.setFillColor(renderPanel.getFillColor());
        list.add(ellipse);
    }

}
