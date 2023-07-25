package Controller;

import Model.Student;

import java.util.HashMap;
import java.util.List;

public interface iGetModel {

    public HashMap<Long,Student> getAllHashStudents();
    //public List<Student> getAllStudents();
    public void deleteStudent(Long idStudent);

}
