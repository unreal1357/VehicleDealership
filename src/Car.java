public abstract class Car extends Vehicle {

//    what do only cars have?

    public Car(String make, String model, String colour, int topSpeed, int price) {
        super(make, model, colour, topSpeed, price);
    }

    //    can make these methods have a bit more something about them --> just placeholder right now really, can maybe use them to get more
//    information about how the vehicle types moves.
    @Override
    public abstract void move();

    @Override
    public abstract void stop();

    public void vehicleDescription(){
        System.out.println("Information for "  + this.getMake() +" " + this.getModel() +": ");

    }
}
