package Model;

import Controller.iGetModel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModelFile implements iGetModel {
    private String filename;

    /**
     * Задаем файл для записи студентов
     * @param filename  имя файла
     */
    public ModelFile(String filename) {
        this.filename = filename;

        try (FileWriter fw = new FileWriter(filename, true)) {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Метод получения коллекции студентов в формате HashMap
     * @return  коллекция студентов
     */
    @Override
    public HashMap<Long, Student> getAllHashStudents() {
        HashMap<Long, Student> studentsHm = new HashMap<Long, Student>();
        try {
            File file = new File(filename);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            String line = reader.readLine();

            while (line != null) {

                String[] param = line.split(":");
                Long number = Long.parseLong(param[0]);
                String[] param2 = param[1].trim().split(" ");
                Student pers = new Student(param2[0], Integer.parseInt(param2[1]), Integer.parseInt(param[0]));
                studentsHm.put(number, pers);
                line = reader.readLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return studentsHm;
    }

    /**
     * Метод получения списка студентов
     * @return список студентов
     */
/*    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<Student>();
        try {
            File file = new File(filename);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                String[] param = line.split(" ");
                Student pers = new Student(param[0], Integer.parseInt(param[1]), Integer.parseInt(param[2]));
                students.add(pers);
                line = reader.readLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return students;
    }*/

/*    @Override
    public void deleteteStudent(Long idStudent) {

    }*/


    /**
     * Метод удаления студента по id из HashMap
     * @param idStudent
     */
    public void deleteStudent(Long idStudent) {
        HashMap<Long, Student> studHm = getAllHashStudents();
        if (studHm.containsKey(idStudent)) {
            studHm.remove(idStudent);
        }
        saveAllStudentsHmToFile(studHm);
    }


    /**
     * Сохранение коллекции студентов HashMap в файл
     * @param studentsHm  коллекция студентов
     */
    public void saveAllStudentsHmToFile(HashMap<Long,Student> studentsHm) {
        try (FileWriter fw = new FileWriter(filename, true)) {
            for (Map.Entry<Long, Student> mapElem : studentsHm.entrySet()) {
                fw.write(mapElem.getKey() + " : " + mapElem.getValue());
                fw.append("\n");
            }
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Сохранение коллекции студентов в формате List
     * @param students  - список студентов
     */
    public void saveAllStudentsToFile(List<Student> students) {
        try (FileWriter fw = new FileWriter(filename, true)) {
            for (Student pers : students) {
                fw.write(pers.getName() + " " + pers.getAge() + " " + pers.getId());
                fw.append("\n");
            }
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
