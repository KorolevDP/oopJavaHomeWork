package Domain;

import java.util.List;

public class AverageAge{

    public static <T extends Person> Double man(List<T> db) {
        Double sum = (double) 0;
        for (T person : db) {
            sum += person.getAge();
        }
        return sum / db.size();
    }
}