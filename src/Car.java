public abstract class Car extends Vehicle {

    public Car(String make, String model, String colour, int topSpeed, int price) {
        super(make, model, colour, topSpeed, price);
    }

    public void vehicleDescription(){
        System.out.println("Information for "  + this.getMake() +" " + this.getModel() +": " +
                "\nTop Speed: " + this.getTopSpeed() + "mph" +
                "\nPrice: £" + this.getPrice()+"\n");
    }
}
