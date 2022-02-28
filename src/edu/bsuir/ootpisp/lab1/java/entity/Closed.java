package edu.bsuir.ootpisp.lab1.java.entity;

import java.awt.Color;

public abstract class Closed extends Figure {

    private Color fillColor;

    public Color getFillColor() {
        return fillColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }
}
