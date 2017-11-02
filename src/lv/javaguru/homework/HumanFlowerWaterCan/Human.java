package lv.javaguru.homework.HumanFlowerWaterCan;

class Human {
    WaterCan waterCan = null;
    Water water = null;

    String tryToWater = "Trying to water the flower!";

    public void water(Flower flower) {
        if ((waterCan != null) && (water != null)) {
            System.out.println(tryToWater);
            flower.setWatered(true);
        } else if (waterCan == null) {
            System.out.println(tryToWater);
            System.out.println("No watering can found!");
        } else if ((waterCan != null) && (water == null)) {
            System.out.println(tryToWater);
            System.out.println("Unfortunately watering can is empty. Please fill it!");
        } else {
            System.out.println(tryToWater);
            System.out.println("Something went wrong! You have a water but don't have watering can!");
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
}
