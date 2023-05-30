package Seminar7;

import java.util.logging.Level;
import java.util.logging.Logger;
import Seminar7.calculator.ComplexNumber;
import Seminar7.calculator.ComplexCalculator;
import Seminar7.calculator.ComplexCalculatorImpl;

/**
 * Класс приложения для демонстрации работы калькулятора комплексных чисел.
 */
public class ComplexCalculatorApp {
    private static final Logger logger = Logger.getLogger(ComplexCalculatorApp.class.getName());

    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(2, 3);
        ComplexNumber b = new ComplexNumber(4, 5);

        ComplexCalculator calculator = new ComplexCalculatorImpl();

        logger.log(Level.INFO, "Выполнение операций с комплексными числами...");

        ComplexNumber сумма = calculator.add(a, b);
        ComplexNumber произведение = calculator.multiply(a, b);
        ComplexNumber частное = calculator.divide(a, b);

        logger.log(Level.INFO, "Сумма: " + сумма);
        logger.log(Level.INFO, "Произведение: " + произведение);
        logger.log(Level.INFO, "Частное: " + частное);
    }
}