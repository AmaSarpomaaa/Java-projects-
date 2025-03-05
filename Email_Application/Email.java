package Email_Application;

import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private String alternateEmail;

    //Constructor to recive the first and last name 
    public Email(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println("EMAIL CREATED: "+ this.firstname + " "+ this.lastname);

        //Call a methond to ask for the department: return the department
        this.department = setDepartment();
        System.out.println("Department: "+ this.department);
    }

    // Ask for the department 
    private String setDepartment(){
        System.out.print("DEPARTMENT CODES\n1 for Sale\n2 for Developement\n3 for Accounting\n0 for none\nEnter departement code:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1){
            return "sales";
        }else if (depChoice == 2) {
            return "Dev";
        }else if(depChoice == 3){
            return "Account";
        }else{
            return "";
        }
    }

    //Generate random password 

    //Set the mailbox capacity 

    //Set the alternate email

    //Change the password

}