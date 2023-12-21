package syllabustracker.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import syllabustracker.util.PageLoader;

public class CoursesPageController implements PageController{

    @FXML
    private Stage primaryStage;

    @FXML
    public VBox coursesBox = new VBox();
    

    @Override
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @FXML
    public void addNewCourseButton (ActionEvent event) {
        PageLoader.loadPage("/EditSyllabus.fxml", primaryStage);
    }

    public void addNewButton(VBox vBox, String name) {
        Button newButton = new Button(name);
        coursesBox.getChildren().add(newButton);
    }







    


    
}
