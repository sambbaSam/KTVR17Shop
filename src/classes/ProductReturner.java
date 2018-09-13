
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
    public boolean returnPurchase(List<Purchase> purchases){
        try{
            System.out.println("-----Прием нового товара-----");
            Purchase purchase = new Purchase();
            Scanner scanner = new Scanner(System.in);
            int countPurchases = purchases.size();
            for (int i = 0; i < countPurchases; i++) {
                Purchase history = purchases.get(i);
                System.out.println(i+1+". "+history.getCustomer().getName()
                        +" "+history.getCustomer().getSurname()
                        +": "+history.getProduct().getName());
            }
                System.out.println("Выберите номер строки поступившего товара: ");
                System.out.println("Чтобы ничего не делать наберите -1");
                int numHistory = scanner.nextInt();
                if(numHistory < 0) return false;
                purchase = purchases.get(numHistory-1);
                purchases.remove(purchase);
                Calendar c = new GregorianCalendar();
                purchase.setSaleProduct(c.getTime());
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
