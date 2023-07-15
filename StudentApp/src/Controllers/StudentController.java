package Controllers;

import Domain.Student;
import Services.StudentService;

public class StudentController implements  iPersonController<Student>{

    private final StudentService dataService = new StudentService();

    /**
     * Метод регистрации студента в базе данных
     * @param firstName  имя
     * @param age возраст
     */
    @Override
    public void create(String firstName, int age) {
        dataService.create(firstName, age);
        dataService.getSortByFioStdLst();
    }
}
