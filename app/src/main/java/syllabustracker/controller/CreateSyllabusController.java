package syllabustracker.controller;


import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import syllabustracker.model.Activity;
import syllabustracker.model.Assesment;
import syllabustracker.model.Course;
import syllabustracker.model.CourseCategory;
import syllabustracker.model.CourseRepo;
import syllabustracker.model.GeneralInfo;
import syllabustracker.model.OutcomeMatrix;
import syllabustracker.model.Syllabus;
import syllabustracker.model.WeeklySubjects;
import syllabustracker.model.Work;
import syllabustracker.util.Database;
import syllabustracker.util.PageLoader;

public class CreateSyllabusController implements PageController,Initializable{

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
    public CheckBox CoreCoursesCheck;
    @FXML
    public CheckBox  MajorAreaCoursesCheck;
    @FXML
    public CheckBox  SupportiveCoursesCheck;
    @FXML
    public CheckBox  MediaManagmSkillsCheck;
    @FXML
    public CheckBox  TransferableSkillCoursesCheck;
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

    @Override
    public void initialize(URL arg0, ResourceBundle arg1){

        semester.getItems().addAll(Semester);
        courseLanguage.getItems().addAll(CourseLanguage);
        courseType.getItems().addAll(CourseType);
        courseLevel.getItems().addAll(CourseLevel);

    }

    @Override
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @FXML
    public void cancelButton (ActionEvent event) {
        PageLoader.goPreviousPage(primaryStage);

    }


    @FXML
    public void saveSyllabus(ActionEvent event) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {

        // Database connection
        Database db = new Database();
        if(db.getConnection() == null){
            db.connect();
        }

        //Create a new course and insert database
        CourseRepo courseRepo = new CourseRepo();
        Course newCourse = courseRepo.createCourse(courseName.getText(), courseID.getText(), db);

        // First syllabus version create
        // General Info create
        // Lecturer ArrayList
        String[] lecturerNames = this.lecturers.getText().split(",");
        ArrayList<String> lecturers = new ArrayList<>();
        lecturers.addAll(Arrays.asList(lecturerNames));

        // Assistants ArrayList
        String[] assistantNames = this.assistants.getText().split(",+");
        ArrayList<String> assistants = new ArrayList<>();
        assistants.addAll(Arrays.asList(assistantNames));

        //Learining Outcomes ArrayList
        String[] learningOutcomeLines = this.lecturers.getText().split("\n");
        ArrayList<String> learningOutcomes = new ArrayList<>();
        learningOutcomes.addAll(Arrays.asList(learningOutcomeLines));

        //Course Category
        CourseCategory courseCategory = null;
        if(CoreCoursesCheck.isSelected()){
            courseCategory = CourseCategory.Core;
        }
        else if(MajorAreaCoursesCheck.isSelected()){
            courseCategory = CourseCategory.MajorArea;
        }
        else if(SupportiveCoursesCheck.isSelected()){
            courseCategory = CourseCategory.Supportive;
        }
        else if(MediaManagmSkillsCheck.isSelected()){
            courseCategory = CourseCategory.CommAndManagement;
        }
        else if(TransferableSkillCoursesCheck.isSelected()){
            courseCategory = CourseCategory.Transferable;
        }


        GeneralInfo generalInfo = new GeneralInfo(courseID.getText(), semester.getValue().toString(), Integer.parseInt(theoryHours.getText()), Integer.parseInt(applicationHours.getText()), Integer.parseInt(localCredits.getText()), Integer.parseInt(ects.getText()), prereqs.getText(),courseLanguage.getValue().toString(), courseType.getValue().toString(),courseLevel.getValue().toString(), methods.getText(), coordinator.getText(), lecturers, assistants, objectives.getText(), learningOutcomes, courseDescription.getText(),courseCategory);
        
        // Weekly Subjects create

        // WeeklyPlan
        ArrayList<String> subjects = new ArrayList<>();
        for(int i=1;i<=16;i++){
            TextArea subject = (TextArea) getClass().getDeclaredField("subject" + i).get(this);
            subjects.add(subject.getText());
        }
        ArrayList<String> suggesteds = new ArrayList<>();
        for(int j=1;j<=16;j++){
            TextArea prep = (TextArea) getClass().getDeclaredField("prep" + j).get(this);
            suggesteds.add(prep.getText());
        }

        HashMap<String,String> weeklyPlan = new HashMap<>();
        for(int k=0; k<subjects.size();k++){
            weeklyPlan.put(subjects.get(k), suggesteds.get(k));
        }

        // Textbooks and Suggested Readings

        String[] textbookNames = CourseNotes.getText().split("\n");
        ArrayList<String> textbooks = new ArrayList<>();
        textbooks.addAll(Arrays.asList(textbookNames));

        String[] suggestedReadingNames = CourseNotes.getText().split("\n");
        ArrayList<String> suggestedReadings= new ArrayList<>();
        suggestedReadings.addAll(Arrays.asList(suggestedReadingNames));

        WeeklySubjects weeklySubjects = new WeeklySubjects(weeklyPlan, textbooks, suggestedReadings);

        // Assesments create

        // Assesments null check

        ArrayList<Activity> activities = new ArrayList<>();
        ArrayList<String> learningOutcomeCodes = new ArrayList<>();
 
        if(!participationNum.getText().isEmpty()){
            activities.add(new Activity("Participation", Integer.parseInt(participationNum.getText()),Integer.parseInt(participationWeight.getText())));
            learningOutcomeCodes.add(getLearningOutcomeCode("participation",1));
        }
        else if(!labNum.getText().isEmpty()){
            activities.add(new Activity("Lab", Integer.parseInt(labNum.getText()),Integer.parseInt(labWeight.getText())));
            learningOutcomeCodes.add(getLearningOutcomeCode("lab",2));
        } 
        else if(!fieldWorkNum.getText().isEmpty()){
            activities.add(new Activity("Field", Integer.parseInt(fieldWorkNum.getText()),Integer.parseInt(fieldWorkWeight.getText())));
            learningOutcomeCodes.add(getLearningOutcomeCode("fwork",3));
        }
        else if(!quizNum.getText().isEmpty()){
            activities.add(new Activity("Quiz", Integer.parseInt(quizNum.getText()),Integer.parseInt(quizWeight.getText())));
            learningOutcomeCodes.add(getLearningOutcomeCode("quiz",4));
        }
        else if(!portfolioNum.getText().isEmpty()){
            activities.add(new Activity("Portfolio", Integer.parseInt(portfolioNum.getText()),Integer.parseInt(portfolioWeight.getText())));
            learningOutcomeCodes.add(getLearningOutcomeCode("portfolio",5));
        }
        else if(!hwNum.getText().isEmpty()){
            activities.add(new Activity("Homework", Integer.parseInt(hwNum.getText()),Integer.parseInt(hwWeight.getText())));
            learningOutcomeCodes.add(getLearningOutcomeCode("hw",6));
        }
        else if(!presentationNum.getText().isEmpty()){
            activities.add(new Activity("Presentation", Integer.parseInt(presentationNum.getText()),Integer.parseInt(presentationWeight.getText())));
            learningOutcomeCodes.add(getLearningOutcomeCode("presentation",7));
        }
        else if(!projectNum.getText().isEmpty()){
            activities.add(new Activity("Project", Integer.parseInt(projectNum.getText()),Integer.parseInt(projectWeight.getText())));
            learningOutcomeCodes.add(getLearningOutcomeCode("project",8));
        }
        else if(!seminarNum.getText().isEmpty()){
            activities.add(new Activity("Seminar", Integer.parseInt(seminarNum.getText()),Integer.parseInt(seminarWeight.getText())));
            learningOutcomeCodes.add(getLearningOutcomeCode("seminar",9));
        }
        else if(!oralExamNum.getText().isEmpty()){
            activities.add(new Activity("Oral", Integer.parseInt(oralExamNum.getText()),Integer.parseInt(oralExamWeight.getText())));
            learningOutcomeCodes.add(getLearningOutcomeCode("oral",10));
        }
        else if(!midtermNum.getText().isEmpty()){
            activities.add(new Activity("MidTerm", Integer.parseInt(midtermNum.getText()),Integer.parseInt(midtermWeight.getText())));
            learningOutcomeCodes.add(getLearningOutcomeCode("midterm",11));
        }
        else if(!finalNum.getText().isEmpty()){
            activities.add(new Activity("Final", Integer.parseInt(finalNum.getText()),Integer.parseInt(finalWeight.getText())));
            learningOutcomeCodes.add(getLearningOutcomeCode("final",12));
        }

        Assesment assesment = new Assesment(activities, activities.size(), 100, 0,learningOutcomeCodes);

        // Outcome Matrix create
        ArrayList<String> programOutcomes = new ArrayList<>();
        for(int i=1;i<=13;i++){
            TextArea programOutcome = (TextArea) getClass().getDeclaredField("programOutcomeText" + i).get(this);
            programOutcomes.add(programOutcome.getText());
        }

        ArrayList<String> contLearningOutcomes = new ArrayList<>();
        ArrayList<Integer> contributionLevels = new ArrayList<>();

        for(int i=1;i<=13;i++){
            TextArea contLearningOutcome = (TextArea) getClass().getDeclaredField("contLevel" + i+"_LO").get(this);
            if(!contLearningOutcome.getText().isEmpty()){
            contLearningOutcomes.add(contLearningOutcome.getText()+"#"+i);
            for(int j=1;j<=5;j++){
                CheckBox contLevelBox = (CheckBox) getClass().getDeclaredField("contLevel" + i+"_"+j).get(this);
                if(contLevelBox.isSelected()){
                    contributionLevels.add(j);
                }
            }
        }
        }

        HashMap<Integer,String> contributionLevelMatrix = new HashMap<>();

        for(int i=0;i<contLearningOutcomes.size();i++){
            contributionLevelMatrix.put(contributionLevels.get(i), contLearningOutcomes.get(i));
        }

        OutcomeMatrix outcomeMatrix = new OutcomeMatrix(programOutcomes, contributionLevelMatrix);

        // Works create

        ArrayList<Work> works = new ArrayList<>();
        
        if(!TheoreticalCourseHoursNum_.getText().isEmpty()){
            works.add(new Work("CourseHours", Integer.parseInt(TheoreticalCourseHoursNum_.getText()), Integer.parseInt(TheoreticalCourseHoursDuration_.getText()),Integer.parseInt(TheoreticalCourseHoursWorkload_.getText())));
        }
        else if(!labNum_.getText().isEmpty()){
            works.add(new Work("Lab", Integer.parseInt(labNum_.getText()),Integer.parseInt(labDuration_.getText()),Integer.parseInt(labWorkload_.getText())));
        } 
        else if(!labNum_.getText().isEmpty()){
            works.add(new Work("StudyHours", Integer.parseInt(StudyHoursNum_.getText()),Integer.parseInt(StudyHoursDuration_.getText()),Integer.parseInt(labWorkload_.getText())));
        } 
        else if(!labNum_.getText().isEmpty()){
            works.add(new Work("FieldWork", Integer.parseInt(FieldWorkNum_.getText()),Integer.parseInt(FieldWorkDuration_.getText()),Integer.parseInt(labWorkload_.getText())));
        }
        else if(!labNum_.getText().isEmpty()){
            works.add(new Work("Quiz", Integer.parseInt(QuizNum_.getText()),Integer.parseInt(QuizDuration_.getText()),Integer.parseInt(labWorkload_.getText())));
        } 
        else if(!labNum_.getText().isEmpty()){
            works.add(new Work("Homework", Integer.parseInt(HwNum_.getText()),Integer.parseInt(HwDuration_.getText()),Integer.parseInt(labWorkload_.getText())));
        } 
        else if(!labNum_.getText().isEmpty()){
            works.add(new Work("Presentation", Integer.parseInt(PresentationNum_.getText()),Integer.parseInt(PresentationDuration_.getText()),Integer.parseInt(PresentationWorkload_.getText())));
        } 
        else if(!labNum_.getText().isEmpty()){
            works.add(new Work("Project", Integer.parseInt(ProjectNum_.getText()),Integer.parseInt(ProjectDuration_.getText()),Integer.parseInt(ProjectWorkload_.getText())));
        } 
        else if(!labNum_.getText().isEmpty()){
            works.add(new Work("Seminar", Integer.parseInt(SeminarNum_.getText()),Integer.parseInt(SeminarDuration_.getText()),Integer.parseInt(SeminarWorkload_.getText())));
        } 
        else if(!labNum_.getText().isEmpty()){
            works.add(new Work("Oral", Integer.parseInt(OralExamNum_.getText()),Integer.parseInt(OralExamDuration_.getText()),Integer.parseInt(OralExamWorkload_.getText())));
        }
        else if(!labNum_.getText().isEmpty()){
            works.add(new Work("Midterm", Integer.parseInt(MidtermNum_.getText()),Integer.parseInt(MidtermDuration_.getText()),Integer.parseInt(MidtermWorkload_.getText())));
        }
        else if(!labNum_.getText().isEmpty()){
            works.add(new Work("Final", Integer.parseInt(FinalExamNum_.getText()),Integer.parseInt(FinalExamDuration_.getText()),Integer.parseInt(FinalExamWorkload_.getText())));
        }   
        

        String syllabusID = newCourse.getSyllabusID(newCourse.getSyllabi().size()+1);
        Syllabus newSyllabus = new Syllabus(syllabusID,generalInfo,weeklySubjects,assesment,outcomeMatrix,works);
        newCourse.getSyllabi().add(newSyllabus);

        // Insert syllabus to database
        newSyllabus.insertSyllabus(db);

        // Go to courses page
        //PageLoader.loadPage("/CoursesPage.fxml", primaryStage);

    }

    private String getLearningOutcomeCode(String activityName,int ID) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException{

        StringBuilder learningOutcomeRelation = new StringBuilder();
        learningOutcomeRelation.append(ID);
        
        for(int i=1;i<=7;i++){
            TextField learningOutcomeChoice = (TextField) getClass().getDeclaredField(activityName+"_LO"+ i).get(this);
            learningOutcomeRelation.append(learningOutcomeChoice.getText());
        }

        return learningOutcomeRelation.toString();

    }

    


}
