package Calculator;

import java.util.Scanner;

public class ViewCalculator {

    private iCalculable calculator;

    public ViewCalculator(iCalculable calculator) {
        this.calculator = calculator;
    }

    public void run() {

        while (true) {
            ComplexNumber primaryArg = promptCompl("Введите первое комплексное число: ");
            calculator.sum(primaryArg);

            while (true) {
                String cmd = prompt("Введите команду (*, /, +, =) : ");
                if (cmd.equals("*")) {
                    ComplexNumber arg = promptCompl("Введите второе комплексное число: ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    ComplexNumber arg = promptCompl("Введите второе комплексное число: ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    ComplexNumber arg = promptCompl("Введите второе комплексное число: ");
                    calculator.division(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    ComplexNumber result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private ComplexNumber promptCompl(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return  in.nextLine();
    }


}
