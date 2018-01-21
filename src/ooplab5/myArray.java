package ooplab5;

public class myArray {
    public static int Max = 10;
    public static void main (String[] args){
        // array
            int []num;
            num = new int[5];
//            System.out.print(num[0]);
//            System.out.print(num[1]);
//            System.out.print(num[2]);
//            System.out.print(num[3]);
//            System.out.print(num[4]);
//            System.out.print(num.length);
            showData(num);
            num[1] = 100;
            num[3] = num[1] * 3; //100*3=300
            num[5 - 1] = num[3] / 50; // 300/50 = 6;
            num[5] = 500;
            showData(num);
            int num2[] = new int[Max]; //10 elements
        showData(num2);





    }//main

    private static void showData(int[] num) {
        System.out.print("Data in array");
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
}//class
