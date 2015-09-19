import java.io.*;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//String value = in.nextLine();
		//System.out.println("Welcome to Calc 1.0.\nA few instructions to get you started\nAll inputs should be seperated by a space.\nThe mathematical operators use thesame conventional symbols\nHowever there are a few exceptions:\n square root= sqrt,\n Power = pow and\n Average =avg"); 
		System.out.println("Enter a numeric value1 operator then value2\nFor example 4 sqrt or 2 pow 2 for 2^2 or avg for");
		String s1=getUserInput();
		System.out.println("Enter an operator symbol: ");
		String operator = getUserInput();		
		String s2 = getS2(operator);		
		double result =0d;
		
		switch (operator) {
		case "+":
			result=addNumbers(s1, s2);
			break;
		case "-":
			result=subtractNumbers(s1, s2);
			break;
		case "*":
			result=multiplyNumbers(s1, s2);
			break;
		case "/":
			result=divideNumbers(s1, s2);
			break;
		case "%":
			result=modNumbers(s1, s2);
			break;
		case "sqrt":
			result=sqrtNumbers(s1);
			break;
		case "pow":
			result=powNumbers(s1, s2);
			break;
		case "avg":
			result=avgNumbers(s1, s2);
			break;
		default:
			System.out.println("You entered an incorrect value!!!");
			return;
		}System.out.println("The answer is: "+result);
	}
	private static String getS2(String operator) {
		Scanner in = new Scanner(System.in);
		String s2;
		if (operator!="sqrt") {
			System.out.println("Enter value2");
			s2=getUserInput();
		}
		else {
			s2=null;
		}
		return s2;
	}
	private static double powNumbers(String s1, String s2){
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		double result = Math.pow(d1, d2);
		return result;
	}
	private static double sqrtNumbers(String s1){
		double d1 = Double.parseDouble(s1);
		double t;
		double result =d1/2;
		do {
			t = result;
			result = (t+(d1/t))/2;
		}while ((d1-result)!=0);
		return result;
	}	
	private static double modNumbers(String s1, String s2){
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		double result = d1% d2;
		return result;
	}
	private static double avgNumbers(String s1, String s2){
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		double result = (d1+d2)/2;
		return result;
	}
	private static double divideNumbers(String s1, String s2) {		
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		double result = d1/d2;
		return result;
	}
	private static double multiplyNumbers(String s1, String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		double result = d1*d2;
		return result;
	}
	private static double subtractNumbers(String s1, String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		double result = d1-d2;
		return result;
	}
	private static double addNumbers(String s1, String s2) throws NumberFormatException {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		double result = d1+d2;
		return result;
	}
	private static String getUserInput()
	{
		Scanner in = new Scanner(System.in);
		String data = in.nextLine();
		return data;
	}
}
