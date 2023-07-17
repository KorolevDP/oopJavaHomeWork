package Services;

import Domain.PersonComparator;
import Domain.Teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherService implements iPersonService<Teacher> {

    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    /**
     * Переопределяем метод для преподавателей
     * @return  возвращаем список преподавателей
     */
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    /**
     * Добавление преподавателя в список
     * @param firstName  имя
     * @param age возраст
     */
    @Override
    public void create(String firstName, int age) {
       teachers.add(new Teacher(firstName, age, 0, "unknown"));
    }

    /**
     * Переопределяем общий метод сортировки по возрасту, конкретно для преподавателей
     */
    public  void SortByFioTecherLst() {
        teachers.sort(new PersonComparator<Teacher>());
    }
}
