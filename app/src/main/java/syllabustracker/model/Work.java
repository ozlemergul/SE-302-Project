package syllabustracker.model;

public class Work {

    private String name;
    private int number;
    private int duration;
    private int load;


    public Work(String name, int number, int duration,int load) {
        this.name = name;
        
        this.number = number;

        if(duration >= 0){
        this.duration = duration;
        }

        this.load = load;
    }


    public String getName() {
        return name;
    }


    public int getNumber() {
        return number;
    }


    public int getDuration() {
        return duration;
    }


    public int getLoad() {
        return load;
    }

    

    
    
}
