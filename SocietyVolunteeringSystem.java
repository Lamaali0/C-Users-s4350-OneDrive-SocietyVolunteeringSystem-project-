    package societyvolunteeringsystem;
    import java.util.ArrayList;
    import java.util.Scanner;
    public class SocietyVolunteeringSystem {
/**
 * A program that serves volunteer work in a simplified way, so that it helps in organizing the volunteer's volunteer work.
*   *((|)) The volunteer must be 18 years old or over.
*   *((||)) If he is within the allowed age, the volunteer must enter (his name, ID, Phone number and qualification).
*   *((|||)) He chooses the volunteer work he wants (service for the elderly, schools, the environment or first aid).
*   *((||||)) Volunteer information is printed with volunteer service information
 */        
    public static void main(String[] args) {
     Scanner inputUser = new Scanner(System.in); //*Reading the information from the user by class Scanner        
     ArrayList <volunteers> volunteers =new ArrayList<> (); //*Array List Type of class Volunteer.
         System.out.println("You're welcome in Society Volunteering System. ");        
         System.out.print("Enter your age: "); //*Enter a value from the user, which is the age, to know whether it is possible to volunteer or not.
             int age=inputUser.nextInt();
     if(age>=18){    
         System.out.print("Enter your name: "); //*The sentence that contains the required information appears and the user enters the information.
             String name=inputUser.next();  
         System.out.print("Enter your ID: ");
             int ID=inputUser.nextInt();
         System.out.print("Enter your number Phone: +966 ");
             int Phone=inputUser.nextInt();      
         System.out.print("Enter your qualification: ");
             String qualification=inputUser.next();             
         volunteers.add(new volunteers(name,ID,Phone,qualification){}); //*Information is sent to ArrayList type of Volunteers.
         //*This sentence appears so that the user knows how to choose the volunteer work he wants.
         System.out.printf("....\n*Dear %s, please choose the field of volunteering you want\n\"all you have to write is the number that corresponds to the volunteer work\". \n",name);
         System.out.println("*(1)Seniors Service.\n*(2)Student service in schools.\n*(3)First aid.\n*(4)Environmental Service.");
         System.out.print("Enter the number: "); //*Each volunteer work has a dedicated number
             int number=inputUser.nextInt(); 
         //*Once the number is entered, all the information for the volunteer and volunteer work is printed.
         System.out.println("-------------------"); 
             switch (number) {
                 case 1: //Seniors Service.
                     //It's an object of a type Elderly it contains static information, Also an ArrayList that contains volunteer information(The use of Polymorphism).
                     volunteers objElderly = new Elderly("Ahmed","02/06/2022","0534953110","MECCA",volunteers); 
                     Elderly elderly = (Elderly) objElderly; //DownCasting
                     System.out.println(objElderly+"\n"+objElderly.vooluteerHours()); //Printing the object information and also the method of the number of hours
                     break;
                 case 2: //Student service in schools.
                     //It's an object of a type Student it contains static information, Also an ArrayList that contains volunteer information.
                     Student objStudent = new Student("64","02/06/2022","0534953110","MECCA",volunteers);
                     System.out.println(objStudent+"\n"+objStudent.vooluteerHours()); //Printing the object information and also the method of the number of hours
                     break;
                 case 3: //First aid.
                     //It's an object of a type bandAid it contains static information, Also an ArrayList that contains volunteer information.
                     bandAid objbandAid = new bandAid("king faisal hospital","02/06/2022","MECCA",volunteers);
                     System.out.println(objbandAid+"\n"+objbandAid.vooluteerHours()); //Printing the object information and also the method of the number of hours
                     break;
                 case 4: //Environmental Service.
                     //It's an object of a type Envaironment it contains static information, Also an ArrayList that contains volunteer information.
                     Envaironment objEnvaironment = new Envaironment("02/06/2022","MECCA",volunteers);
                     System.out.println(objEnvaironment+"\n"+objEnvaironment.vooluteerHours()); //Printing the object information and also the method of the number of hours
                     break;
             }//end switch
     }//end if        
     else{
         System.out.println("We apologize, you are under the age limit. "); //The volunteer must be 18 years old or older 
     }//end else if
     }//main
     }//class

     /*
     Program development:
     1/ It is possible to develop the program using databases ,So that there is a database of volunteer work and another database of volunteers 
     where each volunteer can choose the type of volunteer work and the date that suits him, because there are a lot of the volunteer work.

     2/ The types of volunteer work can also be increased.
     */

