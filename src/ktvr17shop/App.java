package ktvr17shop;

import entity.Customer;
import entity.Product;
import entity.Purchase;
import interfaces.Manageable;
import interfaces.Retentive;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Sanata
 */
public class App {
    private List<Customer> customers;
    private List<Product> products;
    private List<Purchase> purchases;
    private Manageable manager = new ConsoleInterface();
    private Retentive saver = new PersistToDatabase();
    
    public App() {
       this.customers = saver.loadCustomers();
       this.products = saver.loadProducts();
       this.purchases= saver.loadPurchases();
    }
    
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------МОЙ МАГАЗИН----------");
        String repeat = "r";
        do{
            System.out.println("Выберите нужное действие:");
            System.out.println("0 - для выхода из программы");
            System.out.println("1 - для добавления товара");
            System.out.println("2 - для добавления покупателя");
            System.out.println("3 - продажв товара");
            System.out.println("4 - история произведенных покупок/");
            System.out.println("5 - поступление нп склад товара ");
            String action = scanner.next();

            switch (action) {
                case "0":
                    repeat = "n";
                    saver.freeResources();
                    break;
                case "1":
                    Product product = manager.createProduct();
                    if(product != null){
                        products.add(product);
                        saver.saveProduct(product); 
                    }
//                    System.out.println("Товар добавлен!");
                    break;
                case "2":
                    Customer customer = manager.createCustomer();
                    if(customer != null){
                        customers.add(customer);
                        saver.saveCustomer(customer); 
                    }
//                    System.out.println("Покупатель добавлен!");
                    break;
                case "3":
                    Purchase purchase = manager.saleProduct(customers, products);
                    if(purchase != null){
                        purchases.add(purchase);
                        saver.savePurchase(purchase, false); 
                    }
                    break;
                case "4":
                    Purchase pur = manager.returnProduct(purchases);
                    if(pur != null){
                        saver.savePurchase(pur, true);//
                    }
                    break;
                case "5":
                    manager.returnHistory(purchases);
                    break; 
                default:
                    System.out.println("Выберите действие из списка!");
                    System.out.println("----------------------------");
                    repeat="r";
            }
        
        }while("r".equals(repeat));
    }
}
