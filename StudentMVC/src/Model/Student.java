package Model;

/**
 * Класс студента, наследуемый от класса Person
 */
public class Student extends Person implements Comparable<Student> {

    /**
     * Поле id
     */
    private int id;

    /**
     * Конструктор студента
     *
     * @param name имя
     * @param age  возраст
     * @param id
     */
    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
     *
     * */
    @Override
    public int compareTo(Student o) {

        if (super.getAge() == o.getAge())
        {
            if(this.id==o.id)
            {
                return 0;
            }
            if(this.id<o.id)
            {
                return -1;
            }
            return 1;
        }
        if(super.getAge() < o.getAge())
        {
            return -1;
        }
        else return 1;
    }
}