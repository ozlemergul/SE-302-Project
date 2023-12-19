package syllabustracker.model;

import java.util.ArrayList;
import java.util.HashMap;

public class WeeklySubjects {

    private HashMap<String,String> weeklyPlan = new HashMap<>();
    private ArrayList<String> textBooks = new ArrayList<>();
    private ArrayList<String> suggestedReadings = new ArrayList<>();

    
    public WeeklySubjects(HashMap<String, String> weeklyPlan, ArrayList<String> textBooks,
            ArrayList<String> suggestedReadings) {
        this.weeklyPlan = weeklyPlan;
        this.textBooks = textBooks;
        this.suggestedReadings = suggestedReadings;
    }

    
    
}
