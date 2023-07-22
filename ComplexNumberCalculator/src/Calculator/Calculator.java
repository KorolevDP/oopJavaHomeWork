package Calculator;

public final class Calculator implements iCalculable, ComplexNumber {

    public Calculator() {}

    @Override
    public iCalculable sum(ComplexNumber cB) {

        ComplexNumber sumC = new ComplexNumber();

        sumC.real = real + cB.real;
        sumC.image = image + cB.image;

        return this;

    }

    @Override
    public iCalculable multi(ComplexNumber cB) {

        ComplexNumber prod = new ComplexNumber();

        prod.real = real * cB.real - image * cB.image;
        prod.image = image * cB.real + real* cB.image;

        return this;
    }

    @Override
    public iCalculable division(ComplexNumber cB) {

        ComplexNumber div = new ComplexNumber();



        return this;
    }

    @Override
    public int getResult() {
        return primaryArg;
    }
}

/* Сумма
z1= a1+ib1
z2= a2+ib2
z1+z2 = a1+a2 + (b1+b2)i

Разность
z1= a1+ib1
z2= a2+ib2
z1-z2 = a1-a2 + (b1-b2)i

Умножение
z1= a1+ib1
z2= a2+ib2
z1*z2 = a1*a2 - b1*b2 + (a1*b2+b1*a2)i

Деление
z1= a1+ib1
z2= a2+ib2
z1/z2 = (a1*a2 + b1*b2)/((pow(a2,2) + (pow(b2,2)) + i*(b1*a2 - a1*b2)/((pow(a,2) + (pow(b2,2))

 */