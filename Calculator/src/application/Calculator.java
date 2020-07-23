package application;

import java.util.Scanner;

public class Calculator {
	
	private char operation;
	private boolean running = true;
	private boolean numbersAreArabic = false;
	private boolean numbersAreRoman = false;

	private int a;
	private int b;

	private String[] number;

	private String[] romanReply = { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", 
			"XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", 
			"XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", 
			"XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", 
			"XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", 
			"LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", 
			"LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", 
			"LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", 
			"LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
			"XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C" };

	Scanner scanner = new Scanner(System.in);

	public void run() {
		
		do {
			getUserInput();
			calculateAndOutput();			
		} while(running);

	}

	private void getUserInput() {

		System.out.print("insert assignment > ...");
		
		String input = scanner.nextLine();
		number = input.split("\\s");
		
		Number firstNumber = new Number(number[0]);
		Number secondNumber = new Number(number[2]);
		operation = number[1].charAt(0);
		
		a=firstNumber.getIndex();
		System.out.println(a);
		
		b=secondNumber.getIndex();
		System.out.println(b);
		
		if (firstNumber.isArabic() && secondNumber.isArabic()) {
			numbersAreArabic = true;
			
		}
		
		if (firstNumber.isRoman() && secondNumber.isRoman()) {
			numbersAreRoman = true;
		}
		

	}

	public void calculateAndOutput() {
		if (numbersAreArabic) {

			if (operation == '+') {
				System.out.println("result: " + (a + b));
			} else if (operation == '-') {
				System.out.println("result: " + (a - b));
			} else if (operation == '*') {
				System.out.println("result: " + (a * b));
			} else if (operation == '/') {
				System.out.println("result: " + (a / b));
			} else
				System.out.println("unavailable operation");
			running = false;

		} else if (numbersAreRoman) {
			if (operation == '+') {
				System.out.println("result: " + romanReply[(a + b)-1]);
			} else if (operation == '-') {
				System.out.println("result: " + romanReply[(a - b)-1]);
			} else if (operation == '*') {
				System.out.println("result: " + romanReply[(a * b)-1]);
			} else if (operation == '/') {
				System.out.println("result: " + romanReply[(a / b)-1]);
			} else
				System.out.println("unavailable operation");
			running = false;
		} else
			System.out.println("assignment doesnt correspond to conditions");
		running = false;
	}
	
	
	public void close() {
		scanner.close();
	}

}
