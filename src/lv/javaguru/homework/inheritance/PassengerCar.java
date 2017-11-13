package lv.javaguru.homework.inheritance;

public class PassengerCar extends Car {
    private String model;

    public PassengerCar() {
    }

    public String toString() {
        return "Year: " + this.getYear() + " Power: " + this.getPower() + " Weight: " + this.getWeight() + " Model: " + this.model;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
