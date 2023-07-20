package Controller;

import Model.ModelList;
import Model.Student;
import View.View;
import View.ViewEng;
import Model.hashModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Controller {

    private iGetModel model;
    private  iGetView view;
    private List<Student> students = new ArrayList<>();
    private HashMap<Long,Student> studentsHm = new HashMap<>();


    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Student> students)
    {
        if (this.students.size() > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void update()
    {
        // MVP
        students = model.getAllStudents();
        if (testData(students))
        {
            view.printAllStudents(students);
        }
        else
        {
            System.out.println("List stud is empty");
        }

        // MVC
        //view.printAllStudents(model.getAllStudents());
    }

    public void run ()
    {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while (getNewIteration)
        {
            String command = view.promt("Введите команду:>");
            com = Commands.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                    getNewIteration=false;
                    System.out.println("Выход из программы");
                    break;
                case LIST:
                    view.printAllStudents(model.getAllStudents());
                    break;
                case DELETE:

                    break;
            }
        }
    }
}
