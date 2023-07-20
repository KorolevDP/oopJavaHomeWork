import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws  Exception {

        Student<String,Integer> s1 = new Student<String,Integer>("Гена", 23, 1000);
        Student<String,Integer> s2 = new Student<String,Integer>("Петя", 24, 1001);
        Student<String,Integer> s3 = new Student<String,Integer>("Лена", 26, 1002);

        List<Student<String,Integer>> listStud = new ArrayList<>();

        Collections.addAll(listStud, s1,s2,s3);

        StudentGroup<String, Integer> group = new StudentGroup<String,Integer>(listStud,9);

        for (Student<String,Integer> stud : group)
        {
            System.out.println(stud);
        }
    }
}