
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
   public Customer addCustomer();
   public Product addProduct();
   public Purchase saleProduct(List<Customer> customers, List<Product>products); 
   public void returnHistory(List<Purchase> purchases);
}
