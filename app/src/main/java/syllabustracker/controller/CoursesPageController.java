package syllabustracker.controller;

import java.net.URL;
import java.sql.SQLException;
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

        // Database connection
        Database db = new Database();

        try {
            if(db.getConnection() == null || db.getConnection().isClosed()){
                db.connect();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Showing course list with buttons
        CourseRepo courseRepo = new CourseRepo();
        courseRepo.readCourseIDs(db);

        for (String courseID : courseRepo.getCourseIDs()) {
            Button button = new Button(courseID);
            button.setMaxWidth(Double.MAX_VALUE);
            button.setPrefHeight(60);
            button.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {

                    openSyllabusPage(courseID);
                }

            });
            coursesBox.getChildren().add(button);
        }

    }

    private void openSyllabusPage(String courseID) {
        PageLoader.loadPage("/Syllabus.fxml", primaryStage, courseID);
    }

    @Override
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @FXML
    public void addNewCourseButton (ActionEvent event) {
        PageLoader.loadPage("/CreateSyllabus.fxml", primaryStage);
    }

    @FXML
    public void goBack (ActionEvent event) {
        PageLoader.loadPage("/MainPage.fxml", primaryStage);
    }

    @FXML
    public void deleteCourse (ActionEvent event) {
        
    }




   







    


    
}
