package edu.bsuir.ootpisp.lab1.java.drawer;

import edu.bsuir.ootpisp.lab1.java.entity.Circle;
import edu.bsuir.ootpisp.lab1.java.entity.Figure;

import java.awt.*;

public class CircleDrawer implements Drawing{

    public void drawFigure(Graphics2D g, Figure figure){
        Circle circle = (Circle) figure;
        int xStart = Math.min(circle.getDots().get(0).x, circle.getDots().get(1).x);
        int yStart = Math.min(circle.getDots().get(0).y, circle.getDots().get(1).y);
        g.setColor(((Circle) figure).getFillColor());
        int radius = (int) Math.ceil(
                Math.sqrt(Math.pow(circle.getDots().get(0).x - circle.getDots().get(1).x, 2)
                        + Math.pow(circle.getDots().get(0).y - circle.getDots().get(1).y, 2)));
        g.fillOval(xStart, yStart, radius, radius);
        g.setColor(figure.getBorderColor());
        g.drawOval(xStart, yStart, radius, radius);
    }

}
