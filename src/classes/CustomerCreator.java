
package classes;

import java.util.Scanner;
import entity.Customer;
/**
 *
 * @author pupil
 */
public class CustomerCreator {
    
    public Customer returnNewCustomer(){
        
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Добавить покупателя ----------");
        System.out.println("Name");
        customer.setName(scanner.nextLine());
        System.out.println("Фамилия: ");
        customer.setSurname(scanner.nextLine());
        System.out.println("Кошелек: ");
        customer.setMoney(scanner.nextInt());//customer.setMoney(scanner.nextInt(Integer.SIZE));
        System.out.println(customer.toString());
        System.out.println("----Покупатель добавлен----");
        return customer;
    }
}
