package syllabustracker.model;

import java.util.ArrayList;

public class Syllabus {


    private double version;
    private GeneralInfo generalInfo;
    private WeeklySubjects weeklySubjects;
    private Assesment assesment;
    private OutcomeMatrix OutcomeMatrix;
    private ArrayList<Work> workLoad = new ArrayList<>();


    public Syllabus(double version, GeneralInfo generalInfo, WeeklySubjects weeklySubjects, Assesment assesment,
            syllabustracker.model.OutcomeMatrix outcomeMatrix, ArrayList<Work> workLoad) {
                
        this.version = version;
        this.generalInfo = generalInfo;
        this.weeklySubjects = weeklySubjects;
        this.assesment = assesment;
        this.OutcomeMatrix = outcomeMatrix;
        this.workLoad = workLoad;
    }

    
    
}
