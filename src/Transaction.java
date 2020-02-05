import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {

    public void runCreditCheck(Customer customer, double loanAmount){
        System.out.println("Running credit check....");
        System.out.println("Customer successfully passed credit check");
    }
//    creating instance of Customer here so I can call Customer.getCashOnHand, wouldn't work otherwise.
//    Same with Vehicle so I can get the price
    void handleCustomer(Customer customer, boolean finance, Vehicle vehicle){
        /*
        Do I need to call the date format in each method? I feel like there would be a better way, could i just hold it in a variable or something and call that, I feel like that would probably be better, will take a look
        at this
         */
        if (finance) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            double loanAmount = vehicle.getPrice() - customer.getCashOnHand(); //setting loanAmount to use in credit check method
            runCreditCheck(customer, loanAmount);
            double result = (vehicle.getPrice() - customer.getCashOnHand()); //creating result variable to hold the data
            System.out.println("Customer has used finance and got car " + vehicle + " using a loan of: £" + result +
                    "\nTime of transaction: " + (dtf.format(now))); //outputting loan amount

//            if customer has more money than the vehicle price, run process transaction method
        } else if (vehicle.getPrice() < customer.getCashOnHand())
//            customer can pay in cash - run processTransaction Method
            processTransaction(customer, vehicle);
        else System.out.println("Customer needs more money");
    }

    private void processTransaction(Customer customer, Vehicle vehicle){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Customer has purchased " + vehicle + " for the price of: £" + vehicle.getPrice() +
                "\nTime of transaction: " + (dtf.format(now)));
    }
}

