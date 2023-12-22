package syllabustracker.model;

import java.util.ArrayList;

import syllabustracker.util.Database;

public class Syllabus {


    private String syllabusID;
    private GeneralInfo generalInfo;
    private WeeklySubjects weeklySubjects;
    private Assesment assesment;
    private OutcomeMatrix OutcomeMatrix;
    private ArrayList<Work> workLoad = new ArrayList<>();


    public Syllabus(String syllabusID, GeneralInfo generalInfo, WeeklySubjects weeklySubjects, Assesment assesment,
            syllabustracker.model.OutcomeMatrix outcomeMatrix, ArrayList<Work> workLoad) {
                
        this.syllabusID = syllabusID;
        this.generalInfo = generalInfo;
        this.weeklySubjects = weeklySubjects;
        this.assesment = assesment;
        this.OutcomeMatrix = outcomeMatrix;
        this.workLoad = workLoad;
    }

    public void insertWorkLoad(Database db) {

        db.connect();

        for(int i=0; i<workLoad.size(); i++){
            db.insertData(syllabusID,workLoad.get(i).getName(),workLoad.get(i).getNumber(),workLoad.get(i).getDuration(),workLoad.get(i).getLoad());
        }

        
    }

    
    
}
