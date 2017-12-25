package ooplap5;

import java.util.Scanner;

//1. declare array as Integer
//2. allow user to input data into array
//3. show data in array
public class InputDataToArray {
    private static int Max = 5;
    public static void main (String[] args){
        Integer []num = new Integer[Max];
        //int []num2 = new int [Max];
        num = inputData(num);
        showData(num);
    }//main

    private static void showData(Integer[] num) {
        System.out.print("Data in array");
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        //enchanace loop
        for (int i:num)
        return num;{
        System.out.print(i+" ");

    private static Integer[] inputData(Integer[] num) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an interger: ");
        for (int i=0;i<num.length;i++){
            System.out.print("num{"+i+"]:");
            num[i] = scanner.nextInt();
        }

        }
        System.out.print();
    }//inputData
}//class
