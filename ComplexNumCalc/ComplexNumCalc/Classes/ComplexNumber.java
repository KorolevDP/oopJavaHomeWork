package Classes;
/**
 * Класс, описывающий комплексное число
 */
public class ComplexNumber {
    private double a;

    private double b;

    public ComplexNumber(double a, double b) {
        this.a = a;
        this.b = b;
    }
    /**
     * @param getA() - число а в уравнении вида z = a + i*b
     * 
     */
    public double getA() {
        return a;
    }
    /**
     * @param getB() - число b в уравнении вида z = a + i*b
     * 
     */
    public double getB() {
        return b;
    }
    /**
     * Метод для вывода комплексного числа при положительном значении b
     */
    public String toStringPlus()
    {
        return "z = " + getA() + " + i" + getB();
    }
    /**
     * Метод для вывода комплексного числа при отрицательном значении b
     */
    public String toStringMinus()
    {
        return "z = " + getA() + " - i" + (-getB());
    }
}