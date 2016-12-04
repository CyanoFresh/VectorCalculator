package com.cyanofresh;

public class View {
    public static void display(double result) {
        System.out.print("Result: ");
        System.out.println(result);
    }

    public static void display(int result) {
        System.out.print("Result: ");
        System.out.println(result);
    }

    public static void displayVector(Vector v) {
        System.out.println("{X: " + v.x + ", y: " + v.y + "}");
    }
}
