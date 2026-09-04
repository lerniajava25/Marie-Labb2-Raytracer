package org.example;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

   static void main(String[] args) throws IOException {

       Sphere sphere = new Sphere(
               new Vector3D(-0.7,0,-3), 0.5);


       Triangle triangle= new Triangle(
               new Vector3D(0.2,-0.5,-3),
       new Vector3D(1.2,-0.5,-3),
       new Vector3D(0.7,0.5,-3)
       );


       Scene scene = new Scene();
       scene.addShape(triangle);
       scene.addShape(sphere);
       Renderer renderer = new Renderer(800, 600);

       BufferedImage image = renderer.render(scene);
       ImageIO.write(image, "png", new File("raytracer.png"));



    }


}
