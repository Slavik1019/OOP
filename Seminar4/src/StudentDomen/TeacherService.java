package StudentDomen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import StudentService.iUserService;

public class TeacherService implements iUserService<Teacher> {

    private List<Teacher> teachers;

    public TeacherService() {
        teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        Collections.sort(teachers, new UserComparator<>());
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Teacher teacher = new Teacher(firstName, secondName, age, 0, "");
        teachers.add(teacher);
    }
}