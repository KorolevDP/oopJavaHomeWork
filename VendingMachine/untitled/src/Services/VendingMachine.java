package Services;

import Domain.Product;

import java.util.List;

// класс нашего автомата с товарами
public class VendingMachine {

    private Holder holder; // спирали (держатель)
    private CoinDispencer dispencer; // приемник монет
    private List<Product> assort; // список продуктов
    private Display display; // дисплей нашего автомата

    // конструктор торгового автомата
    public VendingMachine(Holder holder, CoinDispencer dispencer, List<Product> assort, Display display) {
        this.holder = holder;
        this.dispencer = dispencer;
        this.assort = assort;
        this.display = display;
    }

    // метод покупки товара
    public void buyProduct(Product p, int price) {
        if (assort.contains(p) && holder.getBalance() >= price) {
            if (dispencer.dispence(price)) {
                releaseProduct(p, holder);
                display.print("You have successfully bought " + p.getName() + ".");
            }
        } else {
            display.print("Product not available or insufficient balance.");
        }
    }

    // метод выдачи товара
    public void releaseProduct(Product p, Holder h) {
        h.release(0, 0);
        assort.remove(p);
    }

    public void cancel() {
        dispencer.giveChahge(0, 0);
    }

    public Holder getHolder() {
        return holder;
    }

    public CoinDispencer getDispencer() {
        return dispencer;
    }

    public List<Product> getProducts() {
        return assort;
    }

    public Display getDisplay() {
        return display;
    }
}



