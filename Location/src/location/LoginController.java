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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
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
    private TextField pwTF;
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
        loginbg = FeaturedFunction.importImageView(new File("C:\\Users\\ky94\\OneDrive\\Documents\\TIC-S2\\POO & JAVA\\panda_rents\\Location\\pictures\\carpic\\login.jpeg"));
     
    }

    @FXML
    private void login(ActionEvent event) {
        if (Person.authentificate(usernameTF.getText(), pwTF.getText())) {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Landing.fxml"));
            Parent page2 = null;
            try {
                page2 = fxmlLoader.load();
            } catch (IOException ex) {
                System.err.println("FXMLLoad " + ex);
            }

            Scene scene2 = new Scene(page2);
            Stage app_stage = (Stage) loginAP.getScene().getWindow();

            app_stage.setTitle("Welcome to PANDA-AIRLINES");
            app_stage.setScene(scene2);
            app_stage.show();
        } else {
            System.out.println("Bad entry");
        }
    }

}
