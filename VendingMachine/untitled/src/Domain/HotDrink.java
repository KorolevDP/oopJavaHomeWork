package Domain;

public class HotDrink extends Product{

    private int drinkTemperature;

    public int getDrinkTemperature(){
        return drinkTemperature;
    }

    public void setDrinkTemperature(int drinkTemperature){
        this.drinkTemperature = drinkTemperature;
    }

    public HotDrink(int price,  int place, String name, long id, int drinkTemperature)
    {
        super(price,place,name,id);
        this.drinkTemperature = drinkTemperature;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTemperature = "+ drinkTemperature ;
    }

}