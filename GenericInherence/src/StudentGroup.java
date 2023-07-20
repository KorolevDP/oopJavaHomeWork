

import java.util.Iterator;
import java.util.List;

/**
 * Класс группы студентов, содержит в себе список студентов
 * Так же подключается итератор
 */
public class StudentGroup<T extends Comparable<T>, V> implements Iterable<Student<T, V>> {

    private List<Student<T, V>> group;
    private V idGroup;

    /**
     * Конструктор группы студентов
     *
     * @param group   имя списка студентов
     * @param idGroup
     */
    public StudentGroup(List<Student<T, V>> group, V idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student<T, V>> getGroup() {
        return group;
    }

    public V getIdGroup() {
        return idGroup;
    }

    public void setGroup(List<Student<T, V>> group) {
        this.group = group;
    }

    public void setIdGroup(V idGroup) {
        this.idGroup = idGroup;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "group=" + group +
                ", idGroup=" + idGroup +
                '}';
    }

    /**
     * Задаем итератор
     */
    @Override
    public Iterator<Student<T, V>> iterator() {
        return new Iterator<Student<T, V>>() {

            private int counter; // счетчик экземпляров

            @Override
            public boolean hasNext() {
                if (counter < group.size()) // пока счетчик меньше размера группы, происходит перебор значений
                {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public Student<T, V> next() {
                return group.get(counter++);
            }
        };

    }
}

