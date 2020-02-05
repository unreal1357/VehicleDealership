public abstract class Car extends Vehicle {

    /*
    dont really feel like the class is doing anything at the moment... need to have a think if its needed or i want anything specific
    happening with only cars?

    could maybe add some more information that only cars have to show some more stuff in the descriptions method like... engine... 4 wheel drive, gears etc etc

    Maybe its just a good idea to have difference vehicle types to be seperated and extend to???
     */
    public Car(String make, String model, String colour, int topSpeed, int price) {
        super(make, model, colour, topSpeed, price);
    }
}
