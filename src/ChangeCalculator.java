//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String answer=JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
int nickels=Integer.parseInt(answer);
		// Ask the user how many dimes they have, and convert their answer
String answer2=JOptionPane.showInputDialog("How many dimes do you have?");
int dimes=Integer.parseInt(answer2);
		// Ask the user how many quarters they have, and convert their answer
String answer3=JOptionPane.showInputDialog("How mamy quarters do you have");
int quarters=Integer.parseInt(answer3);
		// Calculate how much money the user has and save it in a double variable 
double money=0;
money += nickels*.05;
money += dimes*.10;
money += quarters*.25;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "You have $"+money);
	}
}

