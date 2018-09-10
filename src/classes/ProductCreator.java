/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Product;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class ProductCreator {
    
    public Product add(){
    Product product = new Product();
    Scanner scanner = new Scanner(System.in);
        System.out.println("--- Добавление продукта на склад ----");
        System.out.println("Наименование продукта:");
        product.setName(scanner.nextLine());
        System.out.println("Цена: ");
        product.setPrice(Integer.SIZE);
        System.out.println("Количество:");
        product.setCount(Integer.SIZE);
    return product;
    }
}
