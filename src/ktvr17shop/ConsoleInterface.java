/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktvr17shop;


import classes.CustomerCreator;
import classes.ProductCreator;
import classes.PurchaseHistoryCreator;
import entity.Customer;
import entity.Product;
import entity.Purchase;
import interfaces.Manageable;
import java.util.List;

/**
 *
 * @author Sanata
 */
public class ConsoleInterface implements Manageable{

    @Override
    public Customer addCustomer() {
        CustomerCreator customerCreator = new CustomerCreator();
        return customerCreator.add();
    }

    @Override
    public Product addProduct() {
       ProductCreator productCreator = new ProductCreator();
        return productCreator.add();
    }
    
    @Override
        public Purchase saleProduct(List<Customer> customers, List<Product> products) {
        PurchaseHistoryCreator purchaseHistoryCreator = new PurchaseHistoryCreator();
        return purchaseHistoryCreator.add(customers, products);
        }

    
}
