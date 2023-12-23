package syllabustracker.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import syllabustracker.util.Database;

public class CourseRepo {

    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<String> courseIDs = new ArrayList<>();

    public ArrayList<String> getCourseIDs() {
        return courseIDs;
    }

    public void setCourseIDs(ArrayList<String> courseIDs) {
        this.courseIDs = courseIDs;
    }

    public void createCourse(String courseName, String courseID, Database db){

        Course newCourse = new Course(courseID, courseName, new ArrayList<Syllabus>(), new ArrayList<ChangeLog>());
        courses.add(newCourse);

        if(db.getConnection() == null){
            db.connect();
        }
       
        db.insertData("course",courseName,courseID);
        takeCourseIDs(db);

    

    }

    public void takeCourseIDs(Database db){
        final String query = "SELECT code FROM course;";

        if(db.getConnection() == null){
            db.connect();
        }
        
        try (ResultSet resultSet = db.executeQuery(query)) {
        
            while (resultSet.next()) {
                String courseId = resultSet.getString(1);
                courseIDs.add(courseId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }


   

    
    

    
}
