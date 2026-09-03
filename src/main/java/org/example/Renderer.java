package org.example;

import java.awt.image.BufferedImage;

public class Renderer {
    private final int width;
    private final int height;

    public Renderer(int width, int height){
        this.width = width;
        this.height = height;

    }

    public BufferedImage render(Scene scene) {
        BufferedImage image = new BufferedImage(
                width,
                height,
                BufferedImage.TYPE_INT_RGB
        );

        Vector3D camera = new Vector3D(0, 0, 0);
        double aspectRatio = (double) width / height;

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++){
                double pixelX = (2.0 * x / width - 1.0) * aspectRatio;
                double pixelY = 1.0 - 2.0 * y / height;
                Vector3D direction = new Vector3D(pixelX, pixelY, -1).normalize();
                Ray ray = new Ray(camera, direction);
                Hit hit = scene.hit(ray);

                if (hit != null) {
                    if (hit.getShape() instanceof Sphere) {
                        image.setRGB(x, y, java.awt.Color.RED.getRGB());
                    } else if (hit.getShape() instanceof Triangle) {
                        image.setRGB(x, y, java.awt.Color.BLUE.getRGB());
                    }
                } else {
                    image.setRGB(x, y, java.awt.Color.BLACK.getRGB());
                }
            }

        }

        return image;
    }
}
