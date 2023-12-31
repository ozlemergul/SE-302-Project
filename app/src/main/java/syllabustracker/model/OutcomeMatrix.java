package syllabustracker.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import syllabustracker.util.Database;

public class OutcomeMatrix {

    private ArrayList<String> programOutcomes = new ArrayList<>();
    private HashMap<Integer,String> contributionLevelMatrix = new HashMap<>();  // String side is used for showing which LO's are related with this outcome in a form of 001001 means 3,6

    public OutcomeMatrix(ArrayList<String> programOutcomes, HashMap<Integer, String> contributionLevelMatrix) {
        this.programOutcomes = programOutcomes;
        this.contributionLevelMatrix = contributionLevelMatrix;
    }

    public void insertOutcomeMatrix(Database db,String syllabusID){

        try {
            if(db.getConnection() == null || db.getConnection().isClosed()){
                db.connect();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Program outcomes database insert
        for(int i=0; i<programOutcomes.size(); i++){
            String compentencyID = syllabusID + "C" + (i+1);
            db.insertData("program_competency",compentencyID,programOutcomes.get(i));
        }

        // Contribution levels and realted learning outcomes insert
        ArrayList<Integer> contributionLevels = new ArrayList<>();
        ArrayList<String> relatedLearningOutcomes = new ArrayList<>();

        for(Integer contributionLevel : contributionLevelMatrix.keySet()){
            contributionLevels.add(contributionLevel);
        }

        for(String relatedLOs : contributionLevelMatrix.values()){
            relatedLearningOutcomes.add(relatedLOs);
        }

        for(int j=0;j<contributionLevels.size();j++){
            String compentencyID = syllabusID + "C" + (j+1);
            db.insertData("course_competency",syllabusID,compentencyID,contributionLevels.get(j),relatedLearningOutcomes.get(j));
        }

        db.close();
    

    }

    

    
}
