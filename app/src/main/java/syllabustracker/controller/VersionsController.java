package syllabustracker.controller;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;
import syllabustracker.util.PageLoader;

public class VersionsController implements PageController,Initializable{

    public ChoiceBox Version1;
    public ChoiceBox Version2;
    @FXML
    private Stage primaryStage;

    @Override
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @FXML
    private void backButton (ActionEvent event) {
        PageLoader.goPreviousPage(primaryStage);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

    @FXML
    private void compareVersionsButton (ActionEvent event) {
        PageLoader.loadPage("/CompareSyllabus.fxml", primaryStage);

    }







}
