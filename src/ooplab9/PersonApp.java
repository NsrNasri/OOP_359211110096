package ooplab9;

public class PersonApp {
    public static void main(String[] args) {
        Person a = new Person("Nasri","359211110096",
        new Address("26","Pattani","94230"),
        new Job("student","9000"));
        System.out.print(a.toString());
    }//main
}//class
