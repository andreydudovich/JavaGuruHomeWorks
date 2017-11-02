package lv.javaguru.homework.HumanFlowerWaterCan;

public class HumanFlowerWaterCanMain {
    public static void main(String[] args) {

        Human human = new Human();
        Flower flower = new Flower();

        human.water(flower); //No watering can
        flower.isWatered();  //Flower is not watered
        human.takeWaterCan(new WaterCan());
        human.water(flower); //Watering can is empty
        flower.isWatered();  //Flower is not watered
        human.fillWaterCan(new Water());
        human.water(flower);
        flower.isWatered();  //Flower is watered
    }
}




