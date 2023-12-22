package syllabustracker;

import java.util.ArrayList;

import syllabustracker.model.GeneralInfo;
import syllabustracker.model.enums.CourseCategory;
import syllabustracker.model.enums.CourseLevel;
import syllabustracker.model.enums.CourseType;
import syllabustracker.model.enums.Language;
import syllabustracker.model.enums.Term;
import syllabustracker.util.Database;

public class DatabaseTest {


    public static void main(String[] args) {
        
        Database db = new Database();

        ArrayList<String> lecturers = new ArrayList<>();
        ArrayList<String> assist = new ArrayList<>();
        ArrayList<String> loS = new ArrayList<>();

        lecturers.add("Lecturer1");
        lecturers.add("Lecturer2");
        assist.add("assist1");
        assist.add("assist2");
        loS.add("LO1");
        loS.add("LO2");


        GeneralInfo generalInfoTest = new GeneralInfo
        ("CE302",
        Term.Spring ,
        2,
        2, 
        2, 
        2, 
        " ",  
        Language.English, 
        CourseType.Required, 
        CourseLevel.FirstCycle, 
        "Some Teaching Methods", 
        "Cooordinator", 
        lecturers, 
        assist, 
        "some objectives", 
        loS, 
        "Some Descriptions"
        ,CourseCategory.Core
        );

        generalInfoTest.insertGeneralInfo(db, "testID");
    }
    
}
