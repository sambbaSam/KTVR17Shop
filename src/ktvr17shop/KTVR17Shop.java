/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktvr17shop;

import entity.Customer;
import entity.Product;
import entity.Purchase;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author pupil
 */
public class KTVR17Shop {

    public static void main(String[] args) {
        System.out.println("Продукты:");  
       
        Product pr1 = new Product(1L,"PIIM",5000,10);
        Product pr2 = new Product(2L,"FOREEL",2000,10);
        Product pr3= new Product(3L,"HOPUKOOR",3000,10);
        Product pr4 = new Product(4L,"LEIB",2000,10);
        List<Product>kaupProducts = new ArrayList<>();
//        System.out.println(kaupProducts);
//        System.out.println(pr2);
//        System.out.println(pr2);
//        System.out.println(pr3);
//        System.out.println(pr4);
        
        Customer cust1 = new Customer(1L,"Ivan","Ivanov",100000);
////        /*Customer cust2 = new Customer(2L,"Oleg","Petrov",150000);
////        Customer cust3 = new Customer(3L,"Anna","Orlova",200000);
////        Customer cust4 = new Customer(4L,"Urve","Kaup",400000);
//        System.out.println(cust1);
//        System.out.println(cust2);
//        System.out.println(cust3);
//        System.out.println(cust4);
        Calendar calendar = new GregorianCalendar();
        
        Purchase purchase1 = new Purchase (1L, pr1, cust1, calendar.getTime(),2);
        cust1.setMoney(cust1.getMoney()-purchase1.getProduct().getPrice()*purchase1.getQuantity());
        pr1.setCount(pr1.getCount()-purchase1.getQuantity());

        System.out.println("Продано Товар " +  pr1.getName()+" покупателю - "+cust1.getSurname() + " 5 tk" );
        System.out.println(purchase1.toString()); 
    }
    
}
