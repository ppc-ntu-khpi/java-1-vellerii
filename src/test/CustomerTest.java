package test;
import domain.Customer;

public class CustomerTest {
    public static void main(String args[]) {
        Customer theCustomer = new Customer();

        theCustomer.setID(456);
        System.out.println("Customer ID: " + theCustomer.getID());
        
        theCustomer.setStatus(true);
        System.out.println("Is the customer new: " + theCustomer.getStatus());
        
        theCustomer.setTotal(7905.5f);
        System.out.println("Total purchases are: "  + theCustomer.getTotal());
    }
}
