package org.example;

public class Triangle extends Shape {

    private final Vector3D pointA;
    private final Vector3D pointB;
    private final Vector3D pointC;

    public Triangle(Vector3D pointA, Vector3D pointB, Vector3D pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    @Override
    public Hit hit(Ray ray) {
        Vector3D edge1 = pointB.subtract(pointA);
        Vector3D edge2 = pointC.subtract(pointA);
        Vector3D toRay = ray.getOrigin().subtract(pointA);
        Vector3D h = ray.getDirection().cross(edge2);
        double a = edge1.dot(h);

        if (Math.abs(a) < 0.0000001){
            return null;
        }

        double f = 1.0 / a;
        double u = f * toRay.dot(h);

        if (u < 0.0 || u > 1.0){
            return null;
        }

        Vector3D q = toRay.cross(edge1);
        double v = f * ray.getDirection().dot(q);

        if (v < 0.0 || u + v > 1.0) {
            return null;
        }

        double t = f * edge2.dot(q);

        if (t < 0.0) {
            return null;
        }

        return new Hit(t);
    }
}
