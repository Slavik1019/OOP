import java.net.NoRouteToHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.User;
import StudentDomen.AverageAge;
import StudentDomen.Teacher;

public class App {
    public static void main(String[] args) throws Exception {
        // User u1 = new User("Сергей","Иванов",25);
        // Student s1 = new Student("Сергей", "Иванов", 22, (long)101);
        // Student s2 = new Student("Андрей", "Сидоров", 22, (long)111);
        // Student s3 = new Student("Иван", "Петров", 22, (long)121);
        // Student s4 = new Student("Игорь", "Иванов", 23, (long)301);
        // Student s5 = new Student("Даша", "Цветкова", 23, (long)171);
        // Student s6 = new Student("Лена", "Незабудкина", 23, (long)104);

        // List<Student> listStud = new ArrayList<Student>();
        // listStud.add(s1);
        // listStud.add(s2);
        // listStud.add(s3);
        // listStud.add(s4);
        // listStud.add(s5);
        // listStud.add(s6);

        // StudentGroup group = new StudentGroup(listStud);

        // for(Student stud : group)
        // {
        //     System.out.println(stud);
        // }

        // System.out.println("============= после сортировки =============");
        // Collections.sort(group.getStudents());


        // for(Student stud : group)
        // {
        //     System.out.println(stud);
        // }
        

        Emploee peron1 = new Emploee("Иванов", "Олег", 55, 110);
        Student s1 = new Student("Сергей", "Иванов", 22, (long)101);

        //EmploeeController contrEmp = new EmploeeController();
        EmploeeController.paySalary(peron1);
        //contrEmp.paySalary(s1);

        Integer studHour[] = {124,234,231,1,45};
        System.out.println(EmploeeController.mean(studHour));

        Double emplSalary[] = {12555.23,34213.5,10000.0};
        System.out.println(EmploeeController.mean(emplSalary));

        List<Student> students = new ArrayList<>();
        students.add(new Student("Иван", "Иванов", 20, 12345));
        students.add(new Student("Петр", "Петров", 22, 23456));
        students.add(new Student("Анна", "Сидорова", 21, 34567));

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Мария", "Иванова", 35, 1, "доктор наук"));
        teachers.add(new Teacher("Сергей", "Петров", 40, 2, "кандидат наук"));
        teachers.add(new Teacher("Елена", "Сидорова", 30, 3, "магистр"));

        List<Emploee> Emploee = new ArrayList<>();
        Emploee.add(new Emploee("Андрей", "Иванов", 25, 110));
        Emploee.add(new Emploee("Ольга", "Петрова", 30, 200));
        Emploee.add(new Emploee("Игорь", "Сидоров", 28, 300));

       
        AverageAge<Student> studentAverageAge = new AverageAge<>(students, "студентов");
        studentAverageAge.printAverageAge();

        AverageAge<Teacher> teacherAverageAge = new AverageAge<>(teachers, "учителей");
        teacherAverageAge.printAverageAge();

        AverageAge<Emploee> staffAverageAge = new AverageAge<>(Emploee, "работников");
        staffAverageAge.printAverageAge();

            
        //System.out.println(u1);
        //System.out.println(s1);
        //System.out.println(group);
    }
}