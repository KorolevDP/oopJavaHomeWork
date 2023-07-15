import Controller.Controller;
import Model.ModelList;
import Model.Student;
import View.View;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Dima", 40, 555);
        Student s2 = new Student("Den", 34, 554);

        students.add(s1);
        students.add(s2);

        iGetModel model = new ModelList(students);
        iGetView view = new View();

        Controller control = new Controller(model, view);

        control.update();

    }
}