/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Purchase;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class HistoryPurchase {
   public Purchase add(List<Purchase> purchases){
        Purchase purchase = new Purchase();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < purchases.size(); i++) {
            Purchase h = purchases.get(i);
            System.out.println(i+1+". "+h.getCustomer().getName()//getReader().getName()
                    +" "+h.getCustomer().getSurname()//getReader().getSurname()
                    +": "+h.getProduct().getName()+","+h.getProduct().getPrice()+","
                    +h.getProduct().getCount());
        }
            System.out.println("Выберите номер строки с историей проданного товара: ");
            String numPurchase = scanner.nextLine();
            purchase = purchases.get((int) (new Long(numPurchase)-1));
            purchases.remove(purchase);
            Calendar c = new GregorianCalendar();
            purchase.setDate(c.getTime());
    
        return purchase;
    
    }
}
