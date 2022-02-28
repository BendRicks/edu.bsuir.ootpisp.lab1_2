package edu.bsuir.ootpisp.lab1.java.drawer;

import edu.bsuir.ootpisp.lab1.java.entity.Figure;
import edu.bsuir.ootpisp.lab1.java.entity.Line;

import java.awt.*;

public class LineDrawer implements Drawing{

    public void drawFigure(Graphics2D g, Figure figure){
        Line line = (Line) figure;
        g.setColor(figure.getBorderColor());
        g.drawLine(line.getDots().get(0).x,
                line.getDots().get(0).y,
                line.getDots().get(1).x,
                line.getDots().get(1).y);
    }

}
