package syllabustracker.model;

public class Activity {

    private String name;
    private int number;
    private int weighting;

    
    public Activity(String name, int number, int weighting) {
        this.name = name;
        this.number = number;
        this.weighting = weighting;
    }


    public String getName() {
        return name;
    }


    public int getNumber() {
        return number;
    }


    public int getWeighting() {
        return weighting;
    }

    

    
    
}
