package syllabustracker;

import javafx.application.Application;
import javafx.stage.Stage;
import syllabustracker.util.PageLoader;

public class MainApp extends Application{
    

    public static void main(String[] args) {
       launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        PageLoader.loadPage("/MainPage.fxml", primaryStage);
    }

    

   
    
}
