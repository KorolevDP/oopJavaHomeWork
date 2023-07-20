package SRP;

public class calculateNetSalary {

    /**
     * Метод подсчета з/п
     * @param person  сотрудник
     * @return значение з/п минус налог
     */
    public int calculateNetSalary(Employee person) {

        int baseSalary = person.getBaseSalary();

        int tax = (int) (baseSalary * 0.25); //calculate in otherway
        return baseSalary - tax;
    }
}