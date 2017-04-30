import java.util.*;
/**
 * Write a description of class CustomerContainer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CustomerContainer
{
    int customer_amount;
    int customer_allowance;
    int input_max;
    ArrayList<Customer> customerContainer;
    /**
     * Constructor for objects of class CustomerContainer
     */
    public CustomerContainer(int customer_amount, int customer_allowance, int input_max)
    {
        customerContainer = new ArrayList<Customer>();
        this.customer_amount = customer_amount;
        this. customer_allowance = customer_allowance;
        this.input_max = input_max;
        for(int i = 0 ; i < customer_amount; i++){
            Customer c = new Customer(customer_allowance, input_max);
            customerContainer.add(c);
        }
    }
    public void pick(){
        for(int i = 0 ; i < customerContainer.size(); i++){
            customerContainer.get(i).selection();
        }
    }
    public int sizeOfContainer(){
        return customerContainer.size();
    }
    public Customer getCustomer(int i){
        return customerContainer.get(i);
    }
}
