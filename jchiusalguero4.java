//Jose Chiu Salguero
//CSC 321
//Lab 4

import java.util.Scanner;

public class jchiusalguero4
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		boolean choice = false;
		while(choice==false)
		{
			System.out.println("1. Funny joke");
			System.out.println("2. Fun fact");
			System.out.println("3. Motivational quote");
			System.out.println("4. Funnier joke");
			System.out.print("Pick a number 1-4: ");

			int numChoice = input.nextInt();
		
			if(numChoice==1)
			{
				System.out.println("Why did the frog take the bus to work? His car got toad.");
				choice = true;
			}
			else if(numChoice==2)
			{
				System.out.println("Lemons float in water, but limes sink.");
				choice = true;
			}
			else if(numChoice==3)
			{
				System.out.println("'Yesterday is history, tomorrow is a mystery, but today is a gift. That is why it is called the present.' -Master Oogway");
				choice = true;
			}
			else if(numChoice==4)
			{
				System.out.println("What do you call a can opener that doesn't work? A can't opener!");
				choice = true;
			}
			else
			{
				System.out.println("Only put a number from 1-4!");
				choice = false;
			}
		}
	}
}

