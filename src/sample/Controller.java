package sample;

import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Controller {
    @FXML private ImageView imageView;

    public Controller() {}

    @FXML
    public void initialize() {
        try {
            BufferedImage originalImage = ImageIO.read(new File(Main.orignalImagePath));

            ImageProcessor.grayscale(originalImage);

            imageView.setImage(SwingFXUtils.toFXImage(originalImage, null));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
