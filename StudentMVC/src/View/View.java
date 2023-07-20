package View;

import Controller.iGetView;
import Model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class View  implements iGetView {

    public void printAllStudents(List<Student> students) {
        System.out.println("-------------Список студентов-------------");
        for (Student stud: students)
        {
            System.out.println(stud);
        }
        System.out.println("==========================================");
    }

    @Override
    public void printAllHashStudents(HashMap<Long, Student> hashStudents) {
        System.out.println("-------------Список студентов-------------");
        for(Student stud: hashStudents.values())
        {
            System.out.println(stud.toString());
        }
        System.out.println("==========================================");
    }

    @Override
    public String promt(String message){
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
