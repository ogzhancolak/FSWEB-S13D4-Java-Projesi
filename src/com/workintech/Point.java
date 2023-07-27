package com.workintech;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return this.y;
    }

    public int getX() {
        return this.x;
    }

    public void setPoint(int x, int y) {
        if(x < 0 && y < 0) {
            this.x = 0;
            this.y = 0;
        } else {
            this.x = x;
            this.y = y;
        }
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    public double distance(Point p) {
        int xDiff = p.getX() - x;
        int yDiff = p.getY() - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double distance(int a, int b){
        int xDiff = a - x;
        int yDiff = b - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}
