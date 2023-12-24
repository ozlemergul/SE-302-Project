package syllabustracker.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import syllabustracker.model.CourseRepo;
import syllabustracker.util.Database;
import syllabustracker.util.PageLoader;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class MainPageController implements PageController{

    @FXML
    private Stage primaryStage;

    @Override
    public void setPrimaryStage(Stage primaryStage) {
       this.primaryStage = primaryStage;
    }
    
    @FXML
    private void createNewCourse (ActionEvent event) {
        PageLoader.loadPage("/CreateSyllabus.fxml", primaryStage);
        
    }

    @FXML
    private void goToCoursesPage (ActionEvent event) {
        
        PageLoader.loadPage("/CoursesPage.fxml", primaryStage);
        
    }

    public void help() {
        Platform.runLater(() -> {
            try {
                File pdfFile = new File("src/Help.pdf"); // Replace with your PDF file path
                if (pdfFile.exists()) {
                    if (Desktop.isDesktopSupported()) {
                        Desktop.getDesktop().open(pdfFile);
                    } else {
                        System.out.println("Desktop not supported");
                        // Handle error or prompt the user to open the file manually
                    }
                } else {
                    System.out.println("File not found");
                    // Handle file not found scenario
                }
            } catch (IOException e) {
                e.printStackTrace();
                // Handle IOException
            }
        });
    }
  
}
