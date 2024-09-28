package javapractice.OPPs.Interface.MultipleInheritance;

class Child implements Parent, Parent2 {

    public void methodA() {
        System.out.println("It is Parent Class Method ");
    }

    public void methodB() {
        System.out.println("It is Parent 2 Class Method ");
    }

    public void methodC() {
        System.out.println("It is Child Class Method ");
    }
}
