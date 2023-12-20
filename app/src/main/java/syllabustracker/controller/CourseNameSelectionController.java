package syllabustracker.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import syllabustracker.util.PageLoader;

public class CourseNameSelectionController implements PageController{

    @FXML
    private Stage primaryStage;

    @FXML
    public TextArea courseName;

    @Override
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }



    public void cancelButton (ActionEvent event) {
        PageLoader.closePage("/CourseNameSelection.fxml");

    }


    public void saveButton () {

        String nameOfCourse= courseName.getText();
        System.out.println(nameOfCourse);

        PageLoader.closePage("/CourseNameSelection.fxml");

        CoursesPageController controller = new CoursesPageController();
        controller.addNewButton(controller.coursesBox,nameOfCourse);

       

    }






}
