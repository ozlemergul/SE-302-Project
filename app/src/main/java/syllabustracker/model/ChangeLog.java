package syllabustracker.model;
import java.util.Date;

import syllabustracker.util.Database;

public class ChangeLog {

    private String lecturer;
    private String reason;
    private Date date;

    
    public ChangeLog(String lecturer, String reason, Date date) {
        this.lecturer = lecturer;
        this.reason = reason;
        this.date = date;
    }

    public void insertChangeLog (String oldSyllabusID, String newSyllabusID, Database db){

        if(db.getConnection() == null){
            db.connect();
        }

        db.insertData("change_log", oldSyllabusID,newSyllabusID,getChangeID(oldSyllabusID, newSyllabusID),reason,lecturer,date.toString());


       

    }


    private String getChangeID(String oldSyllabusID, String newSyllabusID){
        return oldSyllabusID+"C"+newSyllabusID;
    }


    
    
}
