package edu.bsuir.ootpisp.lab1.java.drawer;

import edu.bsuir.ootpisp.lab1.java.entity.Figure;
import edu.bsuir.ootpisp.lab1.java.entity.Rectangle;

import java.awt.*;

public class RectangleDrawer implements Drawing{

    public void drawFigure(Graphics2D g, Figure figure){
        Rectangle rectangle = (Rectangle) figure;
        int xStart = Math.min(rectangle.getDots().get(0).x, rectangle.getDots().get(1).x);
        int yStart = Math.min(rectangle.getDots().get(0).y, rectangle.getDots().get(1).y);
        g.setColor(((Rectangle) figure).getFillColor());
        g.fillRect(xStart, yStart,
                Math.abs(rectangle.getDots().get(1).x - rectangle.getDots().get(0).x),
                Math.abs(rectangle.getDots().get(1).y - rectangle.getDots().get(0).y));
        g.setColor(figure.getBorderColor());
        g.drawRect(xStart, yStart,
                Math.abs(rectangle.getDots().get(1).x - rectangle.getDots().get(0).x),
                Math.abs(rectangle.getDots().get(1).y - rectangle.getDots().get(0).y));
    }

}
