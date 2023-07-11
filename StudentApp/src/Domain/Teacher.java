package Domain;

/**
 * Класс преподавателей
 */
public class Teacher extends Person {

    private String acadDegree; // поле ученая степень

    /**
     * Конструктор преподавателей
     * @param firstName  Имя
     * @param age возраст
     * @param acadDegree ученая степень
     */
    public Teacher(String firstName, int age, String acadDegree) {
        super(firstName, age);
        this.acadDegree = acadDegree;
    }
}
