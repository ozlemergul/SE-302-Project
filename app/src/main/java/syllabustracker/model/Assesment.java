package syllabustracker.model;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assesment {


    private HashMap<Activity,Integer> weeklyPlan = new HashMap<>();
    private int totalAssesments;
    private int weightSemester;
    private int weightEndSemester;
    private String learningOutcomes; // in a 100010 like format

    // Regex for {0,1}*
    private Pattern loPattern = Pattern.compile("^[01]*$");


    public Assesment(HashMap<Activity, Integer> weeklyPlan, int totalAssesments, int weightSemester,
            int weightEndSemester, String learningOutcomes) {
        this.weeklyPlan = weeklyPlan;
        this.totalAssesments = totalAssesments;
        this.weightSemester = weightSemester;
        this.weightEndSemester = weightEndSemester;

        if(loPattern.matcher(learningOutcomes).matches()){
        this.learningOutcomes = learningOutcomes;}
    }
    

    
    
}
