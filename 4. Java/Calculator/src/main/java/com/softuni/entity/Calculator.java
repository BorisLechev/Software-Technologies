package com.softuni.entity;

public class Calculator {
    private double leftOperand;
    private double rightOperand;
    private String operator;


    public Calculator(double leftOperand, String operator, double rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
    }

    public double getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(double leftOperand) {
        this.leftOperand = leftOperand;
    }

    public double getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(double rightOperand) {
        this.rightOperand = rightOperand;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double calculateResult() {

        double result;

        switch (this.operator) {
            case "+":
                result = this.getLeftOperand() + this.getRightOperand();
                break;
            case "-":
                result = this.getLeftOperand() - this.getRightOperand();
                break;
            case "*":
                result = this.getLeftOperand() * this.getRightOperand();
                break;
            case "/":
                result = this.getLeftOperand() / this.getRightOperand();
                break;
            case "^":
                result = Math.pow(this.getLeftOperand(), this.getRightOperand());
                break;
            case "√":
                result = Math.sqrt(this.getLeftOperand());
                break;
            case "%":
                result = this.getLeftOperand() % this.getRightOperand();
                break;
            case "F":
                double[] array = new double[(int) (this.leftOperand + 1)];
                return fib(this.leftOperand, array);
            default:
                result = 0;
                break;
        }

        return result;
    }

    private double fib(double leftOperand, double[] array) {

        if (leftOperand < 3) {
            return 1;
        }

        int index = (int) leftOperand;

        if (array[index] != 0) {
            return array[index];
        }

        return array[index] = fib(leftOperand - 1, array) + fib(leftOperand - 2, array);
    }
}
