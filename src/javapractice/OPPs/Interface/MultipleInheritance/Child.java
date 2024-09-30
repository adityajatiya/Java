package javapractice.OPPs.Interface.MultipleInheritance;

class Child implements Parent, Parent2 {

    @Override
    public void show() {
        System.out.println("Parent, Parent 2 And Child Method ");
    }

    @Override
    public void methodA() {
        System.out.println("It is Parent Class Method ");
    }

    @Override
    public void methodB() {
        System.out.println("It is Parent 2 Class Method ");
    }

    public void methodC() {
        System.out.println("It is Child Class Method ");
    }
}