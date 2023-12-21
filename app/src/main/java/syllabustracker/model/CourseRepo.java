package syllabustracker.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    public void takeCourses(Database db) {
        if (db == null || !db.isConnected()) {
            System.out.println("Database is not connected.");
            return;
        }

        final String query = "SELECT course_id FROM course;";

        db.connect();
        
        try (ResultSet resultSet = db.executeQuery(query)) {
            while (resultSet.next()) {
                String courseId = resultSet.getString(1);
                courseIDs.add(courseId);
                System.out.println(courseId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.close();
        }
    }





}
