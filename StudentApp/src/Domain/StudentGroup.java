package Domain;

import java.util.Iterator;
import java.util.List;

/**
 * Класс группы студентов, содержит в себе список студентов
 * Так же подключается итератор
 */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {

    private List<Student> group;
    private Integer idGroup;

    /**
     * Конструктор группы студентов
     *
     * @param group   имя списка студентов
     * @param idGroup
     */
    public StudentGroup(List<Student> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student> getGroup() {
        return group;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public void setIdGroup(Integer idGroup) {
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
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {

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
            public Student next() {
                return group.get(counter++);
            }
        };

    }

    @Override
    public int compareTo(StudentGroup o) {

        if (StudentGroup.this.getGroup().size() == o.getGroup().size()) {
            return 0;
        }
        if (StudentGroup.this.getGroup().size() < o.getGroup().size()) {
            return -1;
        } else return 1;
    }
}

