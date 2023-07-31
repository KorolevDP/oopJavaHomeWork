package View;
import Classes.ComplexNumber;
import Interfaces.iCalculMult;
public class ViewMult implements iCalculMult{
    private ComplexNumber complexNumber1;
    private ComplexNumber complexNumber2;
    
    public ViewMult(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
        this.complexNumber1 = complexNumber1;
        this.complexNumber2 = complexNumber2;
    }

    @Override
    public void calcMult(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
        double mult1 = complexNumber1.getA() * complexNumber2.getA() - complexNumber1.getB() * complexNumber2.getB();
        double mult2 = complexNumber1.getA() * complexNumber2.getB() + complexNumber1.getB() * complexNumber2.getA();
        if (mult2 < 0 && complexNumber1.getB() < 0 && complexNumber2.getB() < 0)
        {
            System.out.println("Произведение комплексных чисел " + complexNumber1.toStringMinus() + " и " + complexNumber2.toStringMinus() + " равно "+ mult1 + " - i*" + (-mult2));
        }
        if (mult2 < 0 && complexNumber1.getB() > 0 && complexNumber2.getB() < 0)
        {
            System.out.println("Произведение комплексных чисел " + complexNumber1.toStringPlus() + " и " + complexNumber2.toStringMinus() + " равно "+ mult1 + " - i*" + (-mult2));
        }
        if (mult2 < 0 && complexNumber1.getB() < 0 && complexNumber2.getB() > 0)
        {
            System.out.println("Произведение комплексных чисел " + complexNumber1.toStringMinus() + " и " + complexNumber2.toStringPlus() + " равно "+ mult1 + " - i*" + (-mult2));
        }
        if (mult2 < 0 && complexNumber1.getB() > 0 && complexNumber2.getB() > 0)
        {
            System.out.println("Произведение комплексных чисел " + complexNumber1.toStringPlus() + " и " + complexNumber2.toStringPlus() + " равно "+ mult1 + " - i*" + (-mult2));
        }
        if (mult2 > 0 && complexNumber1.getB() > 0 && complexNumber2.getB() > 0)
        {
            System.out.println("Произведение комплексных чисел " + complexNumber1.toStringPlus() + " и " + complexNumber2.toStringPlus() + " равно "+ mult1 + " + i*" + mult2);
        }
        if (mult2 > 0 && complexNumber1.getB() < 0 && complexNumber2.getB() > 0)
        {
            System.out.println("Произведение комплексных чисел " + complexNumber1.toStringMinus() + " и " + complexNumber2.toStringPlus() + " равно "+ mult1 + " + i*" + mult2);
        }
        if (mult2 > 0 && complexNumber1.getB() > 0 && complexNumber2.getB() < 0)
        {
            System.out.println("Произведение комплексных чисел " + complexNumber1.toStringPlus() + " и " + complexNumber2.toStringMinus() + " равно "+ mult1 + " + i*" + mult2);
        }
       
    }


}
