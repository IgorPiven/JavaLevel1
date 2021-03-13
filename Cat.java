package Lesson6;

public class Cat extends Animal {

    final int catLimitRun = 200;

    public Cat (String name) {
        super (name);
        super.animalRunDistanceLimit = catLimitRun;
        super.animalType = "Кошка";
    }

    @Override
    public void swim(int distanceSwim) {
        System.out.println("Кошка " + name + " не умеет плавать");
    }

}
