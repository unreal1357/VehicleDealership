
//only HAVE to implement methods if set to abstract - gives a choice of what to implement and what not to
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

/*
Not sure what i could do with these yet
 */
    public void move(){
        System.out.println("Default: Car is moving");
    };
    public void stop(){
        System.out.println("Default: Car is stopping");
    };

    void vehicleDescription(){
        System.out.println("Information for "  + this.getMake() +" " + this.getModel() +": " +
                "\nTop Speed: " + this.getTopSpeed() + "mph" +
                "\nPrice: £" + this.getPrice()+"\n");
    }

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
