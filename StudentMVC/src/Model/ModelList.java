package Model;

import Controller.iGetModel;

import java.util.HashMap;
import java.util.List;

public class ModelList implements iGetModel {
    private List<Student> students;

    public ModelList(List<Student> students) {
        this.students = students;
    }

    @Override
    public HashMap<Long, Student> getAllHashStudents() {
        return null;
    }

    public List<Student> getAllStudents() {
        return students;
    }
}
