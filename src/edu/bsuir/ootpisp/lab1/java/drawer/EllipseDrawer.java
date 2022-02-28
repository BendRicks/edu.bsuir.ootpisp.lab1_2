package edu.bsuir.ootpisp.lab1.java.drawer;

import edu.bsuir.ootpisp.lab1.java.entity.Ellipse;
import edu.bsuir.ootpisp.lab1.java.entity.Figure;

import java.awt.*;

public class EllipseDrawer implements Drawing{

    public void drawFigure(Graphics2D g, Figure figure){
        Ellipse ellipse = (Ellipse) figure;
        int xStart = Math.min(ellipse.getDots().get(0).x, ellipse.getDots().get(1).x);
        int yStart = Math.min(ellipse.getDots().get(0).y, ellipse.getDots().get(1).y);
        g.setColor(((Ellipse) figure).getFillColor());
        g.fillOval(xStart, yStart,
                Math.abs(ellipse.getDots().get(1).x - ellipse.getDots().get(0).x),
                Math.abs(ellipse.getDots().get(1).y - ellipse.getDots().get(0).y));
        g.setColor(figure.getBorderColor());
        g.drawOval(xStart, yStart,
                Math.abs(ellipse.getDots().get(1).x - ellipse.getDots().get(0).x),
                Math.abs(ellipse.getDots().get(1).y - ellipse.getDots().get(0).y));
    }

}
