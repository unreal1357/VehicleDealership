public class Customer {

    private String name;
    private String address;
    private int cashOnHand;

    public Customer(String name, String address, int cashOnHand) {
        this.name = name;
        this.address = address;
        this.cashOnHand = cashOnHand;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getCashOnHand() {
        return cashOnHand;
    }

    public void purchaseCar(Vehicle vehicle, Transactions transactions, boolean finance){
        transactions.handleCustomer(this, finance,vehicle);
        System.out.println();
    }
}

