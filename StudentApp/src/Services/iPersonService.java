package Services;

import Domain.Person;

import java.util.List;

/**
 * Метод содержащий список объетов
 * @param <T> обобщенный тип
 */
public interface iPersonService<T> {

    List<T> getAll();
    void create(String firstName, int age);
}
