
package interfaces;

import entity.Customer;
import entity.Product;
import entity.Purchase;
import java.util.List;

/**
 *
 * @author Sanata
 */
public interface Manageable {
   public Customer createCustomer();
   public Product createProduct();
   public Purchase saleProduct(List<Customer> customers, List<Product>products);
    public Purchase returnPurchase(List<Purchase> purchases); //postuplenie producta na sklad
   public void returnHistory(List<Purchase> purchases);
}
