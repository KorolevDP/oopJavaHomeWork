package  Domain;

//класс продукты
public class Product {

    //поля:
    private int price; // цена
    private int place; // позиция
    private String name; // название
    private  long id;

    // конструкторы продуктов
    public Product(){
        this.price = -1;
        this.place = -1;
        this.name = "Неизвестно";
        this.id = -1;
    }

    public Product(int price){
        this();
        this.price = price;
    }

    public Product(int price, int place){
        this(price);
        this.place = place;
    }

    public Product(int price, int place, String name){
        this(price, place);
        this.name = name;
    }

    public Product(int price, int place, String name, long id){
        this(price, place, name);
        this.id = id;
    }

// геттеры, сеттеры для полей продуктов
    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPlace(){
        return place;
    }

    public void setPlace(int place){
        this.place = place;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public long getId(){
        return id;
    }

    @Override
    public String toString() {
        return  "price = " + price + "\n" +
                "place = " + place + "\n" +
                "name = " + name + '\n' +
                "id = " + id + "\n";
    }
}