package Model;

import Controller.iGetModel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ModelFile implements iGetModel {
    private String filename;

    public ModelFile(String filename) {
        this.filename = filename;

        try (FileWriter fw = new FileWriter(filename, true)) {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public HashMap<Long, Student> getAllHashStudents() {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<Student>();
        try {
            File file = new File(filename);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null)
            {
                String[] param = line.split(" ");
                Student pers = new Student(param[0], Integer.parseInt(param[1]), Integer.parseInt(param[2]));
                students.add(pers);
                line = reader.readLine();
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        return students;
    }

    public void saveAllStudentsToFile(List<Student> students)
    {
        try (FileWriter fw = new FileWriter(filename, true))
        {
            for (Student pers : students) {
                fw.write(pers.getName()+" "+pers.getAge()+" "+pers.getId());
                fw.append("\n");
            }
            fw.flush();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
