package syllabustracker.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import syllabustracker.util.PageLoader;

public class EditSyllabusController implements PageController{

    @FXML
    public TextField courseName;
    @FXML
    public TextField courseID;
    @FXML
    public ChoiceBox<String> semester;
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
    public ChoiceBox<String> courseLanguage;
    @FXML
    public ChoiceBox<String> courseType;
    @FXML
    public ChoiceBox<String> courseLevel;
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
    public Pane CoreCoursesCheck;
    @FXML
    public Pane MajorAreaCoursesCheck;
    @FXML
    public Pane SupportiveCoursesCheck;
    @FXML
    public Pane MediaManagmSkillsCheck;
    @FXML
    public Pane TransferableSkillCoursesCheck;
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

    @Override
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @FXML
    public void cancelButton (ActionEvent event) {
        PageLoader.goPreviousPage(primaryStage);

    }

    @FXML
    public void saveSyllabus(ActionEvent event) {

        try {
         
        } catch(Exception e) {
            
        }
        //PageLoader.showAnotherPage("/SavingScreen.fxml");
    }

}
