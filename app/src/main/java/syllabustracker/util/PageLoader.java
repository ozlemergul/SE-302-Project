package syllabustracker.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import syllabustracker.MainApp;
import syllabustracker.controller.PageController;
import syllabustracker.model.Course;

import java.io.IOException;
import java.util.HashMap;
import java.util.Stack;

public class PageLoader {

    private static HashMap<String, Stage> openPages = new HashMap<>();
    private static Stack<Scene> sceneStack = new Stack<>();


    public static void loadPage(String fxmlFileName, Stage primaryStage){

        try{
            // Set Scene
            FXMLLoader loader = new FXMLLoader(MainApp.class.getResource(fxmlFileName));
            Parent root = loader.load();
            Scene scene = new Scene(root);

            if (primaryStage.getScene() != null) {
                sceneStack.push(primaryStage.getScene());
            }

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

    public static void loadSyllabusPage(Stage primaryStage, Course course){

        String courseCode = course.getCourseID();
        String syllabusID = course.getSyllabi().get(course.getSyllabi().size() - 1).getSyllabusID();

        

        try{
            // Set Scene
            FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/Syllabus.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);

            if (primaryStage.getScene() != null) {
                sceneStack.push(primaryStage.getScene());
            }

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

    private void takeSyllabusComponents(Database db,String courseCode,String syllabusID){

        


    }


    public static void showAnotherPage(String fxmlFileName) {

        try{
            FXMLLoader loader = new FXMLLoader(MainApp.class.getResource(fxmlFileName));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage newStage = new Stage();
            newStage.setScene(scene);

            // Set Controller
            PageController controller = loader.getController();
            controller.setPrimaryStage(newStage);

            // Add the new stage to the openPages map
            openPages.put(fxmlFileName, newStage);

            // Show Page
            newStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void closePage(String fxmlFileName) {
        if (openPages.containsKey(fxmlFileName)) {
            Stage stage = openPages.get(fxmlFileName);
            stage.close();
            openPages.remove(fxmlFileName);
        }
    }

    public static void goPreviousPage(Stage primaryStage) {
        if (!sceneStack.isEmpty()) {
            Scene previousScene = sceneStack.pop();
            primaryStage.setScene(previousScene);
        }
    }



    
}
