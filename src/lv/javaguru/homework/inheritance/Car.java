package lv.javaguru.homework.inheritance;

public class Car {
    private int weight;
    private int power;
    private int year;

    public Car() {
    }

    public int getWeight() {
        return this.weight;
    }

    public int getPower() {
        return this.power;
    }

    public int getYear() {
        return this.year;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Year: " + this.year + " Power: " + this.power + " Weight: " + this.weight;
    }
}
