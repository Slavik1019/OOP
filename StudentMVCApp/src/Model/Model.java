package Model;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import Controller.iGetModel;

public class Model implements iGetModel {
    private HashMap<Long, Student> students;

    public Model(HashMap<Long, Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudent()
    {
        return new ArrayList<>(students.values());
    }

    public boolean deleteStudent(Long id) {
        if (students.containsKey(id)) {
            students.remove(id);
            return true;
        }
        return false;
    }

    @Override
    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }
}