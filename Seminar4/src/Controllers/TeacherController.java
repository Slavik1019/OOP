package Controllers;

import StudentDomen.Teacher;
import StudentService.iUserService;

public class TeacherController implements iUserController<Teacher> {

    private iUserService<Teacher> teacherService;

    public TeacherController(iUserService<Teacher> teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        teacherService.create(firstName, secondName, age);
    }

   
}