package Domain;

/**
 * Класс преподавателей
 */
public class Teacher extends Person {

    private String acadDegree; // поле ученая степень
    private int id;

    /**
     * Конструктор преподавателей
     *
     * @param firstName Имя
     * @param age возраст
     */
    public Teacher(String firstName, int age, int id, String acadDegree) {
        super(firstName, age);
        this.acadDegree = acadDegree;
        this.id = id;
    }

    public String getAcadDegree(){
        return acadDegree;
    }

    public void setAcadDegree(String acadDegree) {
        this.acadDegree = acadDegree;
    }

    @Override
    public String toString() {
        return  "Teacher [age=" + super.getAge() +
                ", name=" + super.getName() +
                ", id=" + this.id +
                ", acadDegree=" + this.getAcadDegree() + "]";
    }
}
