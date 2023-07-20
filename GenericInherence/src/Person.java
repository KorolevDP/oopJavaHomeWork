
/**
 * Абстрактный класс человека в университете в формате дженерика
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
     * Конструктор человека в университете в формате дженерика
     * @param name  - имя
     * @param age - возраст
     */
    public Person(T name, V age) {
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public V getAge() {
        return age;
    }

    public void setAge(V age) {
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