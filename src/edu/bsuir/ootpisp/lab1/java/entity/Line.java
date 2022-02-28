package edu.bsuir.ootpisp.lab1.java.entity;

import java.awt.*;
import java.util.ArrayList;

public class Line extends Figure {

    public Line(){

    }

    public Line(ArrayList<Point> dots){
        this.dots = dots;
    }

    public void buildFigure(PaintPanel renderPanel){
        ArrayList<Point> dots = (ArrayList<Point>) renderPanel.getFigureDots().clone();
        ArrayList<Figure> list = renderPanel.getFigures();
        Line line = new Line(dots);
        line.setBorderColor(renderPanel.getBorderColor());
        list.add(line);
    }

}
