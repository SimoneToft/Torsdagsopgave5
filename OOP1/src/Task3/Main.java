package Task3;

import java.util.ArrayList;

public class Main {
        public static ArrayList<Customer> customers = new ArrayList<>();
        public static void main(String[] args){
        customers.add(new Customer("Simone","Hansen","simonetofth"));
        customers.add(new Customer("Tobias","Carlsen","toebzy"));
        printCustomers();
    }
    public static void printCustomers(){
            for(Customer r:customers){
                System.out.println(r);
            }
    }
}
