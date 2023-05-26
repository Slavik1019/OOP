/**
 * Класс для расчета заработной платы с учетом налогов.
 */
public class SalaryCalculator {
    /**
     * Расчет чистой заработной платы сотрудника.
     * @param baseSalary Базовая заработная плата.
     * @return Чистая заработная плата.
     */
    public int calculateNetSalary(int baseSalary) {
        int tax = (int) (baseSalary * 0.25); // Расчет налога в другом формате
        return baseSalary - tax;
    }
}