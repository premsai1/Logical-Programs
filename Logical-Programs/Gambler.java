package logical;

import java.util.Scanner;

/**
 * @author Premsai Manthani
 * @purpose :tjis program will perform the gambler wins are loose using random
 *          function.
 * 
 */
public class Gambler {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Gambler o1 = new Gambler();

		System.out.println("enter the stake");
		int stake = sc.nextInt();
		System.out.println("enter the goal");
		int goal = sc.nextInt();
		System.out.println("enter the trails");
		int trials = sc.nextInt();
		o1.gamble(stake, goal, trials);
	}

	public void gamble(int stake, int goal, int trials) {
		int bets = 0;
		int wins = 0;

		for (int t = 0; t < trials; t++) {

			int cash = stake;
			while (cash > 0 && cash < goal) {
				bets++;
				if (Math.random() < 0.5)
					cash++;
				else
					cash--;
			}
			if (cash == goal)
				wins++;
		}
		System.out.println(wins + " wins of " + trials);
		System.out.println("Percent of games won = " + 100.0 * wins / trials);
		System.out.println("Avg # bets           = " + 100.0 * (bets / trials));
	}

}
