package Lacture1;

interface Vehicle {
    public abstract void startVehicles();

//    public abstract void clean(); // it will give error bcos we have to implement this method in all implemented classes

    public default void clean(){
        System.out.println("this is clean method in interface..");
    }

    public static void staticMethod() {
        System.out.println("This is static method in interface..");
    }

}

class Car implements Vehicle{
    @Override
    public void startVehicles(){
        // logic to start car
        System.out.println("Car Start...");
    }
}

class Bus implements Vehicle{

    public void startVehicles(){
        // logic to start bus
        System.out.println("bus Start... 1");
    }
}

class Bike implements Vehicle{
    @Override
    public void startVehicles(){
        // logic to start bike
        System.out.println("Bike Start...");
    }
}


public class Lacture1 implements Vehicle {

    @Override
    public void startVehicles() {
        // logic to start bike
        System.out.println("Bike Start...");
    }

    //  we can override this method because it is default
    public void clean(){
        System.out.println("this is clean method in implemented class...");
    }

    public static void main(String[] args) {
        Lacture1 lacture1 = new Lacture1();
        lacture1.startVehicles();
        lacture1.clean(); // "this is clean method in interface.."  ,
        Vehicle.staticMethod();
    }
}


