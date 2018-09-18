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
            Purchase pur = purchases.get(i);
            if(pur.getSaleProduct()==null){//
                System.out.println(i+1+". "+pur.getProduct().getName()+
                        ". Купил: " + pur.getCustomer().getName()+
                        " " + pur.getCustomer().getSurname()+
                        ". Числа " + sdfDate.format(pur.getSaleProduct()));
            }//
        }
    }
}
