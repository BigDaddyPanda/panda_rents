/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package location;

import entities.Person;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ky94
 */
public class LoginController implements Initializable {

    @FXML
    private ImageView loginbg;
    @FXML
    private PasswordField pwTF;
    @FXML
    private TextField usernameTF;
    @FXML
    private Button loginBtn;
    @FXML
    private AnchorPane loginAP;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO*
        loginAP.getChildren().remove(loginbg);
        loginbg = FeaturedFunction.createImageView("carpic/login.jpeg",500, 317);
        loginAP.getChildren().add(0, loginbg);
        loginbg.setCache(true);

    }

    @FXML
    private void login(ActionEvent event) {
        if (Person.authentificate(usernameTF.getText(), pwTF.getText())) {
            System.out.println(usernameTF.getText()+"+"+ pwTF.getText());
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Landing.fxml"));
            Parent page2 = null;
            try {
                page2 = fxmlLoader.load();
            } catch (IOException ex) {
                System.err.println("FXMLLoad ERROR");
            }
            
            Scene scene2 = new Scene(page2);
            Stage app_stage = (Stage) loginAP.getScene().getWindow();

            Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
            app_stage.setX(150);
            app_stage.setY(50);
            app_stage.setResizable(false);
            app_stage.setTitle("Welcome to PANDA-RENTZ");
            app_stage.setScene(scene2);
            app_stage.show();
        } else {
            usernameTF.getStylesheets().add("-fx-border-color:red");
            System.out.println("Bad entry");
        }
    }

}
