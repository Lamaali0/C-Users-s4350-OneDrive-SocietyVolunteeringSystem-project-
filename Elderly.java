
package societyvolunteeringsystem;
import java.util.*;
/**
 * Class for the elderly.
 */
 public class Elderly extends volunteers implements Huors {
     protected String eldrelyName;
     protected  String day; 
     protected String eldrelyPhone;
     protected  String location;
     ArrayList <volunteers> volunteers =new ArrayList<> ();

     public Elderly(){
         this.eldrelyName = "null";
         this.day = "00/00/0000";
         this.eldrelyPhone = "0000000000";
         this.location = "null";
     }
/**
 * Method save Elderly information to be sent the information in to main by object 
 * @param eldrelyName First name of the Elder
 * @param day Determine the date of the increase
 * @param eldrelyPhone contact number
 * @param location location a house the Elder
 * @param volunteers ArrayList of type Volunteers 
 */     
     public Elderly(String eldrelyName, String day, String eldrelyPhone, String location, ArrayList volunteers) {
         this.eldrelyName = eldrelyName;
         this.day = day;
         this.eldrelyPhone = eldrelyPhone;
         this.location = location;
         this.volunteers = volunteers;
     }
/**
 * The method assigns its value to the attribute " eldrelyName ".
 * @param eldrelyName 
 */     
     public void seteldrelyName(String eldrelyName) {this.eldrelyName = eldrelyName;}
/**
 * The method returns the value to the attribute " eldrelyName ".
 * @return First name of the Elder
 */     
     public String geteldrelyName() {return eldrelyName;}
/**
 * The method assigns its value to the attribute " day ".
 * @param day 
 */     
     public void setday(String day) {this.day = day;}
/**
 * The method returns the value to the attribute " day ".
 * @return Determine the date of the increase
 */     
     public String getday() {return day;}
/**
 * The method assigns its value to the attribute " eldrelyPhone ".
 * @param eldrelyPhone 
 */     
     public void seteldrelyPhone(String eldrelyPhone) {this.eldrelyPhone = eldrelyPhone;}
/**
 * The method returns the value to the attribute " eldrelyPhone ".
 * @return contact number
 */     
     public String geteldrelyPhone() {return eldrelyPhone;}
/**
 * The method assigns its value to the attribute " location ".
 * @param location 
 */     
     public void setlocation(String location) {this.location = location;}
/**
 * The method returns the value to the attribute " location ".
 * @return location a house the Elder
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
     public String vooluteerHours() {return("The number of volunteer hour is (4).");}
/**
 * To print the final information
 * @return The elder Name , day , elder Phone and location. also volunteer name, ID number, phone number, and qualification
 */
     public String toString() {
        return("Eldrely Name: "+eldrelyName + "\nDay: "+day + "\nEldrely Phone: "+eldrelyPhone + "\nLocation: "+location + "\n"+volunteers);
     }
 }//class
