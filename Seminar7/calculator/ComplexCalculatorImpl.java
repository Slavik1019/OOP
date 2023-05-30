package Seminar7.calculator;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Реализация калькулятора комплексных чисел.
 */
public class ComplexCalculatorImpl implements ComplexCalculator {
    private static final Logger logger = Logger.getLogger(ComplexCalculatorImpl.class.getName());

    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        logger.log(Level.INFO, "Adding complex numbers: " + a + ", " + b);
        double real = a.getReal() + b.getReal();
        double imaginary = a.getImaginary() + b.getImaginary();
        ComplexNumber result = new ComplexNumber(real, imaginary);
        logger.log(Level.INFO, "Result: " + result);
        return result;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        logger.log(Level.INFO, "Multiplying complex numbers: " + a + ", " + b);
        double real = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double imaginary = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        ComplexNumber result = new ComplexNumber(real, imaginary);
        logger.log(Level.INFO, "Result: " + result);
        return result;
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        logger.log(Level.INFO, "Dividing complex numbers: " + a + ", " + b);
        double denominator = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        double real = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / denominator;
        double imaginary = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / denominator;
        ComplexNumber result = new ComplexNumber(real, imaginary);
        logger.log(Level.INFO, "Result: " + result);
        return result;
    }
}