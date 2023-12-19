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

       //d.insertData("assesment_2",1,1,1,1,1,1,1,1);

       //d.deleteColumnData(1,"number","assesment_2");
       d.displayRecords("assesment_2");


    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        PageLoader.loadPage("/MainPage.fxml", primaryStage);
    }

    

   
    
}
