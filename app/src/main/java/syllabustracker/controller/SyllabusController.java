package syllabustracker.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.StringBuilder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import syllabustracker.model.CourseCategory;
import syllabustracker.util.Database;
import syllabustracker.util.PageLoader;

import java.net.URL;
import java.util.ResourceBundle;

import javax.crypto.spec.IvParameterSpec;
import javax.management.Descriptor;

import org.checkerframework.checker.units.qual.s;

import com.google.common.collect.HashBiMap;

public class SyllabusController implements PageController, Initializable {

    @FXML
    public TextField courseName;
    @FXML
    public TextField courseID;
    @FXML
    public ChoiceBox <String> semester;
    @FXML
    public TextField theoryHours;
    @FXML
    public TextField applicationHours;
    @FXML
    public TextField localCredits;
    @FXML
    public TextField ects;
    @FXML
    public TextArea prereqs;
    @FXML
    public ChoiceBox <String> courseLanguage;
    @FXML
    public ChoiceBox <String> courseType;
    @FXML
    public ChoiceBox <String> courseLevel;
    @FXML
    public TextArea methods;
    @FXML
    public TextArea coordinator;
    @FXML
    public TextArea lecturers;
    @FXML
    public TextArea assistants;
    @FXML
    public TextArea objectives;
    @FXML
    public TextArea learningOutcomes;
    @FXML
    public TextArea courseDescription;
    @FXML
    public CheckBox CoreCoursesCheck;
    @FXML
    public CheckBox MajorAreaCoursesCheck;
    @FXML
    public CheckBox SupportiveCoursesCheck;
    @FXML
    public CheckBox MediaManagmSkillsCheck;
    @FXML
    public CheckBox TransferableSkillCoursesCheck;
    @FXML
    public TextArea subject1;
    @FXML
    public TextArea prep1;
    @FXML
    public TextArea subject2;
    @FXML
    public TextArea prep2;
    @FXML
    public TextArea subject3;
    @FXML
    public TextArea prep3;
    @FXML
    public TextArea subject4;
    @FXML
    public TextArea prep4;
    @FXML
    public TextArea subject5;
    @FXML
    public TextArea prep5;
    @FXML
    public TextArea subject6;
    @FXML
    public TextArea prep6;
    @FXML
    public TextArea subject7;
    @FXML
    public TextArea prep7;
    @FXML
    public TextArea subject8;
    @FXML
    public TextArea prep8;
    @FXML
    public TextArea subject9;
    @FXML
    public TextArea prep9;
    @FXML
    public TextArea subject10;
    @FXML
    public TextArea prep10;
    @FXML
    public TextArea subject11;
    @FXML
    public TextArea prep11;
    @FXML
    public TextArea subject12;
    @FXML
    public TextArea prep12;
    @FXML
    public TextArea subject13;
    @FXML
    public TextArea prep13;
    @FXML
    public TextArea subject14;
    @FXML
    public TextArea prep14;
    @FXML
    public TextArea subject15;
    @FXML
    public TextArea prep15;
    @FXML
    public TextArea subject16;
    @FXML
    public TextArea prep16;
    @FXML
    public TextArea CourseNotes;
    @FXML
    public TextArea SuggestedMaterials;
    @FXML
    public TextField participationNum;
    @FXML
    public TextField participationWeight;
    @FXML
    public TextField participation_LO1;
    @FXML
    public TextField participation_LO2;
    @FXML
    public TextField participation_LO3;
    @FXML
    public TextField participation_LO4;
    @FXML
    public TextField participation_LO5;
    @FXML
    public TextField participation_LO6;
    @FXML
    public TextField participation_LO7;
    @FXML
    public TextField labNum;
    @FXML
    public TextField labWeight;
    @FXML
    public TextField lab_LO1;
    @FXML
    public TextField lab_LO2;
    @FXML
    public TextField lab_LO3;
    @FXML
    public TextField lab_LO4;
    @FXML
    public TextField lab_LO5;
    @FXML
    public TextField lab_LO6;
    @FXML
    public TextField lab_LO7;
    @FXML
    public TextField fieldWorkNum;
    @FXML
    public TextField fieldWorkWeight;
    @FXML
    public TextField fwork_LO1;
    @FXML
    public TextField fwork_LO2;
    @FXML
    public TextField fwork_LO3;
    @FXML
    public TextField fwork_LO4;
    @FXML
    public TextField fwork_LO5;
    @FXML
    public TextField fwork_LO6;
    @FXML
    public TextField fwork_LO7;
    @FXML
    public TextField quizNum;
    @FXML
    public TextField quizWeight;
    @FXML
    public TextField quiz_LO1;
    @FXML
    public TextField quiz_LO2;
    @FXML
    public TextField quiz_LO3;
    @FXML
    public TextField quiz_LO4;
    @FXML
    public TextField quiz_LO5;
    @FXML
    public TextField quiz_LO6;
    @FXML
    public TextField quiz_LO7;
    @FXML
    public TextField portfolioNum;
    @FXML
    public TextField portfolioWeight;
    @FXML
    public TextField portfolio_LO1;
    @FXML
    public TextField portfolio_LO2;
    @FXML
    public TextField portfolio_LO3;
    @FXML
    public TextField portfolio_LO4;
    @FXML
    public TextField portfolio_LO5;
    @FXML
    public TextField portfolio_LO6;
    @FXML
    public TextField portfolio_LO7;
    @FXML
    public TextField hwNum;
    @FXML
    public TextField hwWeight;
    @FXML
    public TextField hw_LO1;
    @FXML
    public TextField hw_LO2;
    @FXML
    public TextField hw_LO3;
    @FXML
    public TextField hw_LO4;
    @FXML
    public TextField hw_LO5;
    @FXML
    public TextField hw_LO6;
    @FXML
    public TextField hw_LO7;
    @FXML
    public TextField presentationNum;
    @FXML
    public TextField presentationWeight;
    @FXML
    public TextField presentation_LO1;
    @FXML
    public TextField presentation_LO2;
    @FXML
    public TextField presentation_LO3;
    @FXML
    public TextField presentation_LO4;
    @FXML
    public TextField presentation_LO5;
    @FXML
    public TextField presentation_LO6;
    @FXML
    public TextField presentation_LO7;
    @FXML
    public TextField projectNum;
    @FXML
    public TextField projectWeight;
    @FXML
    public TextField project_LO1;
    @FXML
    public TextField project_LO2;
    @FXML
    public TextField project_LO3;
    @FXML
    public TextField project_LO4;
    @FXML
    public TextField project_LO5;
    @FXML
    public TextField project_LO6;
    @FXML
    public TextField project_LO7;
    @FXML
    public TextField seminarNum;
    @FXML
    public TextField seminarWeight;
    @FXML
    public TextField seminar_LO1;
    @FXML
    public TextField seminar_LO2;
    @FXML
    public TextField seminar_LO3;
    @FXML
    public TextField seminar_LO4;
    @FXML
    public TextField seminar_LO5;
    @FXML
    public TextField seminar_LO6;
    @FXML
    public TextField seminar_LO7;
    @FXML
    public TextField oralExamNum;
    @FXML
    public TextField oralExamWeight;
    @FXML
    public TextField oralExam_LO1;
    @FXML
    public TextField oralExam_LO2;
    @FXML
    public TextField oralExam_LO3;
    @FXML
    public TextField oralExam_LO4;
    @FXML
    public TextField oralExam_LO5;
    @FXML
    public TextField oralExam_LO6;
    @FXML
    public TextField oralExam_LO7;
    @FXML
    public TextField midtermNum;
    @FXML
    public TextField midtermWeight;
    @FXML
    public TextField midterm_LO1;
    @FXML
    public TextField midterm_LO2;
    @FXML
    public TextField midterm_LO3;
    @FXML
    public TextField midterm_LO4;
    @FXML
    public TextField midterm_LO5;
    @FXML
    public TextField midterm_LO6;
    @FXML
    public TextField midterm_LO7;
    @FXML
    public TextField finalNum;
    @FXML
    public TextField finalWeight;
    @FXML
    public TextField final_LO1;
    @FXML
    public TextField final_LO2;
    @FXML
    public TextField final_LO3;
    @FXML
    public TextField final_LO4;
    @FXML
    public TextField final_LO5;
    @FXML
    public TextField final_LO6;
    @FXML
    public TextField final_LO7;
    @FXML
    public TextField totalNum;
    @FXML
    public TextField totalWeight;
    @FXML
    public TextField total_LO1;
    @FXML
    public TextField total_LO2;
    @FXML
    public TextField total_LO3;
    @FXML
    public TextField total_LO4;
    @FXML
    public TextField total_LO5;
    @FXML
    public TextField total_LO6;
    @FXML
    public TextField total_LO7;
    @FXML
    public TextField FGWeightSem_area1;
    @FXML
    public TextField FGWeightSem_area2;
    @FXML
    public TextField FGWeightEndSem_area1;
    @FXML
    public TextField FGWeightEndSem_area2;
    @FXML
    public TextField total_area1;
    @FXML
    public TextField total_area2;
    @FXML
    public TextField TheoreticalCourseHoursNum_;
    @FXML
    public TextField TheoreticalCourseHoursDuration_;
    @FXML
    public TextField TheoreticalCourseHoursWorkload_;
    @FXML
    public TextField labNum_;
    @FXML
    public TextField labDuration_;
    @FXML
    public TextField labWorkload_;
    @FXML
    public TextField StudyHoursNum_;
    @FXML
    public TextField StudyHoursDuration_;
    @FXML
    public TextField StudyHoursWorkload_;
    @FXML
    public TextField FieldWorkNum_;
    @FXML
    public TextField FieldWorkDuration_;
    @FXML
    public TextField FieldWorkWorkload_;
    @FXML
    public TextField QuizNum_;
    @FXML
    public TextField QuizDuration_;
    @FXML
    public TextField QuizWorkload_;
    @FXML
    public TextField PortfolioNum_;
    @FXML
    public TextField PortfolioDuration_;
    @FXML
    public TextField PortfolioWorkload_;
    @FXML
    public TextField HwNum_;
    @FXML
    public TextField HwDuration_;
    @FXML
    public TextField HwWorkload_;
    @FXML
    public TextField PresentationNum_;
    @FXML
    public TextField PresentationDuration_;
    @FXML
    public TextField PresentationWorkload_;
    @FXML
    public TextField ProjectNum_;
    @FXML
    public TextField ProjectDuration_;
    @FXML
    public TextField ProjectWorkload_;
    @FXML
    public TextField SeminarNum_;
    @FXML
    public TextField SeminarDuration_;
    @FXML
    public TextField SeminarWorkload_;
    @FXML
    public TextField OralExamNum_;
    @FXML
    public TextField OralExamDuration_;
    @FXML
    public TextField OralExamWorkload_;
    @FXML
    public TextField MidtermNum_;
    @FXML
    public TextField MidtermDuration_;
    @FXML
    public TextField MidtermWorkload_;
    @FXML
    public TextField FinalExamNum_;
    @FXML
    public TextField FinalExamDuration_;
    @FXML
    public TextField FinalExamWorkload_;
    @FXML
    public TextField totalSemesterActivity;
    @FXML
    public TextArea programOutcomeText1;
    @FXML
    public CheckBox contLevel1_1;
    @FXML
    public CheckBox contLevel1_2;
    @FXML
    public CheckBox contLevel1_3;
    @FXML
    public CheckBox contLevel1_4;
    @FXML
    public CheckBox contLevel1_5;
    @FXML
    public TextArea contLevel1_LO;
    @FXML
    public TextArea programOutcomeText2;
    @FXML
    public CheckBox contLevel2_1;
    @FXML
    public CheckBox contLevel2_2;
    @FXML
    public CheckBox contLevel2_3;
    @FXML
    public CheckBox contLevel2_4;
    @FXML
    public CheckBox contLevel2_5;
    @FXML
    public TextArea contLevel2_LO;
    @FXML
    public TextArea programOutcomeText3;
    @FXML
    public CheckBox contLevel3_1;
    @FXML
    public CheckBox contLevel3_2;
    @FXML
    public CheckBox contLevel3_3;
    @FXML
    public CheckBox contLevel3_4;
    @FXML
    public CheckBox contLevel3_5;
    @FXML
    public TextArea contLevel3_LO;
    @FXML
    public TextArea programOutcomeText4;
    @FXML
    public CheckBox contLevel4_1;
    @FXML
    public CheckBox contLevel4_2;
    @FXML
    public CheckBox contLevel4_3;
    @FXML
    public CheckBox contLevel4_4;
    @FXML
    public CheckBox contLevel4_5;
    @FXML
    public TextArea contLevel4_LO;
    @FXML
    public TextArea programOutcomeText5;
    @FXML
    public CheckBox contLevel5_1;
    @FXML
    public CheckBox contLevel5_2;
    @FXML
    public CheckBox contLevel5_3;
    @FXML
    public CheckBox contLevel5_4;
    @FXML
    public CheckBox contLevel5_5;
    @FXML
    public TextArea contLevel5_LO;
    @FXML
    public TextArea programOutcomeText6;
    @FXML
    public CheckBox contLevel6_1;
    @FXML
    public CheckBox contLevel6_2;
    @FXML
    public CheckBox contLevel6_3;
    @FXML
    public CheckBox contLevel6_4;
    @FXML
    public CheckBox contLevel6_5;
    @FXML
    public TextArea contLevel6_LO;
    @FXML
    public TextArea programOutcomeText7;
    @FXML
    public CheckBox contLevel7_1;
    @FXML
    public CheckBox contLevel7_2;
    @FXML
    public CheckBox contLevel7_3;
    @FXML
    public CheckBox contLevel7_4;
    @FXML
    public CheckBox contLevel7_5;
    @FXML
    public TextArea contLevel7_LO;
    @FXML
    public TextArea programOutcomeText8;
    @FXML
    public CheckBox contLevel8_1;
    @FXML
    public CheckBox contLevel8_2;
    @FXML
    public CheckBox contLevel8_3;
    @FXML
    public CheckBox contLevel8_4;
    @FXML
    public CheckBox contLevel8_5;
    @FXML
    public TextArea contLevel8_LO;
    @FXML
    public TextArea programOutcomeText9;
    @FXML
    public CheckBox contLevel9_1;
    @FXML
    public CheckBox contLevel9_2;
    @FXML
    public CheckBox contLevel9_3;
    @FXML
    public CheckBox contLevel9_4;
    @FXML
    public CheckBox contLevel9_5;
    @FXML
    public TextArea contLevel9_LO;
    @FXML
    public TextArea programOutcomeText10;
    @FXML
    public CheckBox contLevel10_1;
    @FXML
    public CheckBox contLevel10_2;
    @FXML
    public CheckBox contLevel10_3;
    @FXML
    public CheckBox contLevel10_4;
    @FXML
    public CheckBox contLevel10_5;
    @FXML
    public TextArea contLevel10_LO;
    @FXML
    public TextArea programOutcomeText11;
    @FXML
    public CheckBox contLevel11_1;
    @FXML
    public CheckBox contLevel11_2;
    @FXML
    public CheckBox contLevel11_3;
    @FXML
    public CheckBox contLevel11_4;
    @FXML
    public CheckBox contLevel11_5;
    @FXML
    public TextArea contLevel11_LO;
    @FXML
    public TextArea programOutcomeText12;
    @FXML
    public CheckBox contLevel12_1;
    @FXML
    public CheckBox contLevel12_2;
    @FXML
    public CheckBox contLevel12_3;
    @FXML
    public CheckBox contLevel12_4;
    @FXML
    public CheckBox contLevel12_5;
    @FXML
    public TextArea contLevel12_LO;
    @FXML
    public TextArea programOutcomeText13;
    @FXML
    public CheckBox contLevel13_1;
    @FXML
    public CheckBox contLevel13_2;
    @FXML
    public CheckBox contLevel13_3;
    @FXML
    public CheckBox contLevel13_4;
    @FXML
    public CheckBox contLevel13_5;
    @FXML
    public TextArea contLevel13_LO;

    @FXML
    private Stage primaryStage;

    private String[] Semester = {"Fall", "Spring", "Both" };
    private String[] CourseLanguage = {"English", "Turkish", "Second Foreign Language"};
    private String[] CourseType = {"Required", "Elective"};
    private String[] CourseLevel = {"Short Cycle", "First Cycle", "Second Cycle", "Third Cycle"};
    private String courseIDFromTop;

    @Override
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }


    @Override
    public void initialize(URL arg0, ResourceBundle arg1){

        semester.getItems().addAll(Semester);
        courseLanguage.getItems().addAll(CourseLanguage);
        courseType.getItems().addAll(CourseType);
        courseLevel.getItems().addAll(CourseLevel);
        initData(courseIDFromTop);
        
    }

    @FXML
    private void aboutSyllabusButton (ActionEvent event) {
        PageLoader.loadPage("/AboutSyllabus.fxml", primaryStage);

    }

    @FXML
    private void oldVersionsButton (ActionEvent event) {
        PageLoader.loadPage("/OldVersions.fxml", primaryStage);

    }

    @FXML
    private void compareButton (ActionEvent event) {
        PageLoader.loadPage("/Versions.fxml", primaryStage);

    }

    public void initData(String courseCode) {
        courseIDFromTop = courseCode;
        courseID.setText(courseIDFromTop);

        // Database connection

        Database db = new Database();
        try {
            if(db.getConnection() == null || db.getConnection().isClosed()){
                db.connect();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String syllabusID = getSyllabusIDFromDatabase(db, courseCode);
        System.out.println(syllabusID);

        // General Info Fetch

        courseName.setText(db.fetchRow(db, "course", "code", courseCode).get("course_name"));
        
        Map<String, String> generalInfoData = new HashMap<>();
        generalInfoData = db.fetchRow(db, "general_info", "syllabus_id",syllabusID);

        semester.setValue(generalInfoData.get("semester"));
        theoryHours.setText(generalInfoData.get("theory_hours"));
        applicationHours.setText(generalInfoData.get("application_hours"));
        localCredits.setText(generalInfoData.get("local_credits"));
        ects.setText(generalInfoData.get("ects"));
        prereqs.setText(generalInfoData.get("prerequisties"));
        courseLanguage.setValue(generalInfoData.get("language"));
        courseType.setValue(generalInfoData.get("type"));
        courseLevel.setValue(generalInfoData.get("level"));

        
        System.out.println(generalInfoData.get("category"));

        String courseCategoryValue = generalInfoData.get("category");
        System.out.println(courseCategoryValue);

        /* if(courseCategoryValue.equals("Core")){
            CoreCoursesCheck.setSelected(true);
        }
        else if(courseCategoryValue.equals("MajorArea")){
            MajorAreaCoursesCheck.setSelected(true);
        }
        else if(courseCategoryValue.equals("Supportive")){
            SupportiveCoursesCheck.setSelected(true);
        }
        else if(courseCategoryValue.equals("CommAndManagement")){
            MediaManagmSkillsCheck.setSelected(true);
        }
        else if(courseCategoryValue.equals("Transferable")){
            TransferableSkillCoursesCheck.setSelected(true);
        } */

        methods.setText(generalInfoData.get("teaching_methods"));
        objectives.setText(generalInfoData.get("objectives"));
        courseDescription.setText(generalInfoData.get("description"));

        //Lecturers
        HashMap<String,String> instructorsFromDatabase = new HashMap<>();
        instructorsFromDatabase = getInstructorsFromDatabase(db, courseCode);

        coordinator.setText(instructorsFromDatabase.get("coordinator"));
        lecturers.setText(instructorsFromDatabase.get("lecturer"));
        assistants.setText(instructorsFromDatabase.get("assistant"));

        // Learning outcomes
        ArrayList<String> learningOutcomesList = new ArrayList<>();
        learningOutcomesList = db.fetchColumn("learning_outcomes", "learning_outcome","syllabus_id",syllabusID);
        StringBuilder learningOutcomesText = new StringBuilder();

        for (String value : learningOutcomesList) {
            learningOutcomesText.append(value).append("\n");
        }

        learningOutcomes.setText(learningOutcomesText.toString());

        




        




 
    }

    private String getSyllabusIDFromDatabase(Database db,String courseID){

        String query = "SELECT syllabus_id FROM general_info WHERE syllabus_id LIKE "+"\""+courseID+"%"+"\""+" ORDER BY syllabus_id DESC LIMIT 1;";

        try (
            // Establishing a connection to the database
            Connection connection = db.getConnection();
            
            // Creating a prepared statement with the SQL query
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            // Executing the query and getting the result set
            ResultSet resultSet = preparedStatement.executeQuery()
        ) {
            // Processing the result set
            while (resultSet.next()) {
                String syllabusId = resultSet.getString("syllabus_id");
                return syllabusId;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        db.close();

        
        return null;
    
    }

    private HashMap<String,String> getInstructorsFromDatabase(Database db,String courseID){

        String query1 = "SELECT instructor_name FROM instructor WHERE instructor_id LIKE "+"\""+courseID+"%"+"\"";
        String query2 = "SELECT role FROM instructor WHERE instructor_id LIKE "+"\""+courseID+"%"+"\"";

        ArrayList<String> instructorNames = new ArrayList<>();
        ArrayList<String> instructorRoles = new ArrayList<>();

        try {
            if(db.getConnection() == null || db.getConnection().isClosed()){
                db.connect();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            
            PreparedStatement preparedStatement1 = db.getConnection().prepareStatement(query1);
            PreparedStatement preparedStatement2 = db.getConnection().prepareStatement(query2);
            
            // Executing the query and getting the result set
            ResultSet resultSet1 = preparedStatement1.executeQuery();
            ResultSet resultSet2 = preparedStatement2.executeQuery();
            HashMap<String,String> instructors = new HashMap<>();
        
            // Processing the result set
            while (resultSet1.next()) {
                String instructorName = resultSet1.getString("instructor_name");
                instructorNames.add(instructorName);
            }

            while (resultSet2.next()) {
                String role = resultSet2.getString("role");
                instructorRoles.add(role);
            }

            for(int i=0;i<instructorRoles.size();i++){
            instructors.put(instructorRoles.get(i), instructorNames.get(i));
            } 
            return instructors;
        } catch (SQLException e) {
            e.printStackTrace();
        }



        db.close();
        return null;
    
    }
}

    

