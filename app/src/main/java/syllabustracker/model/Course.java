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

   public void addSyllabus(String courseID, ArrayList<Syllabus> syllabi, ArrayList<ChangeLog> changeHistory){

      GeneralInfo generalInfo = new GeneralInfo(null, 0, 0, 0, 0, null, null, false, null, null, courseID, null, null, courseID, null, courseID, null);

      WeeklySubjects weeklySubjects = new WeeklySubjects(null, null, null);

      Assesment assesment = new Assesment(null, 0, 0, 0, courseID);
      
      OutcomeMatrix outcomeMatrix = new OutcomeMatrix(null, null);
      ArrayList<Work> works = new ArrayList<>();




      Syllabus newSyllabus = new Syllabus(getSyllabusID(syllabi.size()),generalInfo,weeklySubjects,assesment,outcomeMatrix,works);
      syllabi.add(newSyllabus);
      
   }

   
   private String getSyllabusID(int versionNo){
      return courseID + "V" + versionNo;
   }
     
}
