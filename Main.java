package labproject;

import labproject.Edit;
import labproject.login;

public class Main {

    public static void main(String[] args) {

        System.out.println("\t\t\t-------------------------------------------");

        System.out.println("\t\t\t|                                         |");
        System.out.println("\t\t\t|           Online Book Store             |");
        System.out.println("\t\t\t|                                         |");
        System.out.println("\t\t\t|                                         |");
        System.out.println("\t\t\t|             By Team PMMM                |");
        System.out.println("\t\t\t|                                         |");
        
        System.out.println("\t\t\t-------------------------------------------");
        System.out.println("\t\t\t\n                                         ");
        
        
        login obj = new login();

        Edit obj1 = new Edit();
     

        obj.login();
        obj1.choice();
        obj1.educational1();
        obj1.story1();
        obj1.educational2();
        obj1.story2();
        obj1.tk();
        obj1.tk1();

    

    }
}
