package Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.jws.WebParam.Mode;

import Model.Student;
import Model.Model;
import View.View;
import View.ViewEng;

public class Controller {

    private HashMap<Long, Student> students; // используем хранилище типа HashMap<Long, Student>
    private iGetView view;
    private iGetModel model;

    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new HashMap<>(); // инициализируем HashMap
        this.viewEng = new ViewEng();
    }

    private iGetView viewEng;

    public void getAllStudent()
    {
        students = new HashMap<>(); // очищаем HashMap
        List<Student> allStudents = model.getAllStudent();
        for (Student student : allStudents) {
            students.put(student.getId(), student); // добавляем всех студентов в HashMap
        }
    }

    public boolean testData()
    {
        return !students.isEmpty(); // проверяем, не пустой ли список студентов
    }

    public void updateView()
    {
        getAllStudent();
        if(testData())
        {
            view.printAllStudent(new ArrayList<>(students.values())); // передаем список всех студентов в виде ArrayList
        }
        else{
            System.out.println("Список студентов пуст!");
        }
    }

    public void run()
    {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        updateView(); // добавляем вызов метода updateView() перед началом цикла while
        while(getNewIteration)
        {
            String command = view.prompt("Введите команду:");
            com = Commands.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                    getNewIteration=false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    if (view instanceof ViewEng) {
                        getAllStudent();
                        ((ViewEng) view).printAllStudentEng(new ArrayList<>(students.values())); // вызываем метод printAllStudentEng для класса ViewEng
                    } else {
                        updateView();
                    }
                    break;
                    case DELETE:
                    String input = view.prompt("Введите номер студента для удаления:");
                    Long idToDelete = Long.parseLong(input);
                    boolean success = model.deleteStudent(idToDelete);
         if (success) {
            System.out.println("Студент с номером " + idToDelete + " успешно удален.");
        } else {
            System.out.println("Студент с номером " + idToDelete + " не найден.");
           }
              break;
         }

     }
  }
}