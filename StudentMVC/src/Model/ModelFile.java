package Model;

import Controller.iGetModel;

import java.util.List;

public class ModelFile  implements iGetModel {
    private String filename;

    public ModelFile(String filename) {
        this.filename = filename;
    }

    @Override
    public List<Student> getAllStudent() {
        throw new UnsupportedOperationException()
    }
}
