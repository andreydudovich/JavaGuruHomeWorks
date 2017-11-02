package lv.javaguru.homework.HumanFlowerWaterCan;

class Human {
    WaterCan waterCan = null;

    public void water(Flower flower) {
        if (waterCan != null) {
            System.out.println("Trying to water the flower!");
            flower.setWatered(true);
        } else {
            System.out.println("Trying to water the flower!");

        }
    }

    public void takeWaterCan(WaterCan waterCan) {
        this.waterCan = waterCan;
        System.out.println("The watering can is taken!");
    }


}
