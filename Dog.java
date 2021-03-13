package Lesson6;

public class Dog extends Animal {

    final int dogLimitRun = 500;
    final int dogLimitSwim = 10;

    public Dog (String name) {
        super (name);
        super.animalRunDistanceLimit = dogLimitRun;
        super.animalSwimDistanceLimit = dogLimitSwim;
        super.animalType = "Собака";
    }
}
