package sample;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ImageProcessor {
    public static void grayscale(BufferedImage image) {
        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                Color rgb = new Color(image.getRGB(i, j));

                int red = rgb.getRed();
                int blue = rgb.getBlue();
                int green = rgb.getGreen();

                int gray = (red + blue + green) / 3;

                image.setRGB(i, j, new Color(gray, gray, gray).getRGB());
            }
        }
    }
}
