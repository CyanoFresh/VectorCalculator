package com.cyanofresh;

public class Controller {
    public static double module(Vector v) {
        return Math.sqrt(v.x * v.x + v.y * v.y);
    }

    public static Vector sum(Vector v1, Vector v2) {
        Vector v = new Vector();
        v.x = v1.x + v2.x;
        v.y = v1.y + v2.y;
        return v;
    }

    public static Vector subtract(Vector v1, Vector v2) {
        Vector v = new Vector();
        v.x = v1.x - v2.x;
        v.y = v1.y - v2.y;
        return v;
    }

    public static int scalarMultiply(Vector v1, Vector v2) {
        return v1.x * v2.x + v1.y * v2.y;
    }
}
