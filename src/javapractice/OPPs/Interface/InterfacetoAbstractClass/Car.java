package javapractice.OPPs.Interface.InterfacetoAbstractClass;

abstract class Car implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    public void stopEngine() {
    }
}
