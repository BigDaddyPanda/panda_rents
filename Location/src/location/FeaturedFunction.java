/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package location;

import dbconnexion.Auth;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author soula
 */
public class FeaturedFunction {

    public static Image createImage(String src, double a, double b) {
        File imageFile = new File(Auth.image_directory+ src);

        try {
            return new Image(new FileInputStream(imageFile), a, b, true, true);

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        System.out.println("Ouch can't create this image");
        return null;
    }
    public static Image createImage(String src) {
        File imageFile = new File(Auth.image_directory+ src);

        try {
            return new Image(new FileInputStream(imageFile));

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        System.out.println("Ouch this imageview can't be viewed");
        return null;
    }

    public static ImageView createImageView(String src, double a, double b) {
        // DEFAULT_THUMBNAIL_WIDTH is a constant you need to define
        // The last two arguments are: preserveRatio, and use smooth (slower)
        // resizing
        File imageFile = new File(Auth.image_directory + src);
        ImageView imageView = null;
        try {
            final Image image = new Image(new FileInputStream(imageFile), a, b, true,
                    true);
            imageView = new ImageView(image);
            imageView.setFitWidth(a);
            imageView.setOnMouseClicked(new EventHandler<MouseEvent>() {

                @Override
                public void handle(MouseEvent mouseEvent) {
                    System.out.println("Hello");
                }
            });
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return imageView;
    }
}
