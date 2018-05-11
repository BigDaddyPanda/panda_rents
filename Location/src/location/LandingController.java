/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package location;

import dbconnexion.Auth;
import entities.Car;
import entities.Creation;
import entities.Display;
import entities.Person;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
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
    private ImageView userIV, previewCarIV, userImageView;
    @FXML
    private AnchorPane mainPane;
    @FXML
    private VBox defaultCarPreviewVB;
    @FXML
    private Label carNameLabel, userNameLabel;
    @FXML
    private Button modifyCarBtn, rentCarBtn, addCustomerBtn, addVehicleBtn, uploadBtn, confirmCarBtn, cancelCar, userUploadBtn, confirmCarBtn1, cancelCar1;

    @FXML
    private TextField clientFilterTF, immatriculeTF, constructorTF, modelTF, speedTF, usernameTF, firstnameTF, lastnameTF, phoneTF;
    @FXML
    private Pane carPane;
    @FXML
    private TextField colorTF;

    @FXML
    private Pane personPane;
    @FXML
    private RadioButton isRent, dieselRB, gazRB, electricRB, isMrRB, isMrsRB;

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
    @FXML
    private AnchorPane userAP;
    @FXML
    private Pane userimagePane;
    @FXML
    private TableView<Person> personsTV;
    @FXML
    private TableColumn<Person, RadioButton> isAdminTC;
    @FXML
    private TableColumn<Person, String> personNameTC;
    @FXML
    private TextField filterCarBySerie;
    @FXML
    private TextField filterCarByImmBtn;
    @FXML
    private TextField filterCarByBrand;
    @FXML
    private Pane rentaCarPane;
    @FXML
    private ChoiceBox<?> renterCB;
    @FXML
    private ChoiceBox<?> availableCarsCB;
    @FXML
    private DatePicker rentStartDate;
    @FXML
    private DatePicker rentEndDate;
    @FXML
    private TextField rentPrice;
    @FXML
    private CheckBox confirmEULA;
    @FXML
    private Button confirmRent;
    @FXML
    private Button cancelCar11;
    @FXML
    private Button confirmRent1;
    @FXML
    private BorderPane buttomBtns;
    @FXML
    private AnchorPane LANDINGAP;
    @FXML
    private TextField seatsTF;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        userNameLabel.setText(Auth.USERNAME);
        userIV = FeaturedFunction.createImageView("userpic/boss.png", 70, 70);
        userimagePane.getChildren().add(userIV);
        ArrayList<Person> P = Display.load_Persons();
        ArrayList<Car> C = Display.loadAllCars();
        ArrayList<Car> RC = Display.loadRentedCars();

//        displaySP.isResizable();
//
//        String path = "@..\\..\\pictures\\carpic";
//        File folder = new File(path);
//        File[] listOfFiles = folder.listFiles();
//        for (final File file : listOfFiles) {
//            VBox v = defaultCarPreviewVB;
//            System.out.println(defaultCarPreviewVB.getChildren().toString());
//        }
        for (Person p : P) {
            displayTP.getChildren().addAll(defaultCarPreviewVB);
        }
        displaySP.setFitToWidth(true);
        displaySP.setContent(displayTP);
    }

    @FXML
    private void modifyCar(ActionEvent event) {
    }

    @FXML
    private void rentCar(ActionEvent event) {
    }

    @FXML
    private void addPerson(ActionEvent event) {
        personPane.setVisible(true);
        personPane.setDisable(false);
        carPane.setVisible(false);
        carPane.setDisable(false);
        mainPane.setOpacity(0.40);

    }

    @FXML
    private void addVehicle(ActionEvent event) {
        carPane.setVisible(true);
        carPane.setDisable(false);
        personPane.setVisible(false);
        personPane.setDisable(false);
        mainPane.setOpacity(0.40);
//        mainPane.setDisable(true);
//        mainPane.setDisable(true);
    }

    @FXML
    private void filterClients(ActionEvent event) {
    }

    @FXML
    private void uploadCarPreview(ActionEvent event) {

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Uplaod Image");
        Stage app_stage = (Stage) LANDINGAP.getScene().getWindow();
        File file = fileChooser.showOpenDialog(app_stage);
        if (file != null) {
            System.out.println(file.getName());
            imageurl = file.getName();
        }
    }
    String imageurl;

    @FXML
    private void confirmCar(ActionEvent event) {
        Creation.addCar(new Car(immatriculeTF.getText(), constructorTF.getText(),
                modelTF.getText(), Integer.parseInt(speedTF.getText()), colorTF.getText(),
                Integer.parseInt(seatsTF.getText()), "Diesel", imageurl));
    }

    @FXML
    private void cancel(ActionEvent event) {
        HIDETHEMPANES();
    }

    @FXML
    private void hidePanes(MouseEvent event) {
//        HIDETHEMPANES();
    }

    private void HIDETHEMPANES() {

        mainPane.setOpacity(1.0);
        mainPane.setDisable(false);

        carPane.setDisable(true);
        carPane.setVisible(false);
        personPane.setDisable(true);
        personPane.setVisible(false);
    }

    @FXML
    private void filterCarBy(ActionEvent event) {
    }

    @FXML
    private void confirmRent(ActionEvent event) {
    }

    @FXML
    private void destroyRent(ActionEvent event) {
    }

}
