package labproject;

import java.util.Scanner;

class Edit extends Variable {

    public void choice() {
        Scanner input = new Scanner(System.in);
        System.out.printf("\n\n\t\t\t\t--------------------------------------------------------");
        System.out.printf("\n\n\t\t\t\tEnter your choice (1 for buybook or 2 for rent book):-");
        System.out.printf("\n\n\t\t\t\t--------------------------------------------------------\n");
        
        num2 = input.nextInt();
        if (num2 == 1) {
            System.out.printf("\n\t\t\t\t\t---------------------");
            System.out.printf("\n\t\t\t\t\tSelect category:-\n");
            System.out.printf("\n\t\t\t\t\t1. For educational.\n");
            System.out.printf("\n\t\t\t\t\t2. For story.\n");
            System.out.printf("\n\t\t\t\t\t---------------------\n");
            
            num = input.nextInt();
            switch (num) {

                case 1:
                    educational1();
                    break;
                case 2:
                    story1();
                    break;

            }
        } else if (num2 == 2) {
            System.out.printf("\n\t\t\t\t\t-----------------------");
            System.out.printf("\n\t\t\t\t\tSelect category:-\n");
            System.out.printf("\n\t\t\t\t\t1. For For educational.\n");
            System.out.printf("\n\t\t\t\t\t2. For story.\n");
            System.out.printf("\n\t\t\t\t\t------------------------\n");
            
            num = input.nextInt();
            switch (num) {

                case 1:
                    educational2();
                    break;
                case 2:
                    story2();
                    break;

            }
        }
    }

    public void educational1() {
        Scanner input = new Scanner(System.in);
        System.out.printf("\n\t\t----------------------------------------------------------------------------");
        System.out.printf("\n\t\t1.C Programming              ---------------------------------------1000tk\n");
        System.out.printf("\n\t\t2.Java How To Program        ---------------------------------------1600tk\n");
        System.out.printf("\n\t\t3.Accounting Principles      ---------------------------------------1200tk\n");
        System.out.printf("\n\t\t4.Learn Data Structure       ---------------------------------------2000tk\n");
        System.out.printf("\n\t\t5.Mastering Web-Development  --------------------------------------- 750tk\n");
        System.out.printf("\n\t\t----------------------------------------------------------------------------\n");
        
       
        System.out.printf("\n\t\t\t\t\t----------------------");
        System.out.printf("\n\t\t\t\t\tchoose the product:-");
        System.out.printf("\n\t\t\t\t\t----------------------\n");
        
        num = input.nextInt();
        switch (num) {
            case 1:
                System.out.printf("\n\t\t\t\t\t------------------------------------");
                System.out.printf("\n\t\t\t\t\tEnter the quantity you want to buy:-");
                System.out.printf("\n\t\t\t\t\t------------------------------------\n");
                qt = input.nextInt();

                total = qt * 1000.00;
                System.out.printf("\n\t\t\t\t\tYour total bill is BDT %.2f\n\n", total);
                tk();
                break;
            case 2:
                System.out.printf("\n\t\t\t\t\t------------------------------------");
                System.out.printf("\n\t\t\t\t\tEnter the quantity you want to buy:-");
                System.out.printf("\n\t\t\t\t\t------------------------------------\n");
                qt = input.nextInt();

                total = qt * 1600.00;
                System.out.printf("\n\t\t\t\t\tYour total bill is BDT %.2f\n\n", total);
                tk();
                break;
            case 3:
                System.out.printf("\n\t\t\t\t\t------------------------------------");
                System.out.printf("\n\t\t\t\t\tEnter the quantity you want to buy:-");
                System.out.printf("\n\t\t\t\t\t------------------------------------\n");
                qt = input.nextInt();

                total = qt * 1200.00;
                System.out.printf("\n\t\t\t\t\tYour total bill is BDT %.2f\n\n", total);
                tk();
                break;
            case 4:
                System.out.printf("\n\t\t\t\t\t------------------------------------");
                System.out.printf("\n\t\t\t\t\tEnter the quantity you want to buy:-");
                System.out.printf("\n\t\t\t\t\t------------------------------------\n");
                qt = input.nextInt();

                total = qt * 2000.00;
                System.out.printf("\n\t\t\t\t\tYour total bill is BDT %.2f\n\n", total);
                tk();
                break;
            case 5:
                System.out.printf("\n\t\t\t\t\t------------------------------------");
                System.out.printf("\n\t\t\t\t\tEnter the quantity you want to buy:-");
                System.out.printf("\n\t\t\t\t\t------------------------------------\n");
                qt = input.nextInt();

                total = qt * 750.00;
                System.out.printf("\n\t\t\t\t\tYour total bill is BDT %.2f\n\n", total);
                tk();
                break;
        }
    }

    public void story1() {
        Scanner input = new Scanner(System.in);
        System.out.printf("\n\t\t-----------------------------------------------------------------------------");
        System.out.printf("\n\t\t1.Bitter Almonds              ---------------------------------------1400tk\n");
        System.out.printf("\n\t\t2.The Blue Between Sky Water  ---------------------------------------2500tk\n");
        System.out.printf("\n\t\t3.Secrets Under The Olive Tree---------------------------------------2000tk\n");
        System.out.printf("\n\t\t4.Sherlock Holmes             --------------------------------------- 700tk\n");
        System.out.printf("\n\t\t5.Harry Potter                --------------------------------------- 450tk\n");
        System.out.printf("\n\t\t-----------------------------------------------------------------------------\n");
       
        System.out.printf("\n\t\t\t\t\t--------------------");
        System.out.printf("\n\t\t\t\t\tchoose the product:-");
        System.out.printf("\n\t\t\t\t\t--------------------\n");
        
        num = input.nextInt();
        switch (num) {
            case 1:
                System.out.printf("\n\t\t\t\t\t------------------------------------");
                System.out.printf("\n\t\t\t\t\tEnter the quantity you want to buy:-");
                System.out.printf("\n\t\t\t\t\t------------------------------------\n");
                qt = input.nextInt();

                total = qt * 1400.00;
                System.out.printf("\n\t\t\t\t\tYour total bill is BDT %.2f\n\n", total);
                tk();
                break;
            case 2:
                System.out.printf("\n\t\t\t\t\t------------------------------------");
                System.out.printf("\n\t\t\t\t\tEnter the quantity you want to buy:-");
                System.out.printf("\n\t\t\t\t\t------------------------------------\n");
                qt = input.nextInt();

                total = qt * 2500.00;
                System.out.printf("\n\t\t\t\t\tYour total bill is BDT %.2f\n\n", total);
                tk();
                break;
            case 3:
                System.out.printf("\n\t\t\t\t\t------------------------------------");
                System.out.printf("\n\t\t\t\t\tEnter the quantity you want to buy:-");
                System.out.printf("\n\t\t\t\t\t------------------------------------\n");
                qt = input.nextInt();

                total = qt * 2000.00;
                System.out.printf("\n\t\t\t\t\tYour total bill is BDT %.2f\n\n", total);
                tk();
                break;
            case 4:
                System.out.printf("\n\t\t\t\t\t------------------------------------");
                System.out.printf("\n\t\t\t\t\tEnter the quantity you want to buy:-");
                System.out.printf("\n\t\t\t\t\t------------------------------------\n");
                qt = input.nextInt();

                total = qt * 700.00;
                System.out.printf("\n\t\t\t\t\tYour total bill is BDT %.2f\n\n", total);
                tk();
                break;
            case 5:
                System.out.printf("\n\t\t\t\t\t------------------------------------");
                System.out.printf("\n\t\t\t\t\tEnter the quantity you want to buy:-");
                System.out.printf("\n\t\t\t\t\t------------------------------------\n");
                qt = input.nextInt();

                total = qt * 450.00;
                System.out.printf("\n\t\t\t\t\tYour total bill is BDT %.2f\n\n", total);
                tk();
                break;
        }
    }

    public void educational2() {
        Scanner input = new Scanner(System.in);
        System.out.printf("\n\t\t----------------------------------------------------------------------------");
        System.out.printf("\n\t\t1.C Programming              ---------------------------------------400tk\n");
        System.out.printf("\n\t\t2.Java How To Program        ---------------------------------------600tk\n");
        System.out.printf("\n\t\t3.Accounting Principles      ---------------------------------------500tk\n");
        System.out.printf("\n\t\t4.Learn Data Structure       ---------------------------------------700tk\n");
        System.out.printf("\n\t\t5.Mastering Web-Development  ---------------------------------------350tk\n");
        System.out.printf("\n\t\t-----------------------------------------------------------------------------\n");
        

        System.out.printf("\n\t\t\t\t\t--------------------");
        System.out.printf("\n\t\t\t\t\tchoose the product-");
        System.out.printf("\n\t\t\t\t\t--------------------\n");
       
        num = input.nextInt();
        switch (num) {
            case 1:
                System.out.printf("\n\t\t\t\t\t------------------------------------");
                System.out.printf("\n\t\t\t\t\tEnter the quantity you want to buy:-");
                System.out.printf("\n\t\t\t\t\t------------------------------------\n");
                qt = input.nextInt();

                total = qt * 400.00;
                System.out.printf("\n\t\t\t\t\tYour total bill is BDT %.2f\n\n", total);
                tk1();
                break;
            case 2:
                System.out.printf("\n\t\t\t\t\t------------------------------------");
                System.out.printf("\n\t\t\t\t\tEnter the quantity you want to buy:-");
                System.out.printf("\n\t\t\t\t\t------------------------------------\n");
                qt = input.nextInt();

                total = qt * 600.00;
                System.out.printf("\n\t\t\t\t\tYour total bill is BDT %.2f\n\n", total);
                tk1();
                break;
            case 3:
                System.out.printf("\n\t\t\t\t\t------------------------------------");
                System.out.printf("\n\t\t\t\t\tEnter the quantity you want to buy:-");
                System.out.printf("\n\t\t\t\t\t------------------------------------\n");
                qt = input.nextInt();

                total = qt * 500.00;
                System.out.printf("\n\t\t\t\t\tYour total bill is BDT %.2f\n\n", total);
                tk1();
                break;
            case 4:
                System.out.printf("\n\t\t\t\t\t------------------------------------");
                System.out.printf("\n\t\t\t\t\tEnter the quantity you want to buy:-");
                System.out.printf("\n\t\t\t\t\t------------------------------------\n");
                qt = input.nextInt();

                total = qt * 700.00;
                System.out.printf("\n\t\t\t\t\tYour total bill is BDT %.2f\n\n", total);
                tk1();
                break;
            case 5:
                System.out.printf("\n\t\t\t\t\t------------------------------------");
                System.out.printf("\n\t\t\t\t\tEnter the quantity you want to buy:-");
                System.out.printf("\n\t\t\t\t\t------------------------------------\n");
                qt = input.nextInt();

                total = qt * 350.00;
                System.out.printf("\n\t\t\t\t\tYour total bill is BDT %.2f\n\n", total);
                tk1();
                break;
        }
    }

    public void story2() {
        Scanner input = new Scanner(System.in);
        System.out.printf("\n\t\t----------------------------------------------------------------------------");
        System.out.printf("\n\t\t1.Bitter Almonds              ---------------------------------------500tk\n");
        System.out.printf("\n\t\t2.The Blue Between Sky Water  ---------------------------------------800tk\n");
        System.out.printf("\n\t\t3.Secrets Under The Olive Tree---------------------------------------1000tk\n");
        System.out.printf("\n\t\t4.Sherlock Holmes             --------------------------------------- 350tk\n");
        System.out.printf("\n\t\t5.Harry Potter                --------------------------------------- 200tk\n");
        System.out.printf("\n\t\t----------------------------------------------------------------------------\n");
       

        System.out.printf("\n\t\t\t\t\t--------------------");
        System.out.printf("\n\t\t\t\t\tchoose the product:-");
        System.out.printf("\n\t\t\t\t\t--------------------\n");
      
        
        num = input.nextInt();
        switch (num) {
            case 1:
                System.out.printf("\n\t\t\t\t\t------------------------------------");
                System.out.printf("\n\t\t\t\t\tEnter the quantity you want to buy:-");
                System.out.printf("\n\t\t\t\t\t------------------------------------\n");
                qt = input.nextInt();

                total = qt * 500.00;
                System.out.printf("\n\t\t\t\t\tYour total bill is BDT %.2f\n\n", total);
                tk1();
                break;
            case 2:
                System.out.printf("\n\t\t\t\t\t------------------------------------");
                System.out.printf("\n\t\t\t\t\tEnter the quantity you want to buy:-");
                System.out.printf("\n\t\t\t\t\t------------------------------------\n");
                qt = input.nextInt();

                total = qt * 800.00;
                System.out.printf("\n\t\t\t\t\tYour total bill is BDT %.2f\n\n", total);
                tk1();
                break;
            case 3:
                System.out.printf("\n\t\t\t\t\t------------------------------------");
                System.out.printf("\n\t\t\t\t\tEnter the quantity you want to buy:-");
                System.out.printf("\n\t\t\t\t\t------------------------------------\n");
                qt = input.nextInt();

                total = qt * 1000.00;
                System.out.printf("\n\t\t\t\t\tYour total bill is BDT %.2f\n\n", total);
                tk1();
                break;
            case 4:
                System.out.printf("\n\t\t\t\t\t------------------------------------");
                System.out.printf("\n\t\t\t\t\tEnter the quantity you want to buy:-");
                System.out.printf("\n\t\t\t\t\t------------------------------------\n");
                qt = input.nextInt();

                total = qt * 350.00;
                System.out.printf("\n\t\t\t\t\tYour total bill is BDT %.2f\n\n", total);
                tk1();
                break;
            case 5:
                System.out.printf("\n\t\t\t\t\t------------------------------------");
                System.out.printf("\n\t\t\t\t\tEnter the quantity you want to buy:-");
                System.out.printf("\n\t\t\t\t\t------------------------------------\n");
                qt = input.nextInt();

                total = qt * 200.00;
                System.out.printf("\n\t\t\t\t\tYour total bill is BDT %.2f\n\n", total);
                tk1();
                break;
        }
    }

    public void tk() {
        Scanner input = new Scanner(System.in);

        System.out.printf("\t\t\t\t\t-----------------");
        System.out.printf("\n\t\t\t\t\tPAYMENT METHODS\n");
        System.out.printf("\t\t\t\t\t-----------------\n");
        System.out.printf("\n\t\t\t\t\tType 1 for Cash on Delivery.\n");
        System.out.printf("\n\t\t\t\t\tChoose Payment Option:-");

        num = input.nextInt();
        switch (num) {
            case 1:
                System.out.printf("\nGive us the shipping address of your where we deliver your product:-");

                address = input.next();
                System.out.printf("\n\t\t\t\t\tEnter your contact number:-");
                phone_no = input.nextInt();
                System.out.printf("\n\tThanks you sir! We will deliver your product in your hand in few days!\n");
                System.out.printf("\n\tSir, if you want more to buy type y for yes or n for no?:-");
                str = input.next();
                switch (str) {

                    case "y":

                        choice();

                    case "n":
                        System.out.print("\n\t\t\t\t\tThank you for buying Book");
                        System.exit(0);

                }
        }
    }

    public void tk1() {
        Scanner input = new Scanner(System.in);

        System.out.printf("\t\t\t\t\t---------------");
        System.out.printf("\n\t\t\t\t\tPAYMENT METHODS\n");
        System.out.printf("\t\t\t\t\t---------------");
        System.out.printf("\nType 1 for Cash on Delivery For Renting Book.\n");
        System.out.printf("\n\t\t\t\t\tChoose Payment Option:-");

        num = input.nextInt();
        switch (num) {
            case 1:
                System.out.printf("\nGive us the shipping address of your where we deliver your product:-");

                address = input.next();
                System.out.printf("\n\t\t\t\t\tEnter your contact number:-");
                phone_no = input.nextInt();
                System.out.printf("\n\tThanks you sir!\n We will deliver your product in your hand in few days!\nAnd we will take back our book from to after 7 days.\nAfter 7 days if you failed to return the book,\n you have to pay extra 10TK for per day.\n");
                System.out.printf("\n\tSir, if you want more to buy type y for yes or n for no?:-");
                str = input.next();
                switch (str) {

                    case "y":
                        choice();

                    case "n":
                        System.out.println("\n\t\t\t\t\tThank You");
                        System.exit(0);

                }
        }

    }

}
