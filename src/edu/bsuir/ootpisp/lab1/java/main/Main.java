package edu.bsuir.ootpisp.lab1.java.main;

import edu.bsuir.ootpisp.lab1.java.entity.PaintPanel;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame paint = new JFrame("Figure Painter");
        paint.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container pane = paint.getContentPane();
        pane.setLayout(new BorderLayout());
        PaintPanel renderPanel = new PaintPanel();

        pane.add(renderPanel, BorderLayout.CENTER);
        paint.setSize(800, 600);
        paint.setVisible(true);
    }

}