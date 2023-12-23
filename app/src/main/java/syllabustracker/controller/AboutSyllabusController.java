package syllabustracker.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import syllabustracker.util.PageLoader;

public class AboutSyllabusController implements PageController{

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
