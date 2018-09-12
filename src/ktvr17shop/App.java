/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktvr17shop;

import classes.CustomerCreator;
import entity.Customer;
import entity.Product;
import entity.Purchase;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    public List<Customer> customers = new ArrayList<>();
    public List<Product> products = new ArrayList<>();
    public List<Purchase> purchases = new ArrayList<>();
//    public Insertable inserter = new ConsoleInserter();
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------Мой магазин----------");
        String repeat = "r";
        do{
            System.out.println("Выберите нужное действие:");
            System.out.println("0 - для выхода из программы");
            System.out.println("1 - для добавления товара");
            System.out.println("2 - для добавления покупателя");
            System.out.println("3 - история произведенных покупок");
            String action = scanner.next();

            switch (action) {
                case "0":
                    repeat = "n";
                    break;
//                case "1":
//                    this.customers.add(inserter.addCustomer());
//                    saver.saveCustomer(customers);
//                    System.out.println("Покупатель добавлен!");
//                    break;
                case "2":
                    CustomerCreator customerCreator = new CustomerCreator();
                    customers.add(customerCreator.add());
                    System.out.println("Товар добавлен!");
                    break;
                 
//                case "3":
//                    this.purchases.add(inserter.purchaseProduct(customers,products));
//                    saver.savePuschase(purchases);
//                    System.out.println("Товар продан покупателю.");
//                    break;
                default:
                    System.out.println("Выберите действие из списка!");
                    System.out.println("----------------------------");
                    repeat="r";
            }
        
        }while("r".equals(repeat));
    }
}
