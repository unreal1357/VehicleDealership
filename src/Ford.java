public class Ford extends Car {

    public Ford(String model, String colour, int topSpeed, int price) {
        super("Ford", model, colour, topSpeed, price);
    }


    //this class is extending an abstract, and it doesnt HAVE to inherit ALl the methods, if it was an interface I would have to implement the methods.
//    dont have to inherit from second level abstract, do from the first


    @Override
    public void move() {

    }

    @Override
    public void stop() {

    }



}
