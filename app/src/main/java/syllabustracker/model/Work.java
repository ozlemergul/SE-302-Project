package syllabustracker.model;

public class Work {

    private String name;
    private int number;
    private int duration;


    public Work(String name, int number, int duration) {
        this.name = name;
        
        this.number = number;

        if(duration >= 0){
        this.duration = duration;
        }
    }

    
    
}
