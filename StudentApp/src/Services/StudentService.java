package Services;

import Domain.PersonComparator;
import Domain.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService  implements  iPersonService<Student>{

    private int count;
    private List<Student> students;

    public StudentService() {
        this.students = new ArrayList<Student>();
    }

    /**
     * Переопределяем метод для класса студентов
     * @return  возвращает список всех студентов
     */
    @Override
    public List<Student> getAll() {
        return students;
    }

    /**
     * Метод добавления студента в список
     * @param firstName  имя
     * @param age возраст
     */
    public void create(String firstName, int age) {
        Student per = new Student(firstName, age, count);
        count++;
        students.add(per);
    }

    /**
     * Определяем метод сортировки студентов из списка
     */
    public void getSortByFioStdLst() {
        students.sort(new PersonComparator<Student>());
    }
}
