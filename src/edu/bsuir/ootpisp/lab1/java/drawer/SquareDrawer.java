package edu.bsuir.ootpisp.lab1.java.drawer;

import edu.bsuir.ootpisp.lab1.java.entity.Figure;
import edu.bsuir.ootpisp.lab1.java.entity.Square;

import java.awt.*;

public class SquareDrawer implements Drawing{

    public void drawFigure(Graphics2D g, Figure figure){
        Square square = (Square) figure;
        int xStart = Math.min(square.getDots().get(0).x, square.getDots().get(1).x);
        int yStart = Math.min(square.getDots().get(0).y, square.getDots().get(1).y);
        int xWidth = Math.abs(square.getDots().get(1).x - square.getDots().get(0).x);
        int yWidth = Math.abs(square.getDots().get(1).y - square.getDots().get(0).y);
        int width = (Math.max(xWidth, yWidth));
        g.setColor(((Square) figure).getFillColor());
        g.fillRect(xStart, yStart, width, width);
        g.setColor(figure.getBorderColor());
        g.drawRect(xStart, yStart, width, width);
    }

}
