package Controllers;

import Domain.Emploee;
import Domain.Person;
import Services.EmploeeService;

public class EmploeeController implements iPersonController<Emploee> {

    private final EmploeeService empService = new EmploeeService();

    @Override
    public void create(String firstName, int age) {
        empService.create(firstName, age);
    }

    /**
     * Метод для выплаты з/п сотруднику
     * @param person  сотрудник
     * @param <T>
     */
    public static <T extends Emploee> void paySalary(T person) {
        System.out.println(person.getName() + " выплачена зарплата 10000р. ");
    }
}
