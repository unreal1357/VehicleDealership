public abstract class Car extends Vehicle {

//    what do only cars have?

    public Car(String make, String model, String colour, int topSpeed, int price) {
        super(make, model, colour, topSpeed, price);
    }

    //    can make these methods have a bit more something about them --> just placeholder right now really, can maybe use them to get more
//    information about how the vehicle types moves.
    @Override
    public void move() {
        System.out.println("Car uses pedals to move");
    }

    @Override
    public void stop() {
        System.out.println("Car uses breaks to stop");
    }


}
