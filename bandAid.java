
package societyvolunteeringsystem;
import java.util.*;
 public class bandAid extends volunteers implements Huors{
     protected String hospitalName;
     protected String day;     
     protected String location;
     ArrayList <volunteers> volunteers =new ArrayList<> ();

     public bandAid() {
         this.hospitalName = "null";
         this.location = "null";
         this.day = "00/00/0000";
     }
/**
 * 
 * @param hospitalName The name of the hospital
 * @param day Date of assistance
 * @param location location a hospital
 * @param volunteers ArrayList of type Volunteers
 */     
     public bandAid(String hospitalName, String day, String location, ArrayList volunteers) {
         this.hospitalName = hospitalName;
         this.day = day;
         this.location = location;
         this.volunteers = volunteers;
     }
/**
 * The method assigns its value to the attribute " hospitalName ".
 * @param hospitalName 
 */     
     public void sethospitalName(String hospitalName) {this.hospitalName = hospitalName;}
/**
 * The method returns the value to the attribute " hospitalName ".
 * @return The name of the hospital
 */
     public String gethospitalName() {return hospitalName;}
/**
 * The method assigns its value to the attribute " day ".
 * @param day 
 */     
     public void setday(String day) {this.day = day;}
/**
 * The method returns the value to the attribute " day ".
 * @return Date of assistance
 */     
     public String getday() {return day;}
/**
 * The method assigns its value to the attribute " location ".
 * @param location 
 */     
     public void setlocation(String location) {this.location = location;}
/**
 * The method returns the value to the attribute " location ".
 * @return location a hospital
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
     public String vooluteerHours(){return("The number of volunteer hour is (5).");}
/**
 * To print the final information
 * @return The hospital name , day and location Of hospital. also volunteer name, ID number, phone number, and qualification.
 */
     public String toString() {
        return("Hospital Name: "+hospitalName + "\nDay: "+day + "\nLocation: "+location + "\n"+volunteers);
     } 

 }//class
