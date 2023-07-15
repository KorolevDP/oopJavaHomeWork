import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws  Exception {
        Student<String,Integer> s1 = new Student<String, Integer>("Семен", 25, 400);
        Student<String,Integer> s2 = new Student<String, Integer>("Иван", 24, 401);
        Student<String,Integer> s3 = new Student<String, Integer>("Андрей", 27, 402);

        List<Student<String, Integer>> listStud = new ArrayList<>();

        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);

        StudentGroup<String,Integer> group
    }
}