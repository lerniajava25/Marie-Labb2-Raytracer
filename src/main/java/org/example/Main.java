package org.example;

public class Main {

   public static void main(String[] args) {

        Vector3D a = new Vector3D(1, 2, 3);
        Vector3D b = new Vector3D(4, 5, 6);

        System.out.println("X: " + a.getX());
        System.out.println("Y: " + a.getY());
        System.out.println("Z: " + a.getZ());

        Vector3D sum = a.add(b);
        System.out.println("Add: "
                + sum.getX() + ", "
                + sum.getY() + ", "
                + sum.getZ());

        Vector3D difference = a.subtract(b);
        System.out.println("Subtract: "
                + difference.getX() + ", "
                + difference.getY() + ", "
                + difference.getZ());

        Vector3D multiplied = a.multiply(2);
        System.out.println("Multiply: "
                + multiplied.getX() + ", "
                + multiplied.getY() + ", "
                + multiplied.getZ());

        System.out.println("Length: " + a.length());

        System.out.println("Original a: "
                + a.getX() + ", "
                + a.getY() + ", "
                + a.getZ());

        Vector3D result = a.add(b);

        System.out.println("a efter add: "
                + a.getX() + ", "
                + a.getY() + ", "
                + a.getZ());

        System.out.println("result: "
                + result.getX() + ", "
                + result.getY() + ", "
                + result.getZ());

        Vector3D vector = new Vector3D(3, 4, 0);
        Vector3D normalized = vector.normalize();

        System.out.println("Normalized: "
                + normalized.getX() + ", "
                + normalized.getY() + ", "
                + normalized.getZ());

        System.out.println("Normalized length: " + normalized.length());
    }


}
