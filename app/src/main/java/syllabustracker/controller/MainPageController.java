package syllabustracker.controller;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import syllabustracker.util.PageLoader;

public class MainPageController implements PageController{

    @FXML
    private Stage primaryStage;

    @Override
    public void setPrimaryStage(Stage primaryStage) {
       this.primaryStage = primaryStage;
    }
    
    @FXML
    private void createNewCourse (ActionEvent event) {
        PageLoader.loadPage("/NewCoursePage.fxml", primaryStage);
        
    }

    @FXML
    private void goToCoursesPage (ActionEvent event) {
        PageLoader.loadPage("/CoursesPage.fxml", primaryStage);
    }
  
}
