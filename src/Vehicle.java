
//only HAVE to implement methods if set to abstract
public abstract class Vehicle {

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


/*
Not sure what i could do with these yet
 */
    public void move(){
        System.out.println("Default: Car is moving");
    };
    public void stop(){
        System.out.println("Default: Car is stopping");
    };

    @Override
    public String toString() {
        return "Vehicle: " +
                "make= '" + make + '\'' +
                ", model='" + model + '\'' +
                ", colour= '" + colour + '\'' +
                ", topSpeed= " + topSpeed +
                ", price= " + price;
    }
}
