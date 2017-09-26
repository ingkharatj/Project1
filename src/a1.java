import java.util.Random;
import java.util.Scanner;

public class a1 {
	static Random rand = new Random();

	static int newRandom() {
		return rand.nextInt(6) + 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		int countn = 0;
		while (true) {
			System.out.printf("Toss %d ressult : %d\n", count, newRandom());
			count = count + 1;
			countn = countn + newRandom();

			System.out.print("(t)oss or (q)uit :");
			String x = sc.next();
			if (x.equals("t")) {
				countn = countn + newRandom();

			}
			if (x.equals("q")) {
				countn = countn;
				System.out.printf("Sum of result is %d\n", countn);
				System.out.println("Bye");
				break;
			}
		}

	}

}
