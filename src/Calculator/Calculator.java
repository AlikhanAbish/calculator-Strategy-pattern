package Calculator;

public class Calculator {
    private Operation operation;

    public Calculator(Operation operation) {
        this.operation = operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public double calculate(double a, double b) {
        return operation.execute(a, b);
    }

}
