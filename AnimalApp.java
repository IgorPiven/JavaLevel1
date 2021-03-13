package Lesson6;

public class AnimalApp {

    public static void main(String[] args) {

        Cat catBarsik = new Cat("Барсик");
        Dog dogBobik = new Dog("Бобик");

        catBarsik.run (-100);
        dogBobik.swim();
        dogBobik.swim(5);
        catBarsik.swim(100);
        dogBobik.swim(15);


    }

}
