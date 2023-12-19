package syllabustracker.model;

import java.util.ArrayList;

public class GeneralInfo {

    private Term term;
    private int theoryHours;
    private int labHours;
    private int localCredits;
    private int ects;
    private ArrayList<String> preReqs = new ArrayList<>();
    private Language language;
    private boolean courseType; // Required or Elective
    private Level courseLevel;
    private ArrayList<String> teachMethods = new ArrayList<>();
    private String coordinator;
    private ArrayList<String> lecturers = new ArrayList<>();
    private ArrayList<String> assistants = new ArrayList<>();
    private String objectives;
    private ArrayList<String> outcomes = new ArrayList<>();
    private String description;
    private Category courseCategory;


    public GeneralInfo(Term term, int theoryHours, int labHours, int localCredits, int ects, ArrayList<String> preReqs,
            Language language, boolean courseType, Level courseLevel, ArrayList<String> teachMethods,
            String coordinator, ArrayList<String> lecturers, ArrayList<String> assistants, String objectives,
            ArrayList<String> outcomes, String description, Category courseCategory) {
        this.term = term;
        this.theoryHours = theoryHours;
        this.labHours = labHours;
        this.localCredits = localCredits;
        this.ects = ects;
        this.preReqs = preReqs;
        this.language = language;
        this.courseType = courseType;
        this.courseLevel = courseLevel;
        this.teachMethods = teachMethods;
        this.coordinator = coordinator;
        this.lecturers = lecturers;
        this.assistants = assistants;
        this.objectives = objectives;
        this.outcomes = outcomes;
        this.description = description;
        this.courseCategory = courseCategory;
    }
    

    
}

enum Term {
    Spring,
    Fall,
    Both
}

enum  Language {
    English,
    Turkish,
    SecondForeign
}

enum Level {
    ShortCycle,
    FirstCycle,
    SecondCycle,
    ThirdCycle;
}

enum Category {
    Core,
    MajorArea,
    Supportive,
    CommAndManagement,
    Transferable,
}
