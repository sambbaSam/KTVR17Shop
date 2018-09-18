package interfaces;

import entity.Customer;
import entity.Product;
import entity.Purchase;
import java.util.List;
/**
 *
 * @author Sanata
 */
public interface Retentive {
  public void saveCustomer(Customer customer);
  public void saveProduct(Product product);
  public void savePurchase(Purchase purchase, boolean update);
  public List<Customer> loadCustomers();
  public List<Product> loadProducts();
  public List<Purchase> loadPurchases();
  public  void freeResources();
}
