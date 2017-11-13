package lv.javaguru.homework.inheritance;

public class Truck extends Car {
    private String cargo;

    public Truck() {
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String toString() {
        return "Year: " + this.getYear() + " Power: " + this.getPower() + " Weight: " + this.getWeight() + " Cargo type: " + this.cargo;
    }
}
