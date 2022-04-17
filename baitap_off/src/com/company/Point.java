package com.company;

public class Point {
    public double x;
    public double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Point(Point point) {
        this.x = point.x;
        this.y = point.y;
    }

     double getX() {
        return this.x;
    }

    double getY() {
        return this.y;
    }

    void setX(double x) {
        this.x = x;
    }

    void setY(double y) {
        this.y = y;
    }

    double distance(Point p2) {
        return (this.x - p2.x)*(this.x - p2.x) + (this.y - p2.y)*(this.y - p2.y);
    }

    static void lineFunction(Point p1, Point p2) {
        System.out.println((p2.getY() - p1.getY()) + " (x - " + p1.getX() + ") + " + (p2.getX() - p1.getX()) + " * (y - " + p2.getY() + ")");
    }

    public static void checkPoint(Point p1, Point p2, Point p3) {
        double d1, d2, d3;
        d1 = p1.distance(p2);
        d2 = p1.distance(p3);
        d3 = p2.distance(p3);

        if(d1+d2==d3 || d1+d3==d2 || d2+d3==d1) {
            System.out.println("3 diem thang hang");
        } else {
            double p=d1+d2+d3;
            double v1 = (-d1 + p / 2) * (-d2 + p / 2) * (-d3 + p / 2);
            double S=Math.sqrt(p/2*v1);
            System.out.println("Dien tich : " + S);
        }
    }
}
