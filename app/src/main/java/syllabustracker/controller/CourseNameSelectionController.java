package syllabustracker.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import syllabustracker.util.PageLoader;

import java.awt.*;

public class CourseNameSelectionController implements PageController{

    public TextArea courseName;
    @FXML
    private Stage primaryStage;


    @Override
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }



    public void cancelButton (ActionEvent event) {
        PageLoader.goPreviousPage(primaryStage);

    }


    public void saveButton () {

        String nameOfCourse= courseName.getText();
        System.out.println(nameOfCourse);
        PageLoader.closePage("/CourseNameSelection.fxml");
        CoursesPageController controller = new CoursesPageController();
        controller.addNewCourse(nameOfCourse);

    }






}
