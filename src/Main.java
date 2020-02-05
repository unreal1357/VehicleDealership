public class Main {
    public static void main(String[] args) {


        Ford ford = new Ford("focus","red",50,500);
        ford.vehicleDescription();

        Tesla tesla = new Tesla("Roadster","Blue",120,30000);
        tesla.vehicleDescription();


        Customer customer = new Customer("Jon", "Entuity", 1500);
        Transaction transactions = new Transaction();
        customer.purchaseCar(ford,transactions,false);
//
        Customer customer1 = new Customer("Jon", "Entuity", 25000);
        customer1.purchaseCar(tesla,transactions,true);
    }
}
