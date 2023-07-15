package Services;

import Domain.Student;
import Domain.Emploee;

import java.util.ArrayList;
import java.util.List;

public class EmploeeService implements iPersonService<Emploee> {

    private int count;
    private List<Emploee> emploees;

    /**
     * Конструктор сотрудников
     */
    public EmploeeService() {
        this.emploees = new ArrayList<Emploee>();
    }

    @Override
    public List<Emploee> getAll() {

        throw new UnsupportedOperationException("Uniplemented method 'getAll'");
    }

    public void create(String firstName, int age) {
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }
}