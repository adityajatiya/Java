package javapractice.OPPs.Interface.InterfaceToInterface;

class Car implements Drivable, Fuelable {

    @Override
    public void drive() {
        System.out.println("Car is Driving");
    }

    @Override
    public void refuel() {
        System.out.println("Car is being refueled.");
    }
}
