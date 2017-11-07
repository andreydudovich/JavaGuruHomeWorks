package lv.javaguru.homework.HumanFlowerWaterCan;

class Human {
    WaterCan waterCan = null;
    Water water = null;


    public void water(Flower flower) {

        String tryToWater = "Trying to water the flower!";

        if ((waterCan != null) && (water != null)) {
            System.out.println(tryToWater);
            flower.setWatered(true);
        } else if (waterCan == null) {
            System.out.println(tryToWater);
            System.out.println("No watering can found!");
        } else {
            System.out.println(tryToWater);
            System.out.println("Unfortunately watering can is empty. Please fill it!");
        }
    }

    public void takeWaterCan(WaterCan waterCan) {
        this.waterCan = waterCan;
        System.out.println("The watering can is taken!");
    }


    public void fillWaterCan(Water water) {
        this.water = water;
        System.out.println("The watering can is filled by water!");

    }

    private void easyString(String test2) {
        System.out.println("Trying to water the flower!");
        System.out.println(test2);
    }
}
