package Interfaces;

import Classes.ComplexNumber;
/**
 * Интерфейс, описывающий сумму двух комплексных чисел
 */
public interface iCalculSum {
    /**
     * Метод подсчета суммы двух комплексных чисел
     * @param complexNumber1 - комплексное число 1
     * @param complexNumber2 - комплексное число 2
     */
    public void calcSum(ComplexNumber complexNumber1, ComplexNumber complexNumber2);
}
