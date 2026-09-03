package org.example;

public class Sphere extends Shape{

    private final Vector3D center;
    private final double radius;

    public Sphere (Vector3D center, double radius) {
        this.center = center;
        this.radius = radius;

    }

    @Override
    public Hit hit(Ray ray) {
        Vector3D toCenter = center.subtract(ray.getOrigin());
        double distance = toCenter.length();
        Vector3D direction = ray.getDirection().normalize();
        double projection = toCenter.dot(direction);

        double distanceSquared = distance * distance - projection * projection;

        if (distanceSquared > radius * radius) {
            return null;
        }

        double offset = Math.sqrt(radius * radius - distanceSquared);
        double t0 = projection - offset;
        double t1 = projection + offset;

        double t = t0;

        if (t < 0) {
            t = t1;
        }

        if (t < 0) {
            return null;
        }

        return new Hit(t, this);

    }
}
