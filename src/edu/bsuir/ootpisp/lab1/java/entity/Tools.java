package edu.bsuir.ootpisp.lab1.java.entity;

public enum Tools {
    POLYGON(4, Integer.MAX_VALUE),
    RECTANGLE(2, 2),
    SQUARE(2, 2),
    TRIANGLE(3,3),
    ELLIPSE(2,2),
    CIRCLE(2,2),
    LINE(2,2);
    private int dotsMax;
    private int dotsMin;
    Tools(int dotsMin, int dotsMax){
        this.dotsMin = dotsMin;
        this.dotsMax = dotsMax;
    }

    public int getDotsMax() {
        return dotsMax;
    }

    public int getDotsMin() {
        return dotsMin;
    }
}
