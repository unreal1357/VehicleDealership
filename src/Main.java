public class Main {
    public static void main(String[] args) {

        /*
        I think this some what functional already... will be cool to add some extra stuff to it though like some interfaces to play with
        to make it a little more interesting.
         */

        Ford ford = new Ford("focus","red",50,500);
        ford.vehicleDescription();

        Tesla tesla = new Tesla("Roadster","Blue",120,30000);
        tesla.vehicleDescription();

        Transaction transactions = new Transaction();

        Customer customer = new Customer("Jon", "Entuity", 1500);
        customer.purchaseCar(ford,transactions,false);
//
        Customer customer1 = new Customer("Jon", "Entuity", 25000);
        customer1.purchaseCar(tesla,transactions,true);
    }
}
