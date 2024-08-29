import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Customer engin = new Customer(1,"Engin","Demiroğ");

        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(engin);
        customers.add(new Customer(2,"İsmail","Ucmak"));

        customers.remove(engin);

        for (Customer customer:customers){
            System.out.println(customer.firtsName);
        }
    }
}