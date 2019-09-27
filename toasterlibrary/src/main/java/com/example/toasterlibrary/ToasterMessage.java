package com.example.toasterlibrary;


public class ToasterMessage {

    public static double s(double first_operand, double second_operand, String operator){
        if(operator.equals("/")) {
            return (first_operand / second_operand);
        } else if(operator.equals("+")) {
            return (first_operand + second_operand);
        } else if(operator.equals("x")) {
            return (first_operand * second_operand);
        } else if(operator.equals("-")) {
            return (first_operand - second_operand);
        } else if(operator.equals("sin")) {
            return (Math.sin(first_operand));
        } else if(operator.equals("cos")) {
            return (Math.cos(first_operand));
        } else if(operator.equals("tan")) {
            return (Math.tan(first_operand));
        }
        return 0;
    }
}
