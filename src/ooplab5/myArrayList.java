package ooplab5;

import java.util.ArrayList;

public class myArrayList {
    public static void main(string[] args){
        ArrayList myList = new ArrayList();
        //add method
        myList.add("Nasri");
        System.out.println(myList);
        myList.add("Khwan");
        myList.add("Ae");
        System.out.println(myList);
        System.out.println(myList.size());
        myList.add(2,"Hello");
        System.out.println(myList);
        myList.add(1,100);
        System.out.println(myList);
        myList.set(0,"Nasri");
        System.out.println(myList);
        myList.remove("Hello");
        System.out.print(myList);
        System.out.print(myList.indexOf(100));

    }//main
}//class
