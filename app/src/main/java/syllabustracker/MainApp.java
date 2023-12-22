package syllabustracker;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.stage.Stage;
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

        ArrayList<String> lecturers = new ArrayList<>();
        ArrayList<String> assist = new ArrayList<>();
        ArrayList<String> loS = new ArrayList<>();

        lecturers.add("Lecturer1");
        lecturers.add("Lecturer2");
        assist.add("assist1");
        assist.add("assist2");
        loS.add("LO1");
        loS.add("LO2");


        GeneralInfo generalInfoTest = new GeneralInfo
        ("CE302",
        Term.Spring ,
        2,
        2, 
        2, 
        2, 
        " ",  
        Language.English, 
        CourseType.Required, 
        CourseLevel.FirstCycle, 
        "Some Teaching Methods", 
        "Cooordinator", 
        lecturers, 
        assist, 
        "some objectives", 
        loS, 
        "Some Descriptions"
        ,CourseCategory.Core
        );

        generalInfoTest.insertGeneralInfo(db, "testID");
    
       

       
       

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        PageLoader.loadPage("/MainPage.fxml", primaryStage);
    }

    

   
    
}
