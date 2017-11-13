package lv.javaguru.homework.inheritance;

public class Bus extends Car {
    private int hugeSitCount;

    public Bus() {
    }

    public int getHugeSitCount() {
        return this.hugeSitCount;
    }

    public void setHugeSitCount(int hugeSitCount) {
        this.hugeSitCount = hugeSitCount;
    }

    public String toString() {
        return "Year: " + this.getYear() + " Power: " + this.getPower() + " Weight: " + this.getWeight() + " Sit count: " + this.hugeSitCount;
    }
}
