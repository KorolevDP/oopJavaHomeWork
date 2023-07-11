package Domain;

/**
 *  Абстрактный класс человека в университете
 */
public abstract class Person {
    /**
     * Поле имени
     */
    private String name;
    /**
     * Поле возраста
     */
    private int age;

    /**
     * Конструктор человека в университете
     * @param name  - имя
     * @param age - возраст
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Переопределение метода toString
     * @return  возвращает формат вывода
     */
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

}