package syllabustracker.model;

import java.util.ArrayList;

public class Course {

   private String courseID;
   private String courseName;
   private int versionNo;
   private ArrayList<Syllabus> syllabi;
   private ArrayList<ChangeLog> changeHistory;


   public Course(String courseID, String courseName, ArrayList<Syllabus> syllabi, ArrayList<ChangeLog> changeHistory) {
      syllabi = new ArrayList<>();
      changeHistory = new ArrayList<>();
      this.courseID = courseID;
      this.courseName = courseName;
      this.syllabi = syllabi;
      this.changeHistory = changeHistory;
   }

   private String syllabusID(int versionNo){
      return courseID + "V" + versionNo;

   }
     
}
