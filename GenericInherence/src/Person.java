
/**
 *  Абстрактный класс человека в университете
 */
public abstract class Person<T,V> {
    /**
     * Поле имени
     */
    private T name;
    /**
     * Поле возраста
     */
    private V age;

    /**
     * Конструктор человека в университете
     * @param name  - имя
     * @param age - возраст
     */
    public Person(T name, V age) {
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