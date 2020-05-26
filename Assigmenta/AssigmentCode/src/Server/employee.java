package Server;

import java.time.LocalDate;
import java.time.Period;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.image.Image;

/**
 *
 * @author jwright
 */
public class employee {
    private String firstName, lastName,Eid,Eemail,Ejob,Eorg;


    public employee(String firstName, String lastName,String Eid, String Eemail,String Ejob, String Eorg) {
        this.firstName = (firstName);
        this.lastName = (lastName);
        this.Eid = (Eid);
        
        this.Eemail = (Eemail);
        this.Ejob = (Ejob);
        
        this.Eorg =  (Eorg);
        
      
       
    }
    
 
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = (lastName);
    }

  
    
    public String getEid() {
		return Eid;
	}


	public void setEid(String eid) {
		Eid = eid;
	}


	public String getEemail() {
		return Eemail;
	}


	public void setEemail(String eemail) {
		Eemail = eemail;
	}


	public String getEjob() {
		return Ejob;
	}


	public void setEjob(String ejob) {
		Ejob = ejob;
	}


	public String getEorg() {
		return Eorg;
	}


	public void setEorg(String eorg) {
		Eorg = eorg;
	}

@Override
	public String toString()
    {
        return String.format("%s %s %s %s %s %s", firstName, lastName,Eid,Eemail,Ejob,Eorg);
    }
}