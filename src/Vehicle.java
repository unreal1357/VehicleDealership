/*
only reason to make an abstract class is when implementing some methods and not all...
how does that work because its telling me to implement all the methods???
 */

public abstract class Vehicle implements Driveable{

//    include some fields and a constructor?
//    What does every single vehicle have?
//    this is going to be implemented into all child classes - type of vehicles
    private String make;
    private String model;
    private String colour;
    private int topSpeed;
    private int price;

    public Vehicle(String make, String model, String colour, int topSpeed, int price) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getPrice() {
        return price;
    }


//    You could do something like the vehicle has a method called isElectric and that delegates to a engine object
//    So that checks the type of engine object to know if it's electric

    public abstract void move();
    public abstract void stop();


    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", topSpeed=" + topSpeed +
                ", price=" + price +
                '}';
    }
}
