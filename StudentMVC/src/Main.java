import Controller.Controller;
import Controller.iGetView;
import Controller.iGetModel;
import Model.ModelFile;
//import Model.ModelList;
import Model.Student;
import View.ViewEng;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       // List<Student> students = new ArrayList<Student>();

        Student s1 = new Student("Игорь", 40, 551);
        Student s2 = new Student("Борис", 34, 552);
        Student s3 = new Student("Леша", 40, 553);
        Student s4 = new Student("Ирина", 34, 554);
        Student s5 = new Student("Аня", 40, 555);
        Student s6 = new Student("Евгений", 34, 556);

        //Collections.addAll(students, s1,s2,s3,s4,s5,s6); // добавление студентов в список

        HashMap<Long, Student> studentsHm = new HashMap<>();
        studentsHm.put((long) (s1.getId()), s1);
        studentsHm.put((long) (s2.getId()), s2);
        studentsHm.put((long) (s3.getId()), s3);
        studentsHm.put((long) (s4.getId()), s4);
        studentsHm.put((long) (s5.getId()), s5);
        studentsHm.put((long) (s6.getId()), s6);


        ModelFile fmodel = new ModelFile("StudentDB.txt");

        ViewEng viewEng = new ViewEng();

        //fmodel.saveAllStudentsHmToFile(studentsHm);

       // iGetModel modelFile = fmodel;
        //iGetModel model = new ModelList(students);
        //iGetView view = new View();

        Controller control = new Controller(fmodel, viewEng);

        System.out.println(fmodel.getAllHashStudents());

        //control.updateHm();

        control.run();

    }
}