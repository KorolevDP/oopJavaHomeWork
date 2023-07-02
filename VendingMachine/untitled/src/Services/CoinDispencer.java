package Services;

// класс приемник монет
public class CoinDispencer {
    private int nominal; // поле номинал

    public CoinDispencer(int nominal) {
        this.nominal = nominal;
    } // контсруктор приемника монет

    public String toString() {
        return " Nominal of coin equal " + nominal;
    }


//
    public int getSumm(int insertCoin, int outCoin) {
        int summCoin;
        summCoin = insertCoin + outCoin;
        return summCoin;
    }

    // метод подсчета и выдачи сдачи с покупки
    public int giveChahge(int summCoin, int price) {
        int change;
        if (price < summCoin){
            change = summCoin - price;
        } else if (price == summCoin) {
            change = summCoin - price;
        }
        else change = 0;
        return  change;
    }

    public boolean dispence(int price) {
        return true;
    }
}