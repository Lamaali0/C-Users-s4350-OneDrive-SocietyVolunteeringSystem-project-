
package societyvolunteeringsystem;
import java.util.*;
 public class Student extends volunteers implements Huors {
     protected String schoolName;
     protected  String day; 
     protected String manegerPhone;
     protected  String locationOfSchool; 
     ArrayList <volunteers> volunteers =new ArrayList<> ();

     public Student() {
         this.schoolName = "null";
         this.day = "00/00/0000";
         this.manegerPhone = "0000000000";
         this.locationOfSchool = "null";
     }
/**
 * Method save school information to be sent the information in to main by object
 * @param schoolName Name of the school
 * @param day The date of the increase
 * @param manegerPhone School principals contact number
 * @param locationOfSchool location a school
 * @param volunteers ArrayList of type Volunteers
 */     
     public Student(String schoolName, String day, String manegerPhone, String locationOfSchool, ArrayList volunteers) {
         this.schoolName = schoolName;
         this.day = day;
         this.manegerPhone = manegerPhone;
         this.locationOfSchool = locationOfSchool;
         this.volunteers = volunteers;
     }
/**
 * The method assigns its value to the attribute " schoolName ".
 * @param schoolName 
 */     
     public void setschoolName(String schoolName) {this.schoolName = schoolName;}
/**
 * The method returns the value to the attribute " schoolName ".
 * @return Name of the school
 */     
     public String getachoolName() {return schoolName;}
/**
 * The method assigns its value to the attribute " day ".
 * @param day 
 */     
     public void setday(String day) {this.day = day;}
/**
 * The method returns the value to the attribute " day ".
 * @return The date of the increase
 */
     public String getday() {return day;}
/**
 * The method assigns its value to the attribute " manegerPhone ".
 * @param manegerPhone 
 */
     public void setmanegerPhone(String manegerPhone) {this.manegerPhone = manegerPhone;}
/**
 * The method returns the value to the attribute " manegerPhone ".
 * @return School principals contact number
 */
     public String getmanegerPhone() {return manegerPhone;}
/**
 * The method assigns its value to the attribute " locationOfSchool ".
 * @param locationOfSchool 
 */
     public void setlocationOfSchool(String locationOfSchool) {this.locationOfSchool = locationOfSchool;}
/**
 * The method returns the value to the attribute " locationOfSchool ".
 * @return location a school
 */
     public String getlocationOfSchool() {return locationOfSchool;}     
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
     public String vooluteerHours() {return ("The number of volunteer hour is (6).");}
/**
 * To print the final information
 * @return The school name , day , phone number, and location Of School. also volunteer name, ID number, phone number, and qualification.
 */
     public String toString() {
         return("School Name: "+schoolName + "\nDay: "+day + "\nManeger Phone:"+manegerPhone + "\nLocation Of School: "+locationOfSchool + "\n"+volunteers);
     }
     

   


    
}
