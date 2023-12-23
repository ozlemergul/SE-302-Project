package syllabustracker.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import syllabustracker.model.CourseRepo;
import syllabustracker.util.Database;
import syllabustracker.util.PageLoader;

public class CoursesPageController implements PageController,Initializable{

    @FXML
    private Stage primaryStage;

    @FXML
    public VBox coursesBox;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        System.out.println("Hello");

        Database db = new Database();
        if(db.getConnection() == null){
            db.connect();
        }

        CourseRepo courseRepo = new CourseRepo();
        courseRepo.takeCourseIDs(db);

        for (String courseName : courseRepo.getCourseIDs()) {
            Button button = new Button(courseName);
            button.setMaxWidth(Double.MAX_VALUE);
            button.setPrefHeight(60);
            button.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    PageLoader.loadPage("", primaryStage);
                }

            });
            coursesBox.getChildren().add(button);
        }
    }

    @Override
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @FXML
    public void addNewCourseButton (ActionEvent event) {
        PageLoader.loadPage("/EditSyllabus.fxml", primaryStage);
    }


   







    


    
}
