
//im not having to implment methods from the abstract class
public class Tesla extends Car implements ElectricEngine {

    public Tesla(String model, String colour, int topSpeed, int price) {
        super("Tesla", model, colour, topSpeed, price);
    }


    //where should i have the isElectric Method? hmmmm where would it work best... in Car? to work for all cars
//    if it went in cars and the isElectric was too can i then call that in a method? I think i cam do this but what do i want to do if
//    a car IS electric? sout "YOu are saving the planet! lol


    @Override
    public void Electric() {
        System.out.println(this.getModel() + " has an electric Engine");
    }

    @Override
    public void vehicleDescription() {
        super.vehicleDescription();
    }
}
