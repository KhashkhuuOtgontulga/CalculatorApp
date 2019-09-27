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
        }
        return 0;
    }
}
