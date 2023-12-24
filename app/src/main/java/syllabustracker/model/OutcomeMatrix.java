package syllabustracker.model;

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

        if(db.getConnection() == null){
            db.connect();
        }

        // Program outcomes database insert
        for(int i=0; i<programOutcomes.size(); i++){
            db.insertData("program_competency",i+1,programOutcomes.get(i));
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
            db.insertData("course_competency",j+1,syllabusID,contributionLevels.get(j),relatedLearningOutcomes.get(j));
        }

        db.close();

    }

    
}
