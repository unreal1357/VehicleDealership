public class Main {
    public static void main(String[] args) {

//        run program from here

//        Ford ford = new Ford("focus","red",50,500);
//        System.out.println(ford);
//
//        Tesla tesla = new Tesla("Roadster","Blue",120,30000); //why is this printing out as Ford make??
//        System.out.println(tesla);

//        how can I print all these out in one single call?
//        in a --> getDetailsMethod
//        tesla.move();
//        tesla.stop();
//        tesla.vehicleDescription();

        Customer customer = new Customer("Jon", "Entuity", 1500);
        Transactions transactions = new Transactions();

        Ford ford = new Ford("focus","red",50,500);
        customer.purchaseCar(ford,transactions,false);

        Customer customer1 = new Customer("Jon", "Entuity", 25000);

        Tesla tesla = new Tesla("Roadster","Blue",120,30000);
        customer1.purchaseCar(tesla,transactions,true);
    }
}
