package Domain;

public class Student extends Person implements Comparable<Student> {
    private int id;

    public Student(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Students [age=" + super.getAge() + ", name=" + super.getName() + ", id=" + id + "]";
    }

    @Override
    public int compareTo(Student o) {

        if (getId() == o.getId()) {
            return 0;
        }
        if (getId() < o.getId())
            return 1;
        else return -1;


        if (super.getAge() == o.getAge()) {
            return 0;
        }
        if (super.getAge() > o.getAge())
            return 1;
        else return -1;
    }
}