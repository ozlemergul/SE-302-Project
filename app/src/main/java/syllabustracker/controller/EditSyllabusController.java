package syllabustracker.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import syllabustracker.util.PageLoader;

public class EditSyllabusController implements PageController{


    @FXML
    private Stage primaryStage;

    @FXML
    private TextField courseName;

    @FXML
    private TextField courseID;

    @FXML
    private TextField semester;

    @Override
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @FXML
    public void cancelButton (ActionEvent event) {
        PageLoader.goPreviousPage(primaryStage);

    }

    @FXML
    public void saveSyllabus(ActionEvent event) {

        try {
            String courseNameF = courseName.getText();
            
            String courseIDF = courseID.getText();

            int courseSemester = Integer.parseInt(semester.getText());
        } catch(Exception e) {
            
        }
        //PageLoader.showAnotherPage("/SavingScreen.fxml");
    }


}
