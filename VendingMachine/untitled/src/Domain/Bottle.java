package Domain;

// класс бутылочка

public class Bottle extends Product{

    // поле объема бутылочки
    private  float bottleVolume;

    public float getBottleVolume() {
        return bottleVolume;
    }

    public void setBottleVolume(float bottleVolume){
        this.bottleVolume = bottleVolume;
    }


    // конструктор ботла
    public Bottle (int price, int place, String name, long id, float bottleVolume){
        super(price, place, name, id);
        this.bottleVolume = bottleVolume;
    }

    // переопределение метода toString для корректного вывода в консоль
    @Override
    public String toString() {
        return super.toString() + "volume = " + bottleVolume +"\n";
    }
}