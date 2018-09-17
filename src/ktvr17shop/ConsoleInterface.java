
package ktvr17shop;

import classes.CustomerCreator;
import classes.HistoryReturner;
import classes.ProductCreator;
import classes.ProductReturner;
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
    public Customer createCustomer() {
        CustomerCreator customerCreator = new CustomerCreator();
        return customerCreator.returnNewCustomer();
    }

    @Override
    public Product createProduct() {
       ProductCreator productCreator = new ProductCreator();
        return productCreator.add();
    }
    
    @Override
        public Purchase saleProduct(List<Customer> customers, List<Product> products) {
        PurchaseHistoryCreator purchaseHistoryCreator = new PurchaseHistoryCreator();
        return purchaseHistoryCreator.returnNewHistory(customers, products);
        }

    @Override
    public void returnHistory(List<Purchase> purchases) {
       HistoryReturner historyReturner = new HistoryReturner();
        historyReturner.printListWhoTookProducts(purchases);
    }

    @Override
    public Purchase returnPurchase(List<Purchase> purchases) {
        ProductReturner productReturner = new ProductReturner();
        return productReturner.returnPurchase(purchases);
  
    }

   
}
