
/**
 * Класс студента, наследуемый от класса Person
 */
public class Student<T extends Comparable <T>, V> extends  Person<T,V> implements Comparable<Student<T,V>> {

    /**
     * Поле id
     */
    private V id;

    /**
     * Конструктор студента
     * @param name имя
     * @param age  возраст
     * @param id
     */
    public Student(T name, V age, V id) {
        super(name, age);
        this.id = id;
    }

    public V getId() {
        return id;
    }

    public void setId(V id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Students [age=" + super.getAge() +
                ", name=" + super.getName() +
                ", id=" + id + "]";
    }

    /**
     * Метод сортировки студентов по id и возрасту, если возраст одинаковый,
     * то сравниваются id
     *
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Student<T,V> o) {

        return super.getName().compareTo(o.getName());
    }
}