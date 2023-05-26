/**
 * Класс, представляющий сотрудника.
 */
import java.util.Date;
public class Employee {
    private String name; // Имя сотрудника
    private Date dob; // Дата рождения сотрудника
    private int baseSalary; // Базовая заработная плата сотрудника

    /**
     * Конструктор класса Employee.
     * @param name Имя сотрудника.
     * @param dob Дата рождения сотрудника.
     * @param baseSalary Базовая заработная плата сотрудника.
     */
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    /**
     * Получение информации о сотруднике.
     * @return Информация о сотруднике.
     */
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
    
}