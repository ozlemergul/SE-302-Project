package syllabustracker.model;

import java.util.ArrayList;

import syllabustracker.util.Database;

public class Course {

   private String courseID;
   private String courseName;
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

   

   
   public String getSyllabusID(int versionNo){
      return courseID + "V" + Integer.toString(versionNo);
   }



   public String getCourseID() {
      return courseID;
   }



   public void setCourseID(String courseID) {
      this.courseID = courseID;
   }



   public String getCourseName() {
      return courseName;
   }



   public void setCourseName(String courseName) {
      this.courseName = courseName;
   }



   public ArrayList<Syllabus> getSyllabi() {
      return syllabi;
   }



   public void setSyllabi(ArrayList<Syllabus> syllabi) {
      this.syllabi = syllabi;
   }



   public ArrayList<ChangeLog> getChangeHistory() {
      return changeHistory;
   }



   public void setChangeHistory(ArrayList<ChangeLog> changeHistory) {
      this.changeHistory = changeHistory;
   }
     
}
