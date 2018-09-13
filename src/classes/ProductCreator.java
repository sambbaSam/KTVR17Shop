
package classes;


import entity.Product;
import java.util.Scanner;

/**
 *
 * @author Sanata
 */
public class ProductCreator {
    
    public Product add(){
    Product product = new Product();
    Scanner scanner = new Scanner(System.in);
        System.out.println("--- Добавление продукта на склад ----");
        System.out.println("Наименование продукта:");
        product.setName(scanner.nextLine());
        System.out.println("Цена: ");
        product.setPrice(scanner.nextInt(Integer.SIZE));
        System.out.println("Количество:");
        product.setCount(scanner.nextInt(Integer.SIZE));
    return product;
    }
}
