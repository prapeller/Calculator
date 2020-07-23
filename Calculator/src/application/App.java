//1) single line input 1) a + b, 2) a - b, 3) a * b, 4) a / b, if other operation there should be exception and stop;
//2) Arabic 1,2,3,4,5... or Roman I,II,III,IV,V..., if simultaneously "3 + II" there should be exception and stop;
//3) input int (whole) numbers only: 1 (I) <= a & b <=10 (X), output number: any. If out of range there should be exception and stop;

package application;

public class App {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		calculator.run();
		calculator.close();

	}

}
