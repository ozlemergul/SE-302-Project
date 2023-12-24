package syllabustracker.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import syllabustracker.util.Database;

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

    public void insertWeeklySubjects(Database db, String syllabusID) {
        
        ArrayList<String> subjects = new ArrayList<>();
        ArrayList<String> materials = new ArrayList<>();

        for (String subject : weeklyPlan.keySet()) {
            subjects.add(subject);
        }

        for (String material : weeklyPlan.values()) {
            materials.add(material);
        }
        
        try {
            if(db.getConnection() == null || db.getConnection().isClosed()){
                db.connect();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Subjects and required material database insert
        for(int i=0; i < weeklyPlan.size() ;i++){
            db.insertData("weekly_subject",syllabusID,i+1 ,subjects.get(i),materials.get(i));
        }

        // Textbooks database insert
        for(int j=0; j < textBooks.size(); j++){
            db.insertData("textbook", syllabusID,textBooks.get(j),"textbook");
        }

        // Suggested reading database insert
        for(int k=0; k < textBooks.size(); k++){
            db.insertData("textbook", syllabusID,suggestedReadings.get(k),"suggested");
        }

        db.close();

    
        
    }

    
    
}
