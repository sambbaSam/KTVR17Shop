/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entity.Customer;
import entity.Product;
import entity.Purchase;
import java.util.List;

/**
 *
 * @author pupil
 */
public interface Manageable {
   public Customer addCustomer();
    public Product addProduct();
    public Purchase purchaseProduct(List<Customer> customers, List<Product>products);
    public Purchase saleProduct(List<Purchase> purchases); 
    public Purchase insertCustomer(List<Purchase> purchases);
}
