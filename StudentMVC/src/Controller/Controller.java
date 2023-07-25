package Controller;

import Model.ModelFile;
import Model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import View.ViewEng;

public class Controller {

    private ModelFile model;
    //private iGetView view;
    private ViewEng view;
    //private List<Student> students = new ArrayList<>();
    private HashMap<Long, Student> studentsHm = new HashMap<>();


    public Controller(ModelFile model, ViewEng view) {
        this.model = model;
        this.view = view;
    }

/*    private boolean testData(List<Student> students) {
        if (this.students.size() > 0) {
            return true;
        } else {
            return false;
        }
    }*/

    /**
     * Проверка множества студентов на пустоту
     * @param studentsHm
     * @return
     */
    private boolean testHmData(HashMap<Long, Student> studentsHm) {
        if (studentsHm.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

/*
    public void update() {
*/
/*        // MVP
        studentsH = model.getAllStudents();

        if (testData(students)) {
            view.printAllStudents(students);
        } else {
            System.out.println("Student list is empty");
        }*//*


        // MVC
        //view.printAllStudents(model.getAllStudents());
    }
*/

    /**
     * Метод обновления статуса HashMap студентов
     * если не пустой, печатаем всех студентов,
     * либо выводим сообщение, что список пуст
     */
    public void updateHm() {
        studentsHm = model.getAllHashStudents();
        if (testHmData(studentsHm)) {
            view.printAllHashStudents(studentsHm);
        } else {
            System.out.println("Student list is empty");
        }
    }

    /**
     * Метод исполнения команд
     */
    public void run() {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            String command = view.promt("Enter command:>");
            com = Commands.valueOf(command.toUpperCase());

            switch (com) {
                case EXIT:                                                               // выход
                    getNewIteration = false;
                    System.out.println("Exit from programm ");
                    break;
                case LIST:                                                              // вывод на печать всех студентов
                    view.printAllHashStudents(model.getAllHashStudents());
                    break;
                case DELETE:                                                            // удаление
                    String inputId = view.promt("Enter student ID for delete:");
                    Long inputLongId = Long.parseLong(inputId);
                    model.deleteStudent(inputLongId);

                    System.out.println("Student deleted ");

                    model.saveAllStudentsHmToFile(model.getAllHashStudents());

                    view.printAllHashStudents(model.getAllHashStudents());
                    break;
            }
        }
    }
}
