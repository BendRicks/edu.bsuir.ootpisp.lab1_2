package edu.bsuir.ootpisp.lab1.java.entity;
import edu.bsuir.ootpisp.lab1.java.drawer.*;
import edu.bsuir.ootpisp.lab1.java.listener.PanelEventListener;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class PaintPanel extends JPanel {

    HashMap<Class, Drawing> actionChooser = new HashMap<Class, Drawing>() {{
        put(Circle.class, new CircleDrawer());
        put(Ellipse.class, new EllipseDrawer());
        put(Line.class, new LineDrawer());
        put(Polygon.class, new PolygonDrawer());
        put(Rectangle.class, new RectangleDrawer());
        put(Square.class, new SquareDrawer());
        put(Triangle.class, new TriangleDrawer());
    }};

    HashMap<String, Color> takeColor = new HashMap<String, Color>(){{
        put("Black", Color.BLACK);
        put("Green", Color.GREEN);
        put("Blue", Color.BLUE);
        put("Yellow", Color.YELLOW);
        put("Gray", Color.GRAY);
        put("White", Color.WHITE);
    }};

    HashMap<String, Tools> takeTool = new HashMap<String, Tools>(){{
        put("Square", Tools.SQUARE);
        put("Rectangle", Tools.RECTANGLE);
        put("Circle", Tools.CIRCLE);
        put("Ellipse", Tools.ELLIPSE);
        put("Line", Tools.LINE);
        put("Polygon", Tools.POLYGON);
        put("Triangle", Tools.TRIANGLE);
    }};

    String[] figureStrings = {"Square", "Rectangle", "Circle", "Ellipse", "Line", "Polygon", "Triangle"};
    String[] colorsArray = {"Black", "Green", "Blue", "Yellow", "Gray", "White"};
    JComboBox<String> figureChooseComboBox = new JComboBox<>(figureStrings);
    JComboBox<String> fillColorComboBox = new JComboBox<>(colorsArray);
    JComboBox<String> borderColorComboBox = new JComboBox<>(colorsArray);

    private Tools tool;
    private Color borderColor;
    private Color fillColor;

    private ArrayList<Figure> figures = new ArrayList<>();
    private ArrayList<Point> figureDots = new ArrayList<>();

    public PaintPanel(){
        setSize(800, 600);
        this.setLayout(new FlowLayout());
        addMouseListener(new PanelEventListener(this, this.figures, this.figureDots));
        addMouseMotionListener(new PanelEventListener(this, this.figures, this.figureDots));

        figureChooseComboBox.setSelectedIndex(0);
        borderColorComboBox.setSelectedIndex(0);
        fillColorComboBox.setSelectedIndex(0);

        figureChooseComboBox.addActionListener(e -> {
            tool = takeTool.get((String) ((JComboBox) e.getSource()).getSelectedItem());
            figureDots.clear();
        });

        borderColorComboBox.addActionListener(e -> {
            borderColor = takeColor.get((String) ((JComboBox) e.getSource()).getSelectedItem());
            figureDots.clear();
        });

        fillColorComboBox.addActionListener(e -> {
            fillColor = takeColor.get((String) ((JComboBox) e.getSource()).getSelectedItem());
            figureDots.clear();
        });

        fillColor = takeColor.get((String) fillColorComboBox.getSelectedItem());
        borderColor = takeColor.get((String) borderColorComboBox.getSelectedItem());
        tool = takeTool.get((String) figureChooseComboBox.getSelectedItem());

        this.add(figureChooseComboBox);
        this.add(borderColorComboBox);
        this.add(fillColorComboBox);

        grabFocus();
    }

    public Tools getTool() {
        return tool;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        figureChooseComboBox.setEnabled(true);
        borderColorComboBox.setEnabled(true);
        fillColorComboBox.setEnabled(true);
        for (Figure t : figures){
            actionChooser.get(t.getClass()).drawFigure(g2, t);
        }
    }

    public void setTool(Tools tool) {
        this.tool = tool;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public Color getFillColor() {
        return fillColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    public ArrayList<Point> getFigureDots() { return figureDots; }

    public ArrayList<Figure> getFigures() { return figures; }

}
