package Domain;

import java.util.Comparator;

/**
 * Класс для сравнения людей в университете
 * * @param <T>  задаем компаратор
 */
public class PersonComparator<T extends Person> implements Comparator<T> {

    /**
     * Метод сравнения субъектов в университете по возрасту
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return  возвращает результат сравнения
     */
    @Override
    public int compare(T o1, T o2) {

        int res = o1.getName().compareTo(o2.getName());

        if (res == 0) {
            if (o1.getAge() == o2.getAge()) {
                return 0;
            } else {
                if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        } else return res;
    }
}
