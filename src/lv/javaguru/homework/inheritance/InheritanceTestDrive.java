package lv.javaguru.homework.inheritance;

public class InheritanceTestDrive {
    public InheritanceTestDrive() {
    }

    public static void main(String[] args) {
        Car car = new Car();
        PassengerCar passengerCar = new PassengerCar();
        Truck truck = new Truck();
        Bus bus = new Bus();

        car.setPower(240);
        car.setWeight(1800);
        car.setYear(2009);
        System.out.println("Car info: " + car);

        passengerCar.setModel("Tesla");
        passengerCar.setYear(2018);
        passengerCar.setWeight(2200);
        passengerCar.setPower(700);
        System.out.println("Passenger car info: " + passengerCar);

        bus.setHugeSitCount(60);
        bus.setPower(800);
        bus.setYear(2011);
        bus.setWeight(5000);
        System.out.println("Bus info: " + bus);

        truck.setCargo("Gas");
        truck.setPower(1500);
        truck.setWeight(20000);
        truck.setYear(2013);
        System.out.println("Truck info: " + truck);
    }
}
