package com.example.toasterlibrary;


public class CoreFunctionality {

    public static double calculate(double first_operand, double second_operand, String operator){
        if(operator.equals("/")) {
            return (first_operand / second_operand);
        } else if(operator.equals("+")) {
            return (first_operand + second_operand);
        } else if(operator.equals("x")) {
            return (first_operand * second_operand);
        } else if(operator.equals("-")) {
            return (first_operand - second_operand);
        } else if(operator.equals("sin")) {
            return (Math.sin(Math.toRadians(first_operand)));
        } else if(operator.equals("cos")) {
            return (Math.cos(Math.toRadians(first_operand)));
        } else if(operator.equals("tan")) {
            return (Math.tan(Math.toRadians(first_operand)));
        }
        return 0;
    }
}
