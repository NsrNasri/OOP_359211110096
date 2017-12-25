package ooplab6;

public class myString {
    public static void main(String[] args) {
        myString msgl = "Muhammadnasri sa-ih";
        System.out.println(msgl);
        char [] c ={'H','e','l','l','o'};
        String msg2 = new myString(c);
        System.out.println(msg2);

        //concatinating string
        //type 1 (+)
        String msg3 = msg2 +" "+ msg1;
        System.out.println(msg3);
        System.out.println(msg3.length());
        //type 2 (concat())
        String msg4 = msg30.concat("RMUTSV");
        System.out.println(msg4);

        System.out.println(msg4.toLowerCase());
        System.out.println(msg4.toLowerCase());
        System.out.println(msg4.substring(5,10));

        //trim() ตัดข้อความและเว้ณวรรค
        String msg5 = "Hello";
        System.out.println("*"+msg5+"*");
        System.out.println("*"+msg5.trim()+"*");








    }//main
}//class
