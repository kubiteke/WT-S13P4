package org.example;

public class Point {
    private int x;
    private int y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    // distance() -> (0,0)'a göre mesafe
    public double distance(){
        return Math.sqrt((x*x) + (y*y));
    }


    // distance(Point p) -> başka bir noktaya göre mesafe
    public double distance(Point p){
        return Math.sqrt((p.x-this.x) + (p.y-this.y));

    }
    // distance(int a, int b) -> verilen koordinata göre mesafe
    public double distance(int a, int b){
        return Math.sqrt((a - this.x) * (a - this.x) +
                (b - this.y) * (b - this.y));
    }
}

