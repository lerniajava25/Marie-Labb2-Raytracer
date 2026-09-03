package org.example;

public class Main {

   static void main(String[] args) {

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

      // Vector3D zero = new Vector3D(0, 0, 0);
       //Vector3D normalizedZero = zero.normalize();

       //System.out.println("Zero normalized: "
         //      + normalizedZero.getX() + ", "
           //    + normalizedZero.getY() + ", "
             //  + normalizedZero.getZ());

       //Vector3D origin = new Vector3D(0, 0, 0);
       //Vector3D direction = new Vector3D(1, 2, 3);

      // Ray ray = new Ray(origin, direction);

       //Vector3D point = ray.at(2);

       //System.out.println("Ray at 2: "
         //      + point.getX() + ", "
           //    + point.getY() + ", "
             //  + point.getZ());

       Color red = new Color(1.0, 0.0, 0.0);
       Color green = new Color(0.0, 1.0, 0.0);

       Color colorSum = red.add(green);
       System.out.println("Color: "
               + colorSum.getRed() + ", "
               + colorSum.getGreen() + ", "
               + colorSum.getBlue());

       Color colorMultiplied = red.multiply(0.5);
       System.out.println("Multiply: "
               + colorMultiplied.getRed() + ", "
               + colorMultiplied.getGreen() + ", "
               + colorMultiplied.getBlue());

       Color testClamp = new Color(1.5, -0.5, 0.5);
       IO.println("Clamp: "
       + testClamp.getRed() + ", "
       + testClamp.getGreen() + ", "
       + testClamp.getBlue());

       //Hit hit = new Hit(2.5);
       //IO.println( "Hit: "
       //+ hit.getT());

       //Sphere sphere = new Sphere(new Vector3D(0,0,0), 2.0);
       //IO.println( "Sphere: " +
        //       sphere);

       Sphere sphere = new Sphere(new Vector3D(0,0,0), 2.0);
       Ray ray = new Ray(
               new Vector3D(0,0,0),
               new Vector3D(1,0,0)
       );

       Hit hit = sphere.hit(ray);

       if (hit != null) {
           IO.println("Träff vi t: " + hit.getT());
       } else {
           IO.println(" Ingen träff");
       }

    }


}
