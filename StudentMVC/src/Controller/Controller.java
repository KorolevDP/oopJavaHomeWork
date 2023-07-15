package Controller;

import Model.ModelList;
import Model.Student;
import View.View;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private iGetModel model;
    private  iGetView view;
    private List<Student> students = new ArrayList<>();


    public Controller(ModelList model, View view) {
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
}
