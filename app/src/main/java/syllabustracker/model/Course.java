package syllabustracker.model;

import java.util.ArrayList;

import syllabustracker.model.enums.CourseType;
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

   

   public void addSyllabus(int versionNo){

      //Take user input
      
      // Created composite objects
      GeneralInfo generalInfo = new GeneralInfo(courseID, null, versionNo, versionNo, versionNo, versionNo, courseID, null, CourseType.Elective, null, courseID, courseID, null, null, courseID, null, courseID, null);
      WeeklySubjects weeklySubjects = new WeeklySubjects(null, null, null);
      Assesment assesment = new Assesment(null, 0, 0, 0, courseID);
      OutcomeMatrix outcomeMatrix = new OutcomeMatrix(null, null);
      ArrayList<Work> works = new ArrayList<>();

      // Syllabus created
      Syllabus newSyllabus = new Syllabus(getSyllabusID(syllabi.size()),generalInfo,weeklySubjects,assesment,outcomeMatrix,works);
      syllabi.add(newSyllabus);

      // Database insertions
      Database db = new Database();

      if(db.getConnection() == null) {
         db.connect();
      }

      generalInfo.insertGeneralInfo(db, getSyllabusID(versionNo));
      weeklySubjects.insertWeeklySubjects(db, getSyllabusID(versionNo));
      assesment.insertAssesment(db, getSyllabusID(versionNo));
      outcomeMatrix.insertOutcomeMatrix(db, getSyllabusID(versionNo));
      newSyllabus.insertWorkLoad(db);
 
   }

   
   private String getSyllabusID(int versionNo){
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
