package org.example;

public final class Ray {

    private final Vector3D origin;
    private final Vector3D direction;

    public Ray(Vector3D origin, Vector3D direction){
        this.origin = origin;
        this.direction = direction.normalize();
    }

    public Vector3D getOrigin() {
        return this.origin;
    }

    public Vector3D getDirection() {
        return this.direction;
    }

    public Vector3D at(double t) {
        return this.origin.add(this.direction.multiply(t));
    }
}
