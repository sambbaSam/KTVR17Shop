/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Scanner;
import entity.Customer;
/**
 *
 * @author pupil
 */
public class CustomerCreator {

//    public Customer returnNewCustomer;
    
    public Customer add(){
        
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Добавить покупателя ----------");
        System.out.println("Name");
        customer.setName(scanner.nextLine());
        System.out.println("Фамилия: ");
        customer.setSurname(scanner.nextLine());
        System.out.println("Кошелек: ");
        customer.setMoney(scanner.nextInt(Integer.SIZE));
        return customer;
    }
}
