
package classes;

import entity.Purchase;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author Sanata
 */
public class HistoryReturner {
    public void printListWhoTookProducts (List<Purchase> purchases){
    System.out.println("-----Список покупателей, совершивших покупку----");
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        int countPurchases = purchases.size();
        for(int i=0; i<countPurchases; i++){
            Purchase p = purchases.get(i);
//            if(p.getProduct()==null){//
                System.out.println(i + 1 + ". "+p.getProduct().getName()+
                        ". Купил: " + p.getCustomer().getName()+
                        " " + p.getCustomer().getSurname()+
                        ". Числа " + sdfDate.format(p.getSaleProduct()));
//            }//
        }
    }
}
