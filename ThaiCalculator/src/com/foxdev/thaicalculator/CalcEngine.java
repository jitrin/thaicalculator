package com.foxdev.thaicalculator;

public class CalcEngine {

	public static double calculate(double operand1, double operand2, String operation ) {
		if(operation.equals("add") == true) {
			return operand1 + operand2;
		} else if(operation.equals("minus") == true) {
			return operand1 - operand2;
		} else if(operation.equals("multiply") == true) {
			return operand1 * operand2;
		} else if(operation.equals("divide") == true) {
			return operand1 / operand2;
		} else {
			return 0;
		}
	}
	
	public static double calculate(double operand, String operation) {
		if(operation.equals("sqrt") == true) {
			return Math.sqrt(operand);
		}
		return 0;
	}
}
