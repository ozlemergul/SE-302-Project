package syllabustracker.model;

import java.util.ArrayList;


import syllabustracker.util.Database;

public class Assesment {


    private ArrayList<Activity> activities = new ArrayList<>();
    private int totalAssesments;
    private int weightSemester;
    private int weightEndSemester;
    private ArrayList<String> learningOutcomes; // in a 100010 like format



    public Assesment(ArrayList<Activity> activities, int totalAssesments, int weightSemester,
            int weightEndSemester, ArrayList<String> learningOutcomes) {
        this.activities = activities;
        this.totalAssesments = totalAssesments;
        this.weightSemester = weightSemester;
        this.weightEndSemester = weightEndSemester;
        this.learningOutcomes = learningOutcomes;
    }

    public void insertAssesment(Database db, String syllabusID){

        if(db.getConnection() == null){
            db.connect();
        }

        for(int i=0;i<activities.size();i++){
            db.insertData("evaluation_system",syllabusID,activities.get(i).getName(),activities.get(i).getNumber(),activities.get(i).getWeighting(),learningOutcomes.get(i));
        }
        
        db.close();
        
    }
    

    
    
}
