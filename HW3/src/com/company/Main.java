package com.company;

public class Main {

    public static void main(String[] args) {
        Point a = new Point(5,9);
        Point b = new Point(1,6);
        Point c = new Point(12,8);
        Point.Inline(a,b,c);

        System.out.println("\nbai2: stack test");
        Stack theStack = new Stack(10); //10 is size of stack
        theStack.push(10);
        theStack.push(20);
        theStack.push(30);
        theStack.push(40);
        theStack.push(50);
        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
