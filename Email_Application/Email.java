package Email_Application;

import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private int deafaultPasswordLength = 14;
    private String alternateEmail;

    //Constructor to recive the first and last name 
    public Email(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println("EMAIL CREATED: "+ this.firstname + " "+ this.lastname);

        //Call a methond to ask for the department: return the department
        this.department = setDepartment();
        System.out.println("Department: "+ this.department);

        //Call a method that returns a random password
        this.password = randomPassword(deafaultPasswordLength);
        System.out.println("Your password is: "+ this.password);

        
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
    public String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890$@%#&*";
        char[] password = new char[length];
        for (int i = 0; i <length; i++) {
            int rand = (int) (Math.random()) * passwordSet.length();
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //Set the mailbox capacity 

    //Set the alternate email

    //Change the password

}