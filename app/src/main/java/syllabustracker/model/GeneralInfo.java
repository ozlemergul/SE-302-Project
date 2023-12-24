package syllabustracker.model;


import java.util.ArrayList;
import syllabustracker.util.Database;

public class GeneralInfo {

    private String code;
    private String term;
    private int theoryHours;
    private int labHours;
    private int localCredits;
    private int ects;
    private String preReqs;
    private String language;
    private String courseType; // Required or Elective
    private String courseLevel;
    private String teachMethods;
    private String coordinator;
    private ArrayList<String> lecturers = new ArrayList<>();
    private ArrayList<String> assistants = new ArrayList<>();
    private String objectives;
    private ArrayList<String> learningOutcomes = new ArrayList<>();
    private String description;
    private CourseCategory courseCategory;


    public GeneralInfo(String code,String term, int theoryHours, int labHours, int localCredits, int ects, String preReqs,
            String language, String courseType, String courseLevel, String teachMethods,
            String coordinator, ArrayList<String> lecturers, ArrayList<String> assistants, String objectives,
            ArrayList<String> learningOutcomes, String description, CourseCategory courseCategory) {
        this.code = code;
        this.term = term;
        this.theoryHours = theoryHours;
        this.labHours = labHours;
        this.localCredits = localCredits;
        this.ects = ects;
        this.preReqs = preReqs;
        this.language = language;
        this.courseType = courseType;
        this.courseLevel = courseLevel;
        this.teachMethods = teachMethods;
        this.coordinator = coordinator;
        this.lecturers = lecturers;
        this.assistants = assistants;
        this.objectives = objectives;
        this.learningOutcomes = learningOutcomes;
        this.description = description;
        this.courseCategory = courseCategory;
    }


    public void insertGeneralInfo(Database db,String syllabusID){
        
        if(db.getConnection() == null){
            db.connect();
        }

        // General Info Database Insert
        db.insertData("general_info",syllabusID,term,theoryHours,labHours,localCredits,ects,preReqs,language,courseType,courseLevel,courseCategory,teachMethods,objectives,description);
        
        // Coordinator Database Insert
        db.insertData("instructor",getInstructorID(1),coordinator,"coordinator");

        // Lecturers and Assistants Database Insert
        for(int i=0; i<lecturers.size();i++){
            db.insertData("instructor", getInstructorID(i+2),lecturers.get(i),"lecturer");
        }
        for(int j=0; j<assistants.size();j++){
            db.insertData("instructor", getInstructorID(j+lecturers.size()+2),assistants.get(j),"assistant");
        }
        
        // Learning Outcomes Database Insert
        for(int k=0; k<learningOutcomes.size();k++){
            db.insertData("learning_outcomes",syllabusID,learningOutcomes.get(k));
        }

         
    }

    private String getInstructorID(int no){
        return code +"T"+Integer.toString(no);
    }

    

   
    


}

