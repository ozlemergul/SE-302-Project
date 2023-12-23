package syllabustracker;



import javafx.application.Application;
import javafx.stage.Stage;
import syllabustracker.model.Course;
import syllabustracker.model.CourseRepo;
import syllabustracker.util.Database;
import syllabustracker.util.PageLoader;


public class MainApp extends Application{
    

    public static void main(String[] args) {

       Database db = new Database();
       db.connect();

       //CourseRepo courseRepo = new CourseRepo();
       
       //Course newCourse = courseRepo.createCourse("Fundamental Topics in Programming", "CE216", db);
       //newCourse.addSyllabus(1);

       launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        PageLoader.loadPage("/MainPage.fxml", primaryStage);
    }

    

   
    
}
