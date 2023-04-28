package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private List<Student> students;
    private int groupNumber;

    public StudentGroup(List<Student> students) {
       this.students = students;
    }
    
    /**
     * Метод для получения номера группы.
     * @return номер группы
     */
    public int getGroupNumber() {
        return groupNumber;
    }

    /**
     * Метод для установки номера группы.
     * @param groupNumber новый номер группы
     */
    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }
    public StudentGroup(int groupNumber, List<Student> students) {
        this.groupNumber = groupNumber;
        this.students = students;
    }
    

    // @Override
    // public Iterator<Student> iterator() {
    //     return new StudentGroupIterator(students);
    // }

    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>(){
            private int index = 0;
            @Override
            public boolean hasNext() {
               return index<students.size();
            }
            @Override
            public Student next() {
                if(!hasNext())
                {
                    return null;
                }
                //counter++;
                return students.get(index++);        
            }

        };
    }
    
}