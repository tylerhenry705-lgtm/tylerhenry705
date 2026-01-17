public class CalculatorDriver {

	public static void main(String[] args) {
		try {
			double pi = Calculator.calculatePi();
			Calculator.rollDice();	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
