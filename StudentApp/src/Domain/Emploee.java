package Domain;

/**
 * Класс сотрудника университета
 */
public class Emploee  extends Person {

    private String special;

    /**
     * Конструктор сотрудника
     * @param firstName  имя
     * @param age возраст
     * @param special специальность
     */
    public  Emploee(String firstName, int age, String special) {
        super(firstName, age);
        this.special = special;
    }

    @Override
    public String toString() {
        return "Emploee [name=" + super.getName() +
                ", age=" + super.getAge() +
                ", special=" + special + "]";
    }
}
