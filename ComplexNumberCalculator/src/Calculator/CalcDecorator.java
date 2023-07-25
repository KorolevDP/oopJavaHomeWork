package Calculator;

public class CalcDecorator implements iCalculable {

    private iCalculable oldCalc;
    private Logger logger;

    public CalcDecorator(iCalculable oldCalc, Logger logger) {
        this.oldCalc = oldCalc;
        this.logger = logger;
    }

    @Override
    public  iCalculable sum(ComplexNumber arg) {
        ComplexNumber firstArg = oldCalc.getResult();

        logger.log(String.format("Первое значение калькулятора %f,%f. Начало вызова метода sum с параметром %f,%f", firstArg, arg));
        iCalculable result = oldCalc.sum(arg);
        logger.log(String.format("Вызов метода sum произошел"));

        return result;
    }

    @Override
    public  iCalculable multi(ComplexNumber arg) {
        ComplexNumber firstArg = oldCalc.getResult();

        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода multi с параметром %d", firstArg, arg));
        iCalculable result = oldCalc.multi(arg);
        logger.log(String.format("Вызов метода multi произошел"));

        return result;
    }

    @Override
    public  iCalculable division(ComplexNumber arg) {
        ComplexNumber firstArg = oldCalc.getResult();

        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода division с параметром %d", firstArg, arg));
        iCalculable result = oldCalc.division(arg);
        logger.log(String.format("Вызов метода division произошел"));

        return result;
    }

    @Override
    public ComplexNumber getResult() {
        ComplexNumber result = oldCalc.getResult();
        logger.log(String.format("Получение результата %d", result));
        return result;
    }

}
