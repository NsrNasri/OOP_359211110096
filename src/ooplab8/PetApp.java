package ooplab8;

public class PetApp {
    public static void main (String[] args){
        Dog dog = new Dog("Bow","whaith","Female","2");
        System.out.println(dog.toString());
        Cat cat = new Cat("Suwai","red","Femaly","3");
        System.out.println(cat.getClass()+" "+cat.toString());
        dog.makeNoise();
        cat.makeNoise();

    }//main
}//class
