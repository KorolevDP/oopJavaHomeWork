package View;

import Controller.iGetView;
import Model.Student;

import java.util.List;

public class View  implements iGetView {

    public void printAllStudents(List<Student> students) {
        System.out.println("-------------Список студентов-------------");
        for (Student stud: students)
        {
            System.out.println(stud);
        }
        System.out.println("==========================================");
    }

}
