package ooplab6;

import jdk.nashorn.internal.ir.WhileNode;

import java.util.StringTokenizer;

public class myStrToken {
    public static void main(String[] args) {
//        stringTokenizer
        String msg = "Welcome to RMUTSV";
        StringTokenizer myToken = new myStrToken(msg);
        System.out.println(myToken.countTokens());
        While (myToken.hasMoreElements()){
            myStringBuffer myBuffer = new StringBuffer(
            myToken.nextToken());
            System.out.println(myBuffer.reverse()+" ");

        }

    }//main
}//class
