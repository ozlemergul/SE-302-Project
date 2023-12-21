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

    public void takeCourseIDs(Database db){
        final String query = "SELECT course_id FROM course;";

        if(db.getConnection() == null){
            db.connect();
        }
        
        try (ResultSet resultSet = db.executeQuery(query)) {
            while (resultSet.next()) {
                String courseId = resultSet.getString(1);
                courseIDs.add(courseId);
                System.out.println(courseId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    
    

    
}
