package org.example;

public final class Color {

    private final double red;
    private final double green;
    private final double blue;

    public Color(double red, double green, double blue) {
        this.red = clamp(red);
        this.green = clamp(green);
        this.blue = clamp(blue);
    }

    public double getRed() {
        return red;
    }

    public double getGreen() {
        return green;
    }

    public double getBlue() {
        return blue;
    }

    public Color add(Color other) {
        return new Color(
                this.red + other.red,
                this.green + other.green,
                this.blue + other.blue
        );
    }

    public Color multiply(double scalar){
        return new Color(
                this.red * scalar,
                this.green * scalar,
                this.blue * scalar
        );
    }

    private double clamp(double value) {
       return Math.clamp(value, 0.0, 1.0);
    }
}
