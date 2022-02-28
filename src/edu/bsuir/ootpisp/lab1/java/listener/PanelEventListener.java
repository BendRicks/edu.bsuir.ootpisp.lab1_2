package edu.bsuir.ootpisp.lab1.java.listener;

import edu.bsuir.ootpisp.lab1.java.drawer.OnTheRunDrawer;
import edu.bsuir.ootpisp.lab1.java.entity.*;
import edu.bsuir.ootpisp.lab1.java.entity.Polygon;
import edu.bsuir.ootpisp.lab1.java.entity.Rectangle;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.HashMap;

public class PanelEventListener implements MouseListener, MouseMotionListener {

    HashMap<Tools, AbleBeBuilt> chooser = new HashMap<Tools, AbleBeBuilt>() {{
        put(Tools.CIRCLE, new Circle());
        put(Tools.ELLIPSE, new Ellipse());
        put(Tools.LINE, new Line());
        put(Tools.POLYGON, new Polygon());
        put(Tools.RECTANGLE, new Rectangle());
        put(Tools.SQUARE, new Square());
        put(Tools.TRIANGLE, new Triangle());
    }};

    private final PaintPanel panel;
    private final ArrayList<Figure> figures;
    private final ArrayList<Point> figureDots;

    Point curPosition = new Point();

    public PanelEventListener(PaintPanel panel, ArrayList<Figure> figureList, ArrayList<Point> figureDots){
        this.panel = panel;
        this.figures = figureList;
        this.figureDots = figureDots;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        curPosition.setLocation(e.getX(), e.getY());
        Tools curTool = panel.getTool();
        if (!figureDots.isEmpty()) {
            Point firstPoint = figureDots.get(0);
            int distanceToFirst = (int) Math.ceil(
                    Math.sqrt(Math.pow(firstPoint.x - curPosition.x, 2)
                            + Math.pow(firstPoint.y - curPosition.y, 2)));
            if (distanceToFirst < 20){
                if (figureDots.size() >= curTool.getDotsMin()){
                    chooser.get(curTool).buildFigure(panel);
                    figureDots.clear();
                    panel.paintComponent(panel.getGraphics());
                }
            } else if (figureDots.size() < curTool.getDotsMax()){
                figureDots.add((Point) curPosition.clone());
                OnTheRunDrawer.drawFigure(panel, figureDots);
            }
            if (figureDots.size() == curTool.getDotsMax()){
                chooser.get(curTool).buildFigure(panel);
                figureDots.clear();
                panel.paintComponent(panel.getGraphics());
            }
        } else {
            figureDots.add((Point) curPosition.clone());
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        curPosition.setLocation(e.getX(), e.getY());
    }
}
