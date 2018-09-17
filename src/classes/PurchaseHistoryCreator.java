/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Customer;
import entity.Product;
import entity.Purchase;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sanata
 */
public class PurchaseHistoryCreator {
   public Purchase returnNewHistory(List<Customer> customers, List<Product> products){
       System.out.println("-----Продажа товара------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Список товаров: ");
        int countProducts = products.size();
        for(int i = 0; i<countProducts; i++){
            System.out.println(i+1+". "+products.get(i).getName());
        }
        System.out.println("----------Список покупателей-------");
        int countCustomers = customers.size();
        for(int i = 0; i<countCustomers; i++){
            System.out.println(i+1+". "+customers.get(i).getName()+" "+customers.get(i).getSurname());
        }
        System.out.println("Выберите номер произведенной продажи:");
        int numberProduct = scanner.nextInt();
        Product product = products.get(numberProduct-1);
        System.out.println("Выберите номер покупателя:");
        int numberCustomer = scanner.nextInt();
        Customer customer = customers.get(numberCustomer-1);
        Calendar c = new GregorianCalendar();
        Purchase purchase = new Purchase(null, product, customer, c.getTime(), countProducts);
//        customer.setMoney(customer.getMoney()-purchase.getProduct().getPrice()*purchase.getQuantity());
//        product.setCount(product.getCount()-purchase.getQuantity());
//        System.out.println(purchase.toString()); 
        return purchase;        
    }
}
