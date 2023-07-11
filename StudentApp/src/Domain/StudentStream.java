package Domain;

import java.util.Iterator;
import java.util.List;

/**
 *  Класс потока студентов
 */
public class StudentStream implements Iterable<StudentGroup> {

    private List<StudentGroup> studStream;
    private Integer idStStream;

    /**
     * Конструктор потока
     * @param studStream имя потока студентов
     * @param idStStream
     */
    public StudentStream(List<StudentGroup> studStream, Integer idStStream) {
        this.studStream = studStream;
        this.idStStream = idStStream;
    }

    public List<StudentGroup> getStudStream() {
        return studStream;
    }

    // геттеры + сеттеры
    public Integer getIdStudCourse() {
        return idStStream;
    }

    public void setStudStream(List<StudentGroup> studStream) {
        this.studStream = studStream;
    }

    public void setIdStudCourse(Integer idStStream) {
        this.idStStream = idStStream;
    }

    @Override
    public String toString() {
        return "StudentStream{" +
                "Stream =" + studStream +
                ", idStream =" + idStStream +
                '}';
    }

    /**
     * Итератор, аналогичный итератору студентов
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {

            private int counter;

            @Override
            public boolean hasNext() {
                if (counter < studStream.size()) {
                    return true;
                } else {
                    return false;
                }
            }
            @Override
            public StudentGroup next() {
                return studStream.get(counter++);
            }
        };
    }
}
