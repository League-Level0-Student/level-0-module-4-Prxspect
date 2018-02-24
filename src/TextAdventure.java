import java.util.Scanner;

import javax.swing.JOptionPane;

public class TextAdventure {
public static void main(String[] args) {
	System.out.println("Welcome to your adventure! \n You are in a room dimly lit room with two pills in front of you on a table \n On the left is a red pill, and on the right is a blue pill \n Red pill will give you the ability to TELEPORT \n Blue pill will give you the ability to FLY \n Taking both pills will kill you instantly \n Will you (take the red pill) or (take the blue pill)?");
	Scanner kb=new Scanner(System.in);
	String ans=kb.nextLine();
	if(ans.equals("take the red pill")) {
		System.out.println("You now have TELEPORT ability \n");
		 System.out.println("In front of the table there are two doors that take you to two different worlds \n The door on the left takes you to NARNIA to train to be a master warlock \n The door on the right takes you to THE UNDERWORLD to train to be an overlord with demonic powers \n Blue pill is still in front of you \n Will you (go through left door), (go through right door), or (take the blue pill)? ");
		 ans=kb.nextLine();
		 if(ans.equals("take the blue pill")) {
			System.out.println("You are dead. GAME OVER.");
		 }
			if(ans.equals("go through right door")) {
				System.out.println("You are now in NARNIA");
			}
			if(ans.equals("go through left door")) {
				System.out.println("You are now in THE UNDERWORLD");
		}
			}
	if(ans.equals("take the blue pill")) {
		System.out.println("You now have FLY ability \n");
		System.out.println("In front of the table there are two doors that take you to two different worlds \n The door on the left takes you to NARNIA to train to be a master warlock \n The door on the right takes you to THE UNDERWORLD to train to be an overlord with demonic powers \n Red pill is still in front of you \n Will you (go through left door), (go through right door), or (take the red pill)? ");
		 ans=kb.nextLine();
		 if(ans.equals("take the red pill")) {
			System.out.println("You are dead. GAME OVER.");
		 }
			if(ans.equals("go through right door")) {
				System.out.println("You are now in NARNIA");
			}
			if(ans.equals("go through left door")) {
				System.out.println("You are now in THE UNDERWORLD");
		}
	}

}
}
