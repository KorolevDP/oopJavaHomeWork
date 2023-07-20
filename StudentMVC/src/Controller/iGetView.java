package Controller;

import Model.Student;

import java.util.HashMap;
import java.util.List;

public interface iGetView {

    void printAllStudents(List<Student> students);

    void printAllHashStudents(HashMap<Long, Student> hashStudents);

    String promt(String message);
}
