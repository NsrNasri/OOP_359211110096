package ooplab3;

import java.util.Scanner;

public class TestSwitch {
    public  static void main(String [] args){
        int select;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number between 1-3: ");
        select = scanner.nextInt();
//        switch-case
        switch (select){
            case 1: System.out.println("Your enter 1");break;
            case 2: System.out.println("Your enter 2");break;
            case 3: System.out.println("Your enter 3");break;
            default: System.out.println("Please enter number between 1-3, Thank You");

        }//switch
        char c = 'A';
        switch (c){
            case 'A': System.out.println("A ant");break;
            case 'B': System.out.println("B ant");break;
            case 'C': System.out.println("C ant");break;
            default:System.out.println("Thank You");
        }//switch
    }//mani
}//class
