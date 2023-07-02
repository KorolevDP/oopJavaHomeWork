package Domain;

// класс гоячие напитки
public class HotDrink extends Product{

    // поле температуры
    private int drinkTemperature;

    public int getDrinkTemperature(){
        return drinkTemperature;
    }

    public void setDrinkTemperature(int drinkTemperature){
        this.drinkTemperature = drinkTemperature;
    }

    // конструктор горячих напитков
    public HotDrink(int price,  int place, String name, long id, int drinkTemperature)
    {
        super(price,place,name,id);
        this.drinkTemperature = drinkTemperature;
    }

    @Override
    public String toString() {
        return super.toString() + "Temperature = "+ drinkTemperature + "\n";
    }

}