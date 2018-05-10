/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package location;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ky94
 */
public class LandingController implements Initializable {

    @FXML
    private ScrollPane displaySP;
    @FXML
    private TilePane displayTP;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        String path = "C:\\Users\\ky94\\OneDrive\\Documents\\TIC-S2\\POO & JAVA\\FinalBoss\\Location\\pictures";
        displaySP.isResizable();
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        for (final File file : listOfFiles) {
            VBox v = new VBox();
            ImageView imageView;
            imageView = createImageView(file);
            Button b = new Button("Rent This!");
            v.getChildren().addAll(imageView,b);
            displayTP.getChildren().addAll(v);
        }
        displaySP.setFitToWidth(true);
        displaySP.setContent(displayTP);
    }    
    
    private ImageView createImageView(final File imageFile) {
        // DEFAULT_THUMBNAIL_WIDTH is a constant you need to define
        // The last two arguments are: preserveRatio, and use smooth (slower)
        // resizing

        ImageView imageView = null;
        try {
            final Image image = new Image(new FileInputStream(imageFile), 250, 170, true,
                    true);
            imageView = new ImageView(image);
            imageView.setFitWidth(250);
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
