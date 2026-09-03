package org.example;

public final class Vector3D {

    private final double x;
    private final double y;
    private final double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public Vector3D add(Vector3D other) {
        return new Vector3D(
                this.x + other.x,
                this.y + other.y,
                this.z + other.z
        );
    }

    public Vector3D subtract(Vector3D other){
        return new Vector3D(
                this.x - other.x,
                this.y - other.y,
                this.z - other.z
        );
    }

    public Vector3D multiply(double scalar){
        return new Vector3D(
                this.x * scalar,
                this.y * scalar,
                this.z * scalar
        );
    }

    public double length () {
        return Math.sqrt(
                this.x * this.x +
                        this.y * this.y +
                        this.z * this.z
        );
    }

    public Vector3D normalize() {
        double vectorLength = length();

        if (vectorLength == 0.0) {
            throw new IllegalStateException("Kan inte normalisera en vektor med längd 0");
        }
        return this.multiply(1.0/vectorLength);
    }

    public double dot(Vector3D other) {
        return this.x * other.x
                + this.y * other.y
                + this.z * other.z;
    }

    public Vector3D cross(Vector3D other) {
        return new Vector3D(
                this.y * other.z - this.z * other.y,
                this.z * other.x - this.x * other.z,
                this.x * other.y - this.y * other.x
        );
    }
}
