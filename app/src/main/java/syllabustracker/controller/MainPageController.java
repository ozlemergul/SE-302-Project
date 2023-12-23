package syllabustracker.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import syllabustracker.model.CourseRepo;
import syllabustracker.util.Database;
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
        PageLoader.loadPage("/EditSyllabus.fxml", primaryStage);
        
    }

    @FXML
    private void goToCoursesPage (ActionEvent event) {
        
        PageLoader.loadPage("/CoursesPage.fxml", primaryStage);
        
    }
  
}
