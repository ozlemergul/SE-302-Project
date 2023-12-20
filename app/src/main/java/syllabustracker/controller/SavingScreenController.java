package syllabustracker.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import syllabustracker.util.PageLoader;

public class SavingScreenController implements PageController{

    @FXML
    private Stage primaryStage;

    @Override
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void closeSavingScreen() {
        PageLoader.closePage("/SavingScreen.fxml");
    }







}
