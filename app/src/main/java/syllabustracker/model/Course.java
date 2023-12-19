package syllabustracker.model;

import java.util.ArrayList;

public class Course {

   private String courseID;
   private String courseName;
   private ArrayList<Syllabus> syllabi = new ArrayList<> ();
   private ArrayList<ChangeLog> changeHistory = new ArrayList<>();

   
   public Course(String courseID, String courseName, ArrayList<Syllabus> syllabi, ArrayList<ChangeLog> changeHistory) {
      this.courseID = courseID;
      this.courseName = courseName;
      this.syllabi = syllabi;
      this.changeHistory = changeHistory;
   }


   

     
}
