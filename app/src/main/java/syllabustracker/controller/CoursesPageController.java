package syllabustracker.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import syllabustracker.util.PageLoader;

public class CoursesPageController implements PageController{

    public VBox coursesBox;

    @FXML
    private Stage primaryStage;
    

    @Override
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void addNewCourseButton (ActionEvent event) {
        PageLoader.showAnotherPage("/CourseNameSelection.fxml");
    }

    public void addNewCourse (String name) {

        addNewButton(coursesBox,name);

    }

    public void addNewButton(VBox vBox, String name) {
        Button newButton = new Button(name);
        coursesBox.getChildren().add(newButton);
    }





    


    
}
