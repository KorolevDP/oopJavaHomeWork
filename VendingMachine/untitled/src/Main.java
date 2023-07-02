/*
Разработать программу для управления Вендинг - машиной.
 */

import Domain.Bottle;
import Domain.Product;
import Domain.HotDrink;
import Services.CoinDispencer;
import Services.Display;
import Services.Holder;
import Services.VendingMachine;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception{

        List<Product> assort = new ArrayList<>();
        Product item1 = new Product(100, 1, "Lays");
        Product item2 = new Product(50, 2, "Cola");
        Product item3 = new Bottle(40,3,"Bonaqua", 10, 1.5f);
        Product item4 = new HotDrink(100, 4, "Nicola Coffee", 999, 45);
        Product item5 = new HotDrink(120, 5, "Tears of David", 555, 50);

        assort.add(item1);
        assort.add(item2);
        assort.add(item3);
        assort.add(item4);
        assort.add(item5);

        Holder hold1 = new Holder(4, 4);
        CoinDispencer coinDesp = new CoinDispencer(0);
        Display disp = new Display();

        VendingMachine venMachine = new VendingMachine(hold1, coinDesp, assort, disp);

        System.out.println();
        for (Product prod: venMachine.getProducts())
        {
            System.out.println(prod);
        }

    }
}



