package syllabustracker;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.stage.Stage;
import syllabustracker.model.CourseRepo;
import syllabustracker.model.GeneralInfo;
import syllabustracker.model.enums.CourseCategory;
import syllabustracker.model.enums.CourseLevel;
import syllabustracker.model.enums.CourseType;
import syllabustracker.model.enums.Language;
import syllabustracker.model.enums.Term;
import syllabustracker.util.Database;
import syllabustracker.util.PageLoader;


public class MainApp extends Application{
    

    public static void main(String[] args) {

       Database db = new Database();
       db.connect();

       launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        PageLoader.loadPage("/MainPage.fxml", primaryStage);
    }

    

   
    
}
