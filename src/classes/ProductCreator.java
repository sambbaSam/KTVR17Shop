package classes;

import entity.Product;
import java.util.Scanner;
/**
 *
 * @author Sanata
 */
public class ProductCreator {
    
    public Product returnNewProduct(){
    Product product = new Product();
    Scanner scanner = new Scanner(System.in);
        System.out.println("--- Добавление продукта на склад ----");
        System.out.print("Наименование продукта: ");//System.out.println("Наименование продукта: ");
        product.setName(scanner.nextLine());
        System.out.print("Цена: ");//println
        product.setPrice(scanner.nextInt());//product.setPrice(scanner.nextInt(Integer.SIZE))
        System.out.print("Количество: ");
        product.setCount(scanner.nextInt());// product.setCount(scanner.nextInt(Integer.SIZE));
        System.out.println(product.toString());

            return product;
//        }

    }
}
