package Interfaces;

import Classes.ComplexNumber;
/**
 * Интерфейс, описывающий деление двух комплексных чисел
 */
public interface iCalculDivision {
    /**
     * Метод подсчета результата деления двух комплексных чисел
     * @param complexNumber1 - комплексное число 1
     * @param complexNumber2 - комплексное число 2
     */
    public void calcDivision(ComplexNumber complexNumber1, ComplexNumber complexNumber2);
}
