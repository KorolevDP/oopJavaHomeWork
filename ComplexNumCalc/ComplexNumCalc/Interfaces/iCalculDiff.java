package Interfaces;

import Classes.ComplexNumber;
/**
 * Интерфейс, описывающий разницу двух комплексных чисел
 */
public interface iCalculDiff {
    /**
     * Метод подсчета разницы двух комплексных чисел
     * @param complexNumber1 - комплексное число 1
     * @param complexNumber2 - комплексное число 2
     */
    public void calcDiff(ComplexNumber complexNumber1, ComplexNumber complexNumber2);
}
