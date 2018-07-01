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
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
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
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
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
    @FXML
    private Button exitBtn;
    @FXML
    private Pane errorPane;
    @FXML
    private ImageView logo;
    @FXML
    private Label signupL;
    @FXML
    private Pane sErrP;
    @FXML
    private Pane passErrP;
    @FXML
    private TextField scinTF;
    @FXML
    private PasswordField spwTF;
    @FXML
    private Button signupBtn;
    @FXML
    private Label loginL;
    @FXML
    private TextField susernameTF;
    @FXML
    private PasswordField scpwTF;
    @FXML
    private Pane loginPane;
    @FXML
    private Pane signupPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loginPane.visibleProperty().bind(signupPane.visibleProperty().not());
        loginPane.disableProperty().bind(signupPane.visibleProperty());
        signupPane.disableProperty().bind(loginPane.visibleProperty());

        passErrP.visibleProperty().bind(spwTF.textProperty().isEqualTo(scpwTF.textProperty()).not());
        loginbg.setImage(FeaturedFunction.createImage("carpic/login.jpeg"));

        loginbg.setCache(true);
        logo.setImage(FeaturedFunction.createImage("logo.png"));

    }

    @FXML
    private void login(ActionEvent event) {
        if (Person.authentificate(usernameTF.getText(), pwTF.getText())) {
            System.out.println(usernameTF.getText() + "+" + pwTF.getText());
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
            errorPane.setVisible(true);
            System.out.println("Bad entry");
        }
    }

    @FXML
    private void exit(ActionEvent event) {
        dbconnexion.db_cnx.deconnecter();
        System.exit(0);
        System.out.println("I AM OUT OF HERE");
    }

    @FXML
    private void move(MouseEvent event) {
        System.out.println("GET ME OUT OF HERE");
    }

    @FXML
    private void loadsignup(MouseEvent event) {
        signupPane.setVisible(true);
    }

    @FXML
    private void loadlogin(MouseEvent event) {
        signupPane.setVisible(false);

    }

    @FXML
    private void signup(ActionEvent event) {
        if (Person.signup(new Person(scinTF.getText(), susernameTF.getText(), spwTF.getText()))) {
            System.out.println(usernameTF.getText() + "+" + pwTF.getText());

        } else {
            sErrP.setVisible(true);
            System.out.println("Bad entry");
        }
        System.out.println("");
    }

    @FXML
    private void removeErrorP(MouseEvent event) {
        errorPane.setVisible(false);
    }

    @FXML
    private void removesErrorP(MouseEvent event) {
        sErrP.setVisible(false);
    }

}
