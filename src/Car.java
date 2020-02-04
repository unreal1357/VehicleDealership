public class Car extends Vehicle implements IsElectric{

//    what do only cars have?

    public Car(String make, String model, String colour, int topSpeed, int price) {
        super(make, model, colour, topSpeed, price);
    }

//    can make these methods have a bit more something about them --> just placeholder right now really, can maybe use them to get more
//    information about how the vehicle types moves.
//    do i really need this info for a car dealership though? guess can use them to get info on how the vehicle moves...?
//    could I add a description method to vehicle class?
    @Override
    public void move() {
        System.out.println("Car uses pedals to move");
    }


    @Override
    public void stop() {
        System.out.println("Car uses breaks to stop");

    }

//    can override this again when creating a type of car to change the description
    @Override
    public void description() {
        System.out.println("Description of car goes here");
    }

    @Override
    public void isElectric() {
    }
}
