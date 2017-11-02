package lv.javaguru.homework.HumanFlowerWaterCan;

public class HumanFlowerWaterCanMain {
    public static void main(String[] args) {

        Human human = new Human();
        Flower flower = new Flower();

        human.water(flower); //Flower is not eatered
        flower.isWatered(); // No
        human.takeWaterCan(new WaterCan());
        human.water(flower);
        flower.isWatered();
        human.fillWaterCan(new Water());
        human.water(flower);
        flower.isWatered();
    }
}




