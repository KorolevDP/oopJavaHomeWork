package SRP;

import java.util.Date;

/**
 * Класс сотрудник
 */
public class Employee {

    private String name;
    private Date dob;
    private int baseSalary;

    /**
     * @param name  имя
     * @param dob дата рождения
     * @param baseSalary оклад
     */
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

    public int getBaseSalary() {
        return baseSalary;
    }
}