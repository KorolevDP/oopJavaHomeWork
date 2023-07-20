import Controller.Controller;
import Controller.iGetView;
import Controller.iGetModel;
import Model.ModelFile;
import Model.ModelList;
import Model.Student;
import View.View;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();

        Student s1 = new Student("Игорь", 40, 551);
        Student s2 = new Student("Борис", 34, 552);
        Student s3 = new Student("Леша", 40, 553);
        Student s4 = new Student("Ирина", 34, 554);
        Student s5 = new Student("Аня", 40, 555);
        Student s6 = new Student("Евгений", 34, 556);

        Collections.addAll(students, s1,s2,s3,s4,s5,s6); // добавление студентов в список


        ModelFile fmodel = new ModelFile("StudentDB.txt");
        fmodel.saveAllStudentsToFile(students);

        iGetModel modelFile = fmodel;
        //iGetModel model = new ModelList(students);
        iGetView view = new View();

        Controller control = new Controller(modelFile, view);

        //control.update();

        control.run();

    }
}