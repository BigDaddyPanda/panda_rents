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
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
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
    @FXML
    private ImageView userIV, previewCarIV, previewCarIV1, previewCarIV2, previewCarIV3, previewCarIV4, previewCarIV5, userImageView;
    @FXML
    private AnchorPane mainPane;
    @FXML
    private VBox defaultCarPreviewVB;
    @FXML
    private Label carNameLabel, carNameLabel1, carNameLabel2, carNameLabel3, carNameLabel4, carNameLabel5, userNameLabel;
    @FXML
    private Button modifyCarBtn, rentCarBtn, modifyCarBtn1, rentCarBtn1, modifyCarBtn2, rentCarBtn2, modifyCarBtn3, rentCarBtn3, modifyCarBtn4, rentCarBtn4, modifyCarBtn5, rentCarBtn5, addCustomerBtn, addVehicleBtn, addEmployeeBtn, uploadBtn, confirmCarBtn, cancelCar, userUploadBtn, confirmCarBtn1, cancelCar1;

    @FXML
    private VBox defaultCarPreviewVB1;

    @FXML
    private VBox defaultCarPreviewVB2;

    @FXML
    private VBox defaultCarPreviewVB3;

    @FXML
    private VBox defaultCarPreviewVB4;

    @FXML
    private VBox defaultCarPreviewVB5;

    @FXML
    private TextField clientFilterTF, immatriculeTF, constructorTF, modelTF, speedTF, usernameTF, firstnameTF, lastnameTF, phoneTF;
    @FXML
    private Pane carPane;
    @FXML
    private ColorPicker colorTF;

    @FXML
    private Pane personPane;
    @FXML
    private RadioButton isRent, isRent1, isRent2, isRent3, isRent4, isRent5, dieselRB, gazRB, electricRB, isMrRB, isMrsRB;

    @FXML
    private CheckBox isAdminCB;
    @FXML
    private DatePicker birthdateDP;
    @FXML
    private TextArea addressTF;
    @FXML
    private AnchorPane userImageAP;
    @FXML
    private PasswordField passwordTF;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
//        String path = "@..\\..\\pictures\\carpic";
//        displaySP.isResizable();
//        File folder = new File(path);
//        File[] listOfFiles = folder.listFiles();
//
//        for (final File file : listOfFiles) {
//            VBox v = new VBox();
//            ImageView imageView;
//            imageView = FeaturedFunction.createImageView(file);
//            Button b = new Button("Rent This!");
//            v.getChildren().addAll(imageView, b);
//            displayTP.getChildren().addAll(v);
//        }
//        displaySP.setFitToWidth(true);
//        displaySP.setContent(displayTP);
    }

    @FXML
    private void modifyCar(ActionEvent event) {
    }

    @FXML
    private void rentCar(ActionEvent event) {
    }

    @FXML
    private void addPerson(ActionEvent event) {
    }

    @FXML
    private void addVehicle(ActionEvent event) {
    }

    @FXML
    private void filterClients(ActionEvent event) {
    }

    @FXML
    private void uploadCarPreview(ActionEvent event) {
    }

    @FXML
    private void confirmCar(ActionEvent event) {
    }

    @FXML
    private void cancel(ActionEvent event) {
    }

}
