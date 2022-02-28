package edu.bsuir.ootpisp.lab1.java.drawer;

import edu.bsuir.ootpisp.lab1.java.entity.Figure;
import edu.bsuir.ootpisp.lab1.java.entity.Triangle;

import java.awt.*;

public class TriangleDrawer implements Drawing{

    public void drawFigure(Graphics2D g, Figure figure){
        Triangle triangle = (Triangle) figure;
        int[] xPoints = new int[3];
        int[] yPoints = new int[3];
        for (int i = 0; i < 3; i++){
            xPoints[i] = triangle.getDots().get(i).x;
            yPoints[i] = triangle.getDots().get(i).y;
        }
        g.setColor(((Triangle) figure).getFillColor());
        g.fillPolygon(xPoints, yPoints, 3);
        g.setColor(figure.getBorderColor());
        g.drawPolygon(xPoints, yPoints, 3);
    }

}
