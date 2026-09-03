package org.example;

public final class Hit {
    private final double t;
    private final Shape shape;

    public Hit (double t, Shape shape) {
        this.t= t;
        this.shape = shape;
    }
     public double getT() {
        return t;
    }

    public Shape getShape() {
        return shape;
    }
}
