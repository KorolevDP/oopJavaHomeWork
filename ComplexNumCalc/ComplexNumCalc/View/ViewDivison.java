package View;
import Classes.ComplexNumber;
import Interfaces.iCalculDivision;

public class ViewDivison implements iCalculDivision{
    private ComplexNumber complexNumber1;
    private ComplexNumber complexNumber2;
    
    public ViewDivison(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
        this.complexNumber1 = complexNumber1;
        this.complexNumber2 = complexNumber2;
    }

    @Override
    public void calcDivision(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
        double div1 = (complexNumber1.getA() * complexNumber2.getA() + complexNumber1.getB() * complexNumber2.getB())/(complexNumber2.getA()*complexNumber2.getA() + complexNumber2.getB() * complexNumber2.getB());
        double div2 = (complexNumber2.getA() * complexNumber1.getB() - complexNumber2.getB() * complexNumber1.getA())/(complexNumber2.getA()*complexNumber2.getA() + complexNumber2.getB() * complexNumber2.getB());
        if (div2 < 0 && complexNumber1.getB() < 0 && complexNumber2.getB() < 0)
        {
            System.out.println("Результат деления комплексных чисел " + complexNumber1.toStringMinus() + " и " + complexNumber2.toStringMinus() + " равен "+ div1 + " - i*" + (-div2));
        }
        if (div2 < 0 && complexNumber1.getB() > 0 && complexNumber2.getB() < 0)
        {
            System.out.println("Результат деления комплексных чисел " + complexNumber1.toStringPlus() + " и " + complexNumber2.toStringMinus() + " равен "+ div1 + " - i*" + (-div2));
        }
        if (div2 < 0 && complexNumber1.getB() < 0 && complexNumber2.getB() > 0)
        {
            System.out.println("Результат деления комплексных чисел " + complexNumber1.toStringMinus() + " и " + complexNumber2.toStringPlus() + " равен "+ div1 + " - i*" + (-div2));
        }
        if (div2 < 0 && complexNumber1.getB() > 0 && complexNumber2.getB() > 0)
        {
            System.out.println("Результат деления комплексных чисел " + complexNumber1.toStringPlus() + " и " + complexNumber2.toStringPlus() + " равен "+ div1 + " - i*" + (-div2));
        }
        if (div2 > 0 && complexNumber1.getB() > 0 && complexNumber2.getB() > 0)
        {
            System.out.println("Результат деления комплексных чисел " + complexNumber1.toStringPlus() + " и " + complexNumber2.toStringPlus() + " равен "+ div1 + " + i*" + div2);
        }
        if (div2 > 0 && complexNumber1.getB() < 0 && complexNumber2.getB() > 0)
        {
            System.out.println("Результат деления комплексных чисел " + complexNumber1.toStringMinus() + " и " + complexNumber2.toStringPlus() + " равен "+ div1 + " + i*" + div2);
        }
        if (div2 > 0 && complexNumber1.getB() > 0 && complexNumber2.getB() < 0)
        {
            System.out.println("Результат деления комплексных чисел " + complexNumber1.toStringPlus() + " и " + complexNumber2.toStringMinus() + " равен "+ div1 + " + i*" + div2);
        }
       
    }


}
