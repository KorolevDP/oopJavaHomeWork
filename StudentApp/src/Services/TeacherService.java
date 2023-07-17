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

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, int age) {
       teachers.add(new Teacher(firstName, age, 0, "unknown"));
    }

    public  void SortByFioTecherLst() {
        teachers.sort(new PersonComparator<Teacher>());
    }
}
