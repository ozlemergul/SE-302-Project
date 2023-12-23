package syllabustracker.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

    public Course createCourse(String courseName, String courseID, Database db){
        
        // Object initialization
        Course newCourse = new Course(courseID, courseName, new ArrayList<Syllabus>(), new ArrayList<ChangeLog>());
        courses.add(newCourse);

        // Database insert
        if(db.getConnection() == null){
            db.connect();
        }
        db.insertData("course",courseName,courseID);
        // Update courseIDs
        takeCourseIDs(db);

        return newCourse;
    }

    public void takeCourseIDs(Database db){
        final String query = "SELECT code FROM course;";

        if(db.getConnection() == null){
            db.connect();
        }
        
        try (Connection conn = db.getConnection();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query)){
            while(rs.next()){
                courseIDs.add(rs.getString("code"));
            }
            }
        catch (SQLException e) {
            e.printStackTrace();
        }
        
        db.close();
    }
    
    }


   

    
    

    

