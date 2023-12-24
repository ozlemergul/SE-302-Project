package syllabustracker.model;

import java.sql.SQLException;
import java.util.ArrayList;
import syllabustracker.util.Database;

public class Syllabus{


    private String syllabusID;
    private GeneralInfo generalInfo;
    private WeeklySubjects weeklySubjects;
    private Assesment assesment;
    private OutcomeMatrix outcomeMatrix;
    private ArrayList<Work> workLoad = new ArrayList<>();
    


    public Syllabus(String syllabusID, GeneralInfo generalInfo, WeeklySubjects weeklySubjects, Assesment assesment,
            syllabustracker.model.OutcomeMatrix outcomeMatrix, ArrayList<Work> workLoad) {
                
        this.syllabusID = syllabusID;
        this.generalInfo = generalInfo;
        this.weeklySubjects = weeklySubjects;
        this.assesment = assesment;
        this.outcomeMatrix = outcomeMatrix;
        this.workLoad = workLoad;

    }



    public String getSyllabusID() {
        return syllabusID;
    }

    public GeneralInfo getGeneralInfo() {
        return generalInfo;
    }

    public WeeklySubjects getWeeklySubjects() {
        return weeklySubjects;
    }

    public Assesment getAssesment() {
        return assesment;
    }

    public OutcomeMatrix getOutcomeMatrix() {
        return outcomeMatrix;
    }

    public ArrayList<Work> getWorkLoad() {
        return workLoad;
    }

    public void insertSyllabus(Database db){

        try {
            if(db.getConnection() == null || db.getConnection().isClosed()){
                db.connect();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
            generalInfo.insertGeneralInfo(db, syllabusID);
            weeklySubjects.insertWeeklySubjects(db, syllabusID);
            assesment.insertAssesment(db, syllabusID);
            insertWorkLoad(db);
            outcomeMatrix.insertOutcomeMatrix(db, syllabusID);
       
        db.close();

    }


    public void insertWorkLoad(Database db) {

        db.connect();

        for(int i=0; i<workLoad.size(); i++){
            db.insertData("workload",syllabusID,workLoad.get(i).getName(),workLoad.get(i).getNumber(),workLoad.get(i).getDuration(),workLoad.get(i).getLoad());
        }

        db.close();

  
    }

    
}
