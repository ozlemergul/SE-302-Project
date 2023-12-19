package syllabustracker.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import syllabustracker.MainApp;
import syllabustracker.controller.PageController;

import java.io.IOException;

public class PageLoader {
    
    public static void loadPage(String fxmlFileName, Stage primaryStage){

        try{
            // Set Scene
            FXMLLoader loader = new FXMLLoader(MainApp.class.getResource(fxmlFileName));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);

            // Set Controller
            PageController controller = loader.getController();
            controller.setPrimaryStage(primaryStage);

            // Show Page
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
