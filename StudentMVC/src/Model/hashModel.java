package Model;

import Controller.iGetModel;

import java.util.HashMap;
import java.util.List;

public class hashModel  implements iGetModel{
    private HashMap<Long,Student> hashStudents;

    public hashModel(HashMap<Long,Student> hashStudents)
    {
        this.hashStudents = hashStudents;
    }

    @Override
    public HashMap<Long,Student> getAllHashStudents() {
        return hashStudents;
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }
}
