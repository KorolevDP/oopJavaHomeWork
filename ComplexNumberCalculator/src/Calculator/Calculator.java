package Calculator;

public final class Calculator extends ComplexNumber implements iCalculable {

    private ComplexNumber primaryArg;

    public Calculator(double real, double image) {
        super(real, image);
    }

    @Override
    public iCalculable sum(ComplexNumber cB) {

        ComplexNumber sumC = new ComplexNumber(real,image);

        sumC.real = primaryArg.real + cB.real;
        sumC.image = primaryArg.image + cB.image;

        return this;

    }

    @Override
    public iCalculable multi(ComplexNumber cB) {

        ComplexNumber prod = new ComplexNumber(real,image);

        prod.real = primaryArg.real * cB.real - primaryArg.image * cB.image;
        prod.image = primaryArg.image * cB.real + primaryArg.real * cB.image;

        return this;
    }

    @Override
    public iCalculable division(ComplexNumber cB) {

        ComplexNumber div = new ComplexNumber(real,image);

        div.real = (primaryArg.real * cB.real + primaryArg.image * cB.image) / ((Math.pow(cB.real, 2) + (Math.pow(cB.image, 2))));
        div.image = (primaryArg.image * cB.real - primaryArg.real * cB.image) / ((Math.pow(primaryArg.real, 2) + (Math.pow(cB.image, 2))));

        return this;
    }

    @Override
    public ComplexNumber getResult() {
        return primaryArg;
    }
}

