package com.cyanofresh;

public class Main {

    public static void main(String[] args) {
        Vector v1 = new Vector(3, 3);
        Vector v2 = new Vector(2, 3);

        View.display(Controller.module(v1));
        View.displayVector(Controller.sum(v1, v2));
        View.displayVector(Controller.subtract(v1, v2));
        View.display(Controller.scalarMultiply(v1, v2));
    }

}
