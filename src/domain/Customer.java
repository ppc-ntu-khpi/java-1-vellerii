package domain;

public class Customer {
    private int ID = 16061;
    private boolean isNew = true;
    private float total = 720.4f;

    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + ID);
        System.out.println("Is the customer new: " + isNew);
        System.out.println("Total purchases are: " + total);
    }
}
