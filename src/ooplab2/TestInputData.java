package ooplab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestInputData {
    public  static  void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("What is your name? :");
        String name = reader.readLine();
        System.out.println("Your name is "+name);
        System.out.println("How old are yuo?");
        int age = Integer.parseInt(reader.readLine());
        System.out.println("You rae "+age+" years old.");

//        Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whare are you?:");
        String address = scanner.next();
        System.out.println("you from: "+address);

}//main
}//class