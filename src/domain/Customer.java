package domain;

public class Customer {
    private int ID;
    private boolean isNew;
    private float total;
    
    public Customer() {
       ID = 16061;
       isNew = true;
       total = 720.4F;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        if (ID >= 0) {
             this.ID = ID;
        }
    }

    public boolean getStatus() {
        return isNew;
    }

    public void setStatus(boolean isNew) {
        this.isNew = isNew;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        if (total >= 0) {
           this.total = total;
        }
    }

    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + ID);
        System.out.println("Is the customer new: " + isNew);
        System.out.println("Total purchases are: " + total);
    }
}
