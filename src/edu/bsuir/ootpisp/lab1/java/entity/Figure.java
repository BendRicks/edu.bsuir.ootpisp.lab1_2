package edu.bsuir.ootpisp.lab1.java.entity;

import java.awt.Point;
import java.awt.Color;
import java.util.ArrayList;

public abstract class Figure implements AbleBeBuilt{

    protected ArrayList<Point> dots;
    protected Color borderColor;

    public ArrayList<Point> getDots() {
        return dots;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }
}
