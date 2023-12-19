package syllabustracker.model;
import java.util.Date;

public class ChangeLog {

    private String lecturer;
    private String reason;
    private Date date;
    private String changeID;

    
    public ChangeLog(String lecturer, String reason, Date date, String changeID) {
        this.lecturer = lecturer;
        this.reason = reason;
        this.date = date;
        this.changeID = changeID;
    }


    
    
}
