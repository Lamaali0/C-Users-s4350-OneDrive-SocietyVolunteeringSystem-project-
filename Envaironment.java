
package societyvolunteeringsystem;
import java.util.*;
/**
 * Class to help with environmental work.
 */
 public class Envaironment extends volunteers implements Huors {
     protected String day;
     protected String location;
     ArrayList <volunteers> volunteers =new ArrayList<> ();

     public Envaironment() {
         this.day = "00/00/0000";
         this.location = "null";
     }
/**
 * Method save event information to be sent the information in to main by object
 * @param day event day
 * @param location The location of the event
 * @param volunteers ArrayList of type Volunteers
 */     
     public Envaironment(String day, String location, ArrayList volunteers) {
         this.day = day;
         this.location = location;
         this.volunteers = volunteers;
     }
/**
 * The method assigns its value to the attribute " day ".
 * @param day 
 */     
     public void setday(String day) {this.day = day;}
/**
 * The method returns the value to the attribute " day ".
 * @return 
 */     
     public String getday() {return day;}
/**
 * The method assigns its value to the attribute " location ".
 * @param location 
 */     
     public void setlocation(String location) {this.location = location;}
/**
 * The method returns the value to the attribute " location ".
 * @return 
 */     
     public String getlocation() {return location;}
/**
 * ArrayList of type Volunteers
 * @param volunteers 
 */     
     public void setvolunteers(ArrayList<volunteers> volunteers) {this.volunteers = volunteers;}
/**
 * @return The volunteer name, ID number, contact phone number, and qualification
 */    
     public ArrayList<volunteers> getvolunteers() {return volunteers;}

@Override    
     public String vooluteerHours(){return "the number of volunteer hour is (3)";}
/**
 * To print the final information
 * @return The event day and location. also volunteer name, ID number, contact phone number, and qualification
 */    
     public String toString() {
        return("Day: "+day + "\nLocation: "+location + "\n"+volunteers);
     }
 }
