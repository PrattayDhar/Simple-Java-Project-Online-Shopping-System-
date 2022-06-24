package labproject ;

import java.util.Scanner;

public class login extends Variable {

  
    
    public void login() {


        Scanner input = new Scanner(System.in);
       
        System.out.printf("\n\t\tEnter Username:-");
        String user = input.next();
        System.out.printf("\n\t\tEnter Password:-");
        String pass = input.next();
         if(user.equals("green")&&pass.equals("green123")){
            System.out.print("log in Succesful");


        }
         else{
             System.out.print("Login Failed, Incorrect User and Password Try Again");

             System.exit(0);
         }
     
      }

    
    }



  