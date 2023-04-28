package StudentDomen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Класс, представляющий поток студентов с полем номер потока и списком учебных групп.
 */
public class StudentCourse implements Iterable<StudentGroup> {
    private int courseNumber;
    private List<StudentGroup> groups;

    /**
     * Конструктор для создания нового потока студентов.
     * @param courseNumber номер потока
     */
    public StudentCourse(int courseNumber) {
        this.courseNumber = courseNumber;
        this.groups = new ArrayList<>();
    }

    /**
     * Метод для добавления новой учебной группы в поток студентов.
     * @param group новая учебная группа
     */
    public void addGroup(StudentGroup group) {
        groups.add(group);
    }

    /**
     * Метод для получения списка учебных групп в потоке студентов.
     * @return список учебных групп в потоке студентов
     */
    public List<StudentGroup> getGroups() {
        return groups;
    }

    /**
     * Метод для установки списка учебных групп в потоке студентов.
     * @param groups новый список учебных групп в потоке студентов
     */
    public void setGroups(List<StudentGroup> groups) {
        this.groups = groups;
    }

    /**
     * Метод для получения номера потока.
     * @return номер потока
     */
    public int getCourseNumber() {
        return courseNumber;
    }

    /**
     * Метод для установки номера потока.
     * @param courseNumber новый номер потока
     */
    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    /**
     * Реализация метода интерфейса Iterable для класса StudentCourse.
     * @return итератор для списка учебных групп в потоке студентов
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return groups.iterator();
    }

    /**
     * Метод для вывода на консоль всех студентов во всех группах данного потока.
     */
    public void printAllStudents() {
        for (StudentGroup group : groups) {
            System.out.println("Group #" + group.getGroupNumber() + ":");
            for (Student student : group.getStudents()) {
                System.out.println(student);
            }
            System.out.println();
        }
    }

    /**
     * Метод для сортировки учебных групп в потоке по количеству студентов.
     */
    public void sortGroupsBySize() {
        Collections.sort(groups, Collections.reverseOrder());
    }
}