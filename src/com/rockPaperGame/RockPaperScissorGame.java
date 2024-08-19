package com.rockPaperGame;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGame {
	Scanner sc=new Scanner(System.in);
	Random rd=new Random();

	public static void main(String[] args) {
	
		RockPaperScissorGame r=new RockPaperScissorGame();
		r.playGame();
	}
		
		

	public  void playGame()
	{
		System.out.println("Enter rock,paper,scissor, (or type to 'exit') ");
		String userChoice=sc.next();
		
		if(userChoice.equalsIgnoreCase("exit")) {
			System.out.println("EXIT");
			
		}
		if(!userChoice.equalsIgnoreCase("rock")&&!userChoice.equalsIgnoreCase("paper")&&!userChoice.equalsIgnoreCase("scissor"))
		{
			System.out.println("Invalid,Enter in proper format");
			playGame();
		}
		String choice[]= {"rock","paper","scissor"};
		String computerChoice=choice[rd.nextInt(3)];
		System.out.println("Computer Choice = "+computerChoice);
		if(userChoice.equalsIgnoreCase(computerChoice))
		{
			System.out.println("Draw");
		}
		
		else if((userChoice.equals("rock") && computerChoice.equals("scissor"))||
				(userChoice.equals("paper") && computerChoice.equals("rock"))||
				(userChoice.equals("scissor") && computerChoice.equals("paper"))) {
			System.out.println("You Win");
		}
		else {
			System.out.println("You Lose");
		}
		playGame();
		
	}
}

