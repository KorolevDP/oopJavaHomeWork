package Domain;

import java.util.List;

import Domain.Person;

public class AverageAge<T extends Person> {

    public Double getAverageAge(List<T> persons) {
        double res = 0;
        for (int i = 0; i < persons.size(); i++) {

            res = res + persons.get(i).getAge();
        }
        return res / persons.size();
    }
}