package classes;

import entity.Purchase;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Sanata
 */
public class ProductReturner {
    public Purchase returnProduct(List<Purchase> purchases){
        try{
            System.out.println("-----История покупок-----");
            Purchase purchase = new Purchase();
            Scanner scanner = new Scanner(System.in);
            int countPurchases = purchases.size();
            for (int i = 0; i < countPurchases; i++) {
                Purchase history = purchases.get(i);
                System.out.println(i+1+". "+history.getCustomer().getName()
                        +" "+history.getCustomer().getSurname()
                        +"купил : "+history.getProduct().getName());
            }
                System.out.println("Выберите номер строки поступившего товара: ");
//                System.out.println("Чтобы ничего не делать наберите -1");
                int numHistory = scanner.nextInt();
//                System.out.println(numHistory);//
                if(numHistory < 0) return null;
                purchase = purchases.get(numHistory-1);
                purchases.remove(purchase);
                Calendar c = new GregorianCalendar();
                purchase.setSaleProduct(c.getTime());
            return purchase;
        }catch(Exception e){
            return null;
        }
    }
}
