import java.util.Scanner;
import Classes.ComplexNumber;
import View.ViewDiff;
import View.ViewDivison;
import View.ViewMult;
import View.ViewSum;

public class App {

    public static void main(String[] args) {

        while (true)
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите элементы комплексного числа 1 (z1 = a1 + i*b1):");
            System.out.print("a1 = ");
            int a1 = in.nextInt();
            System.out.print("b1 = ");
            int b1 = in.nextInt();
            System.out.print("Выберите действие (1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление): ");
            int activion = in.nextInt();

            System.out.println("Введите элементы комплексного числа 2 (z2 = a2 + i*b2):");
            System.out.print("a2 = ");
            int a2 = in.nextInt();
            System.out.print("b2 = ");
            int b2 = in.nextInt();

            ComplexNumber complexNumber1 = new ComplexNumber(a1, b1);
            ComplexNumber complexNumber2 = new ComplexNumber(a2, b2);

            if (activion == 1)
            {
                ViewSum view = new ViewSum(complexNumber1, complexNumber2);
                view.calcSum(complexNumber1, complexNumber2);
                System.out.println("===========================================================");
            }
            if (activion == 2)
            {
                ViewDiff view = new ViewDiff(complexNumber1, complexNumber2);
                view.calcDiff(complexNumber1, complexNumber2);
                System.out.println("===========================================================");
            }
            if (activion == 3)
            {
                ViewMult view = new ViewMult(complexNumber1, complexNumber2);
                view.calcMult(complexNumber1, complexNumber2);
                System.out.println("===========================================================");
            }
            if (activion == 4)
            {
                ViewDivison view = new ViewDivison(complexNumber1, complexNumber2);
                view.calcDivision(complexNumber1, complexNumber2);
                System.out.println("===========================================================");
                
            }
        }
        
    }
}
