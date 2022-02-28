package edu.bsuir.ootpisp.lab1.java.entity;

import java.awt.*;
import java.util.ArrayList;

public class Square extends Rectangle {

    public Square(){}

    public Square(ArrayList<Point> dots){
        this.dots = dots;
    }

    public void buildFigure(PaintPanel renderPanel){
        ArrayList<Point> dots = (ArrayList<Point>) renderPanel.getFigureDots().clone();
        ArrayList<Figure> list = renderPanel.getFigures();
        Square square = new Square(dots);
        square.setBorderColor(renderPanel.getBorderColor());
        square.setFillColor(renderPanel.getFillColor());
        list.add(square);
    }
}
