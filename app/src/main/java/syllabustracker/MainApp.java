package syllabustracker;

import javafx.application.Application;
import javafx.stage.Stage;
import syllabustracker.model.Assesment;
import syllabustracker.util.Database;
import syllabustracker.util.PageLoader;

import java.sql.ResultSet;

public class MainApp extends Application{
    

    public static void main(String[] args) {


       Database d = new Database();
       d.connect();
       d.insertData("assesment_2", 7,7,7,7,7,7,7,7);
       /*d.deleteData(1,"assesment_2");*/
       //d.displayRecords(d, "assesment_2");



    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        PageLoader.loadPage("/MainPage.fxml", primaryStage);
    }

    

   
    
}
