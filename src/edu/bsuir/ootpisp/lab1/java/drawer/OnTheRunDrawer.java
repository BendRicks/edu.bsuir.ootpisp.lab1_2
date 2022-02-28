package edu.bsuir.ootpisp.lab1.java.drawer;

import edu.bsuir.ootpisp.lab1.java.entity.PaintPanel;

import java.awt.*;
import java.util.ArrayList;

public class OnTheRunDrawer {

    public static void drawFigure(PaintPanel renderPanel, ArrayList<Point> figureDots) {
        for (int i = 0; i < figureDots.size() - 1; i++) {
            renderPanel.getGraphics().drawLine(figureDots.get(i).x, figureDots.get(i).y,
                    figureDots.get(i + 1).x, figureDots.get(i + 1).y);
        }
    }

}
