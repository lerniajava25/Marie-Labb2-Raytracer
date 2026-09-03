package org.example;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    private final List<Shape> shapes =new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public Hit hit(Ray ray) {
        Hit closestHit = null;

        for (Shape shape : shapes){
            Hit hit = shape.hit(ray);

            if (hit != null) {
                if (closestHit == null || hit.getT() < closestHit.getT()){
                    closestHit = hit;
                }
            }

        }
        return closestHit;

    }
}
