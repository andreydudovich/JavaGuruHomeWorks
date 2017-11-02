package lv.javaguru.homework.HumanFlowerWaterCan;

class Flower {
    boolean watered = false;

    public void setWatered(boolean watered) {
        this.watered = watered;
    }

    public boolean getWatered() {
        return watered;
    }
    public void isWatered() {
        if (watered) {
            System.out.println("The flower is watered!");
        } else {
            System.out.println("The flower is NOT watered!");
        }
    }
}
