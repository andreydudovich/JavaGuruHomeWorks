package lv.javaguru.homework.HumanFlowerWaterCan;

public class HumanFlowerWaterCanMain {
    public static void main(String[] args) {

        Human human = new Human();
        Flower flower = new Flower();

        human.water(flower);
        flower.isWatered();
        human.takeWaterCan(new WaterCan());
        human.water(flower);
        flower.isWatered();
    }
}




