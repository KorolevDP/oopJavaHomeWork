package Domain;

import java.util.Iterator;
import java.util.List;

public class StudentGroup  implements  Iterable<Student>{

    public StudentGroup(List<Student> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    private List<Student> group;
    private Integer idGroup;

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
    public Iterator<Student> iterator() {
        return int Iterator <Student> (){

            private int counter;

            @Override
        }

    }
}

