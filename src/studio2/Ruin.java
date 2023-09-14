package studio2;

import java.util.Scanner;

public class Ruin {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// TODO Auto-generated method stub
		System.out.println("How much money are you putting in?");
		double startAmount = in.nextDouble();
		System.out.println("Odds of winning (between 0 and 1): ");
		double winChance = in.nextDouble();
		System.out.println("Win Limit: ");
		double winLimit = in.nextDouble();
		
		double totalSimulations = 0;
		double loss = 0;
		while ((startAmount > 0) && (startAmount < winLimit))
		{
			double l = Math.random() * winChance;
			if (l >= 0.5)
			{	
				System.out.println("Simulation " + (totalSimulations+1) + ": " + startAmount + " WIN");
				startAmount++;
			}
			else
			{
				System.out.println("Simulation " + (totalSimulations+1) + ": " + startAmount + " LOSE");
				startAmount--;
				loss++;
			}
			totalSimulations++;
		}
		if (startAmount >= winLimit)
			System.out.println("Congrats! You win " + winLimit + "!");
		else if (startAmount <= 0)
			System.out.println("You have no money anymore.");
		System.out.println("Simulations: " + totalSimulations);
		System.out.println("Losses: " + loss);
		System.out.println("Ruin Rate from Simulation: " + (loss/totalSimulations));
	}

}
