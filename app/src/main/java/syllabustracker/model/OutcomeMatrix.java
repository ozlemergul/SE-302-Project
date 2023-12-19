package syllabustracker.model;

import java.util.ArrayList;
import java.util.HashMap;

public class OutcomeMatrix {

    private ArrayList<String> outcomes = new ArrayList<>();
    private HashMap<Integer,String> contributionLevel = new HashMap<>();  // String side is used for showing which LO's are related with this outcome in a form of 001001 means 3,6

    public OutcomeMatrix(ArrayList<String> outcomes, HashMap<Integer, String> contributionLevel) {
        this.outcomes = outcomes;
        this.contributionLevel = contributionLevel;
    }

    
}
