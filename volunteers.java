
package societyvolunteeringsystem;
/**
 * Class takes care of volunteer information.
*/
 public abstract class volunteers implements Huors {
     protected String volunterName;
     protected int volunterID;
     protected int volunterPhone;
     protected String qualification ;

     public volunteers() {
         this.volunterName = "null";
         this.volunterID = 0000000000;
         this.volunterPhone = 0000000000;
         this.qualification = "null";
     }
/**
 * Method saves volunteer information to be sent to other classes
 * @param volunterName First name of the volunteer
 * @param volunterID Volunteer ID number
 * @param volunterPhone Volunteer phone number when needed to contact
 * @param qualification Qualified for the volunteer to knowledge only
 */
     public volunteers(String volunterName, int volunterID, int volunterPhone, String qualification) {
        this.volunterName = volunterName;
        this.volunterID = volunterID;
        this.volunterPhone = volunterPhone;
        this.qualification = qualification;
     }
/**
 * The method assigns its value to the attribute " volunterName ".
 * @param volunterName 
 */     
     public void setVolunterName(String volunterName) {this.volunterName = volunterName;}
/**
 * The method returns the value to the attribute " volunterName ".
 * @return First name of the volunteer
 */     
     public String getVolunterName() {return volunterName;}
/**\
 * The method assigns its value of the attribute "volunterID".
 * @param volunterID 
 */
     public void setVolunterID(int volunterID) {this.volunterID = volunterID;}
/**
 * The method returns the value to the attribute " VolunterID ".
 * @return Volunteer ID number
 */     
     public int getVolunterID() {return volunterID;}
/**
 * The method assigns its value to the attribute " VolunterPhone ".
 * @param volunterPhone 
 */
     public void setVolunterPhone(int volunterPhone) {this.volunterPhone = volunterPhone;}
/**
 * The method returns the value to the attribute " VolunterPhone ".
 * @return Volunteer phone number
 */     
     public int getVolunterPhone() {return volunterPhone;}
/**
 * The method assigns its value to the attribute " qualification ".
 * @param qualification 
 */     
     public void setQualification(String qualification) {this.qualification = qualification;}
/**
 * The method returns the value to the attribute " qualification ".
 * @return Qualified for the volunteer
 */
     public String getQualification() {return qualification;}

@Override
     public String vooluteerHours(){return null;}
/**
 * To print the final information
 * @return The volunteer name, ID number, phone number, and qualification
 */
     public String toString() {
        return ("Volunter Name: "+volunterName + "\nVolunter ID: "+volunterID + "\nVolunter Phone: +996 "+volunterPhone + "\nQualification: "+qualification );
     }
    
}//class
