package ooplab7;

public class StudentApp {
    public static void main(String[] args) {
    //create objiect as student
        Student s1 = new Student();
        s1.setId("111111111111");
        s1.setName("Boy saiyai");
        s1.setMajor("Information System");
        s1.setGroup("IS221");

        Student s2 = new Student("222222222222",
                "Gril Saiyai",
                "Maketing",
                "MK221");
        showData (s1);



    }//main

    private static void showData(Student s) {
        System.out.println("Student info: ");
        System.out.println("ID: "+s.getId());
        System.out.println("Name: "+s.getName());
        System.out.println("Mager "+s.getMajor());
        System.out.println("Group: "+s.getGroup());


    }//showData
}//class
