import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Calculator {

	public static double calculatePi() {
		double pi = 0;
		for (int i = 1; i <= 30000; i++) {
			pi += Math.pow(-1, i + 1) / (2 * i - 1); // Calculate series in parenthesis
			sleep(1);
			if (i % 1000 == 0) {
				System.out.println(" pi = " + pi * 4 + " after " + i + " tries."); // Print result
			}
		}
		return pi * 4;
	}
	
	public static void rollDice() {
		Map<Integer, Integer> rolls = new HashMap<Integer, Integer>(); 
		for (int i = 1; i <= 6; i++) {
			rolls.put(i, 0);
		}
		int sumRolls = 0;
		
		for (int i = 1; i <= 30000; i++) {
			int dice = (int)(Math.random()*6) + 1;
			//System.out.println("\nYour dice is " + dice);
			rolls.computeIfPresent(dice, (k, v) -> v + 1);
			// rolls.entrySet().forEach( e -> System.out.print(e.getKey() + " : " + e.getValue() + "; ") );
			if (i % 1000 == 0 || i == 2 || i == 5 || i == 10 || i == 100 ) {

				sumRolls = rolls.entrySet()
						.stream()
						.map( e -> e.getValue() * e.getKey())
						.mapToInt(x -> x)
						.sum();
				//System.out.println(sumRolls + " " + i);
				double avgRolls = sumRolls / (double) i;
				System.out.printf("\nRolls %d.\nThe average individual roll should be 3.5 -- your average is %3.2f\n", 
									i, avgRolls);

				int maxRoll = rolls.values()
						.stream()
						.mapToInt (x -> x)
						.max()
						.getAsInt();

				int minRoll = rolls.values()
						.stream()
						.mapToInt (x -> x)
						.min()
						.getAsInt();

				double maxPercent = maxRoll / (double) i;
				double minPercent = minRoll / (double) i;
				System.out.println("Difference between lowest frequency and highest frequency = " +
						(maxPercent - minPercent));
			}
			sleep(1);
		}
	}
	
	public static void diceStream() {
		Random random = new Random(System.currentTimeMillis());
		IntStream dieRolls = random.ints(100, 1, 7);  // exclusive upper bound
		AtomicInteger counter = new AtomicInteger(1);
		dieRolls.forEach(x -> System.out.println("Roll " + counter.getAndIncrement() + ": " + x));
	}
	
	public static void sleep(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
