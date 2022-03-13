package com.company;

public class Point {
    private double x;
    private double y;

    Point(double x,double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
        System.out.println("setX done");
    }
    public void setY(double y) {
        this.y = y;
        System.out.println("setY done");
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static double distance(Point a,Point b) {
        return Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX())+(a.getY()-b.getY())*(a.getY()-b.getY()));
    }

    public static void Inline(Point a,Point b, Point c) {
        double d1,d2,d3;
        d1 = distance(a,b);
        d2 = distance(b,c);
        d3 = distance(a,c);
        if (d1+d2==d3 || d1+d3==d2 || d2+d3==d1) {
            System.out.println("a, b, c are inline");
        } else  {
            System.out.println("a, b, c aren't inline");
            System.out.printf("Chu vi : " + P(d1,d2,d3));
            System.out.printf("Dien tich : "+S(d1,d2,d3));
        }
    }

    public static double P(double a, double b, double c) { //distance of a,b,c
        return a + b + c;
    }

    public static double S(double a, double b, double c) { //distance of a,b,c
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
