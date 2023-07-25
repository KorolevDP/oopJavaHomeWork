package View;

import Controller.iGetView;
import Model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ViewEng implements iGetView {

/*    public void printAllStudents(List<Student> students) {
        System.out.println("-------------List Students-------------");
        for (Student stud : students) {
            System.out.println(stud);
        }
        System.out.println("==========================================");
    }*/


    /**
     * Вывод всех студентов на печать
     * @param hashStudents
     */
    @Override
    public void printAllHashStudents(HashMap<Long, Student> hashStudents) {
        System.out.println("-------------List Students-------------");
        hashStudents.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println("==========================================");
    }

    @Override
    public String promt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}