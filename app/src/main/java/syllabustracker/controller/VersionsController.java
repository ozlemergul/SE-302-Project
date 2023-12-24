package syllabustracker.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;
import syllabustracker.util.PageLoader;

public class VersionsController implements PageController{

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







}
