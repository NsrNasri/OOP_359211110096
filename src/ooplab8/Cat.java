package ooplab8;

public class Cat extends Pet{
    public Cat(String name, String hairColor, String gender, String age) {
        super(name, hairColor, gender, age);
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("MeawMeaw !!!");

    }
}