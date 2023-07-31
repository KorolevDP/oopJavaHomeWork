package View;
import Classes.ComplexNumber;
import Interfaces.iCalculSum;

public class ViewSum implements iCalculSum{
    private ComplexNumber complexNumber1;
    private ComplexNumber complexNumber2;
    
    public ViewSum(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
        this.complexNumber1 = complexNumber1;
        this.complexNumber2 = complexNumber2;
    }

    @Override
    public void calcSum(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
        double res1 = complexNumber1.getA() + complexNumber2.getA();
        double res2 = complexNumber1.getB() + complexNumber2.getB();
        if (res2 < 0 && complexNumber1.getB() < 0 && complexNumber2.getB() < 0)
        {
            System.out.println("Сумма комплексных чисел " + complexNumber1.toStringMinus() + " и " + complexNumber2.toStringMinus() + " равна "+ res1 + " - i*" + (-res2));
        }
        if (res2 < 0 && complexNumber1.getB() > 0 && complexNumber2.getB() < 0)
        {
            System.out.println("Сумма комплексных чисел " + complexNumber1.toStringPlus() + " и " + complexNumber2.toStringMinus() + " равна "+ res1 + " - i*" + (-res2));
        }
        if (res2 < 0 && complexNumber1.getB() < 0 && complexNumber2.getB() > 0)
        {
            System.out.println("Сумма комплексных чисел " + complexNumber1.toStringMinus() + " и " + complexNumber2.toStringPlus() + " равна "+ res1 + " - i*" + (-res2));
        }
        if (res2 < 0 && complexNumber1.getB() > 0 && complexNumber2.getB() > 0)
        {
            System.out.println("Сумма комплексных чисел " + complexNumber1.toStringPlus() + " и " + complexNumber2.toStringPlus() + " равна "+ res1 + " - i*" + (-res2));
        }
        if (res2 > 0 && complexNumber1.getB() > 0 && complexNumber2.getB() > 0)
        {
            System.out.println("Сумма комплексных чисел " + complexNumber1.toStringPlus() + " и " + complexNumber2.toStringPlus() + " равна "+ res1 + " + i*" + res2);
        }
        if (res2 > 0 && complexNumber1.getB() < 0 && complexNumber2.getB() > 0)
        {
            System.out.println("Сумма комплексных чисел " + complexNumber1.toStringMinus() + " и " + complexNumber2.toStringPlus() + " равна "+ res1 + " + i*" + res2);
        }
        if (res2 > 0 && complexNumber1.getB() > 0 && complexNumber2.getB() < 0)
        {
            System.out.println("Сумма комплексных чисел " + complexNumber1.toStringPlus() + " и " + complexNumber2.toStringMinus() + " равна "+ res1 + " + i*" + res2);
        }
    }


}
