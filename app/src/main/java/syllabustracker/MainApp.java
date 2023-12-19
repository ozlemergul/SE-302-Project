package syllabustracker;

import javafx.application.Application;
import javafx.stage.Stage;
import syllabustracker.util.Database;
import syllabustracker.util.PageLoader;

import java.sql.ResultSet;

public class MainApp extends Application{
    

    public static void main(String[] args) {


       Database d = new Database();
       d.connect();


    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        PageLoader.loadPage("/MainPage.fxml", primaryStage);
    }

    

   
    
}
