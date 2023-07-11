import Controllers.EmploeeController;
import Domain.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println();

        Student s1 = new Student("Олег", 23, 121);
        Student s2 = new Student("Игорь", 23, 301);
        Student s3 = new Student("Иван", 23, 129);
        Student s4 = new Student("Петр", 22, 444);
        Student s5 = new Student("Даша", 22, 171);
        Student s6 = new Student("Лена", 22, 104);

        Student s9 = new Student("Андрей", 23, 222);
        Student s10 = new Student("Семен", 23, 223);
        Student s11 = new Student("Дмитрий", 23, 224);
        Student s12 = new Student("Александр", 22, 225);
        Student s13 = new Student("Вика", 22, 226);

        Student s14 = new Student("Егор", 23, 305);
        Student s15 = new Student("Лёля", 23, 306);
        Student s16 = new Student("Анатолий", 22, 307);
        Student s17 = new Student("Борис", 22, 308);

        List<Student> listStud1 = new ArrayList<Student>(); // список в который помещаются студенты
        List<Student> listStud2 = new ArrayList<Student>();
        List<Student> listStud3 = new ArrayList<Student>();

        listStud1.add(s1); // добавление студента в список
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s4);
        listStud1.add(s5);
        listStud1.add(s6);

        listStud2.add(s9);
        listStud2.add(s10);
        listStud2.add(s11);
        listStud2.add(s12);
        listStud2.add(s13);

        listStud3.add(s14);
        listStud3.add(s15);
        listStud3.add(s16);
        listStud3.add(s17);

        StudentGroup group4580 = new StudentGroup(listStud1, 4580); //создание группы из списка студентов
        StudentGroup group4590 = new StudentGroup(listStud2, 4590);
        StudentGroup group4600 = new StudentGroup(listStud3, 4600);

        List<StudentGroup> listStream1 = new ArrayList<>(); // создание списка групп для потока

        listStream1.add(group4580); // добавляем группы в список для потока
        listStream1.add(group4590);
        listStream1.add(group4600);

        StudentStream course1 = new StudentStream(listStream1, 1); // создаем сам поток


        for (StudentGroup studentGr : course1) {
            System.out.println("Group " + studentGr.getIdGroup());

            for (Student std : studentGr) {
                System.out.println(std);
            }
            System.out.println("=========================================");
        }

        Collections.sort(course1.getStudStream()); // сортировка потока

        for (StudentGroup studentGr : course1) {
            for (Student std : studentGr) {              // сортировка студентов в группе
                Collections.sort(studentGr.getGroup());
            }
        }

        System.out.println("================После сортировки=======================\n");

        for (StudentGroup studentGr : course1) {
            System.out.println("Group " + studentGr.getIdGroup());

            for (Student std : studentGr) {
                System.out.println(std);
            }
            System.out.println("=========================================");
        }
                
/*        for (Student std : group4580) {
            System.out.println(std);
        }

        System.out.println("===============================================\n");

        for (Student std : group4590) {
            System.out.println(std);
        }

        System.out.println("================После сортировки=======================\n");

        Collections.sort(group4580.getGroup());
        Collections.sort(group4590.getGroup());

        for (Student std : group4580.getGroup()) {
            System.out.println(std);
        }

        System.out.println("\n===============================================\n");

        for (Student std : group4590.getGroup()) {
            System.out.println(std);
        }*/

/*        System.out.println("=========================================================");

        Student s7 = new Student("Иван", 25, 121);
        Student s8 = new Student("Игорь", 23, 301);

        PersonComparator<Student> comS = new PersonComparator<Student>();
        comS.compare(s7, s8);

        Teacher t1 = new Teacher("Иван", 25, "Docent");
        Teacher t2 = new Teacher("Игорь", 23, "Professor");

        PersonComparator<Teacher> comT = new PersonComparator<Teacher>();
        comT.compare(t1, t2);

        PersonComparator<Person> comP = new PersonComparator<Person>();
        comP.compare(s7, t2);

        Emploee e1 = new Emploee("Федорович ", 60, "разнорабочим");
        EmploeeController empControll = new EmploeeController();
        //EmploeeController.paySalary(e1);
        //EmploeeController.paySalary(s7);
        empControll.paySalary(e1);
       //empControll.paySalary(s7);*/

    }
}