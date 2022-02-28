package edu.bsuir.ootpisp.lab1.java.drawer;

import edu.bsuir.ootpisp.lab1.java.entity.Figure;
import edu.bsuir.ootpisp.lab1.java.entity.Polygon;

import java.awt.*;

public class PolygonDrawer implements Drawing{

    public void drawFigure(Graphics2D g, Figure figure){
        edu.bsuir.ootpisp.lab1.java.entity.Polygon polygon = (edu.bsuir.ootpisp.lab1.java.entity.Polygon) figure;
        int[] xPoints = new int[polygon.getDots().size()];
        int[] yPoints = new int[polygon.getDots().size()];
        for (int i = 0; i < polygon.getDots().size(); i++){
            xPoints[i] = polygon.getDots().get(i).x;
            yPoints[i] = polygon.getDots().get(i).y;
        }
        g.setColor(((Polygon) figure).getFillColor());
        g.fillPolygon(xPoints, yPoints, polygon.getDots().size());
        g.setColor(figure.getBorderColor());
        g.drawPolygon(xPoints, yPoints, polygon.getDots().size());
    }

}
