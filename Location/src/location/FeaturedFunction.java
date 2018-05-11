/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package location;

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


    public static ImageView createImageView(String src,double a,double b) {
        // DEFAULT_THUMBNAIL_WIDTH is a constant you need to define
        // The last two arguments are: preserveRatio, and use smooth (slower)
        // resizing
        File imageFile=new File("C:/Users/ky94/OneDrive/Documents/TIC-S2/POO & JAVA/panda_rents/Location/pictures/"+src);
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
