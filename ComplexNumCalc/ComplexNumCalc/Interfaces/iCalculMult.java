package Interfaces;

import Classes.ComplexNumber;
/**
 * Интерфейс, описывающий произведение двух комплексных чисел
 */
public interface iCalculMult {
    /**
     * Метод подсчета произведения двух комплексных чисел
     * @param complexNumber1 - комплексное число 1
     * @param complexNumber2 - комплексное число 2
     */
    public void calcMult(ComplexNumber complexNumber1, ComplexNumber complexNumber2);
}
