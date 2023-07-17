package Domain;

import java.util.List;

import Domain.Person;

/**
 * Универсальный метод, для расчета среднего возраста субъекта из университета
 * @param <T> дженерик для списка объектов
 */
public class AverageAge<T extends Person> {

    public Double getAverageAge(List<T> persons) {
        double res = 0;
        for (int i = 0; i < persons.size(); i++) {

            res = res + persons.get(i).getAge();
        }
        return res / persons.size();
    }
}