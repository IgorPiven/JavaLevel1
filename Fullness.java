package Lesson7;

public class Fullness {

    public boolean isBellyStuffed(Plate p, int appetite, boolean fullness, String name, String animalType) {

        if (!fullness) {

            if (p.getFood() < appetite) {
                System.out.println("В миске недостаточно еды. " + animalType + " " + name + " ест " + appetite + " единиц еды");
                System.out.println(animalType + " " + name + " остался голодным");
                p.fillPlate(appetite);
                return false;
            } else {
                p.decreaseFood(appetite);
                System.out.println(animalType + " " + name + " съел " + appetite + " единиц еды");
                return true;
            }
        } else {
            System.out.println(animalType + " " + name + " сыт.");
            return true;
        }
    }
}