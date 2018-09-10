/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktvr17shop;

import entity.Customer;
import entity.Product;
import entity.Purchase;
import java.util.Calendar;
import java.util.GregorianCalendar;

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
        System.out.println(pr1.toString());
        System.out.println(pr2.toString());
        System.out.println(pr3.toString());
        System.out.println(pr4.toString());
        
        Customer cust1 = new Customer(1L,"Ivan","Ivanov",100000);
        Customer cust2 = new Customer(2L,"Oleg","Petrov",150000);
        Customer cust3 = new Customer(3L,"Anna","Orlova",200000);
        Customer cust4 = new Customer(4L,"Urve","Kaup",400000);
        System.out.println(cust1.toString());
        System.out.println(cust2.toString());
        System.out.println(cust3.toString());
        System.out.println(cust4.toString());
        Calendar calendar = new GregorianCalendar();
        
        Purchase purchase1 = new Purchase (1L, pr1, cust1, calendar.getTime(), 2);
        cust1.setMoney(cust1.getMoney()-purchase1.getProduct().getPrice()*purchase1.getQuantity());
        pr1.setCount(pr1.getCount()-purchase1.getQuantity());
        System.out.println(purchase1.toString()); 
        
        Purchase purchase2 = new Purchase (1L, pr1, cust2, calendar.getTime(), 7);
        cust2.setMoney(cust2.getMoney()-purchase2.getProduct().getPrice()*purchase2.getQuantity());
        pr1.setCount(pr1.getCount()-purchase2.getQuantity());
        System.out.println(purchase2.toString());
        
        Purchase purchase3 = new Purchase (1L, pr1, cust3, calendar.getTime(), 1);
        cust1.setMoney(cust3.getMoney()-purchase3.getProduct().getPrice()*purchase3.getQuantity());
        pr1.setCount(pr1.getCount()-purchase3.getQuantity());
        System.out.println(purchase3.toString());
        
        Purchase purchase4 = new Purchase (4L, pr4, cust1, calendar.getTime(), 6);
        cust1.setMoney(cust1.getMoney()-purchase4.getProduct().getPrice()*purchase4.getQuantity());
        pr4.setCount(pr4.getCount()-purchase4.getQuantity());
        System.out.println(purchase4.toString());
        //*******************
    }
    
}
