
package ktvr17shop;


import classes.CustomerCreator;
import classes.ProductCreator;
import classes.PurchaseHistoryCreator;
import entity.Customer;
import entity.Product;
import entity.Purchase;
import interfaces.Manageable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sanata
 */
public class App {
    public List<Customer> customers = new ArrayList<>();
    public List<Product> products = new ArrayList<>();
    public List<Purchase> purchases = new ArrayList<>();
    private Manageable manager = new ConsoleInterface();
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------Мой магазин----------");
        String repeat = "r";
        do{
            System.out.println("Выберите нужное действие:");
            System.out.println("0 - для выхода из программы");
            System.out.println("1 - для добавления товара");
            System.out.println("2 - для добавления покупателя");
            System.out.println("3 - продажв товара");
            System.out.println("4 - история произведенных покупок");
            String action = scanner.next();

            switch (action) {
                case "0":
                    repeat = "n";
                    break;
                case "1":
                    products.add(manager.addProduct());
                    System.out.println("Товар добавлен!");
                    break;
                case "2":
                    customers.add(manager.addCustomer());
                    System.out.println("Покупатель добавлен!");
                    break;
                case "3":
                    purchases.add(manager.saleProduct(customers, products));
                    System.out.println("Товар продан покупателю.");
                    break;
                case "4":
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
