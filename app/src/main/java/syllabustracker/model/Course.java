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

   public void addSyllabus(String courseID, ArrayList<Syllabus> syllabi, ArrayList<ChangeLog> changeHistory){

      GeneralInfo generalInfo = new GeneralInfo(null, 0, 0, 0, 0, null, null, false, null, null, courseID, null, null, courseID, null, courseID, null);

      WeeklySubjects weeklySubjects = new WeeklySubjects(null, null, null);

      Assesment assesment = new Assesment(null, 0, 0, 0, courseID);
      
      OutcomeMatrix outcomeMatrix = new OutcomeMatrix(null, null);
      ArrayList<Work> works = new ArrayList<>();




      Syllabus newSyllabus = new Syllabus("test",generalInfo,weeklySubjects,assesment,outcomeMatrix,works);
      syllabi.add(newSyllabus);
      
   }

   
   


   

     
}
