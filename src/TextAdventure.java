import java.util.Scanner;

import javax.swing.JOptionPane;

public class TextAdventure {
public static void main(String[] args) {
	System.out.println("Welcome to your adventure! \n You are in a room dimly lit room with two pills in front of you on a table \n On the left is a red pill, and on the right is a blue pill \n Red pill will give you the ability to TELEPORT \n Blue pill will give you the ability to FLY \n Taking both pills will kill you instantly \n Will you (take the red pill) or (take the blue pill)?");
	Scanner kb=new Scanner(System.in);
	String ans=kb.nextLine();
	if(ans.equals("take the red pill")) {
		System.out.println("You now have TELEPORT ability \n");
		 System.out.println("In front of the table there are two doors that take you to two different worlds \n The door on the left takes you to NARNIA to train to be a master warrior \n The door on the right takes you to THE UNDERWORLD to train to be an overlord with demonic powers \n Blue pill is still in front of you \n Will you (go through left door), (go through right door), or (take the blue pill)? ");
		 ans=kb.nextLine();
		 if(ans.equals("take the blue pill")) {
			System.out.println("You are dead. GAME OVER.");
		 }
			if(ans.equals("go through left door")) {
				System.out.println("You are now in NARNIA, your journey to becoming a master warrior begins! \n You are in an open wasteland and there are three weapons in front of you \n What is your weapon of choice? \n 1) (axe) || 2) (sword) || 3) (staff) ");
				ans=kb.nextLine();
				if(ans.equals("axe")) {
					System.out.println("You now have an axe in your inventory! \n You see a merchant in the distance, (walk to merchant) to get directions to the battlefield for your first session of training");
					ans=kb.nextLine();
					if (ans.equals("walk to merchant")) {
						System.out.println("MERCHANT: Hello future warrior! What is your name? (say name)");
						ans=kb.nextLine();
						if (ans.equals("say name")) {
						String warname=JOptionPane.showInputDialog("Name?");
						System.out.println("MERCHANT: Well "+warname+" ,welcome to NARNIA! (head to the stadium) to start your first session of training or you can (explore narnia) to get used to the place before your training \n Good luck futrue warrior!");
				}
				}
				}
				if(ans.equals("sword")) {
					System.out.println("You now have a sword in your inventory! \\n You see a merchant in the distance, (walk to merchant) to get directions to the battlefield for your first session of training");
					ans=kb.nextLine();
					if (ans.equals("walk to merchant")) {
						System.out.println("MERCHANT: Hello future warrior! What is your name? (say name)");
						ans=kb.nextLine();
						if (ans.equals("say name")) {
						String warname=JOptionPane.showInputDialog("Name?");
						System.out.println("MERCHANT: Well "+warname+" ,welcome to NARNIA! (head to the stadium) to start your first session of training or you can (explore narnia) to get used to the place before your training \n Good luck futrue warrior!");
				}
				}
				}
				if(ans.equals("staff")) {
					System.out.println("You now have a staff in your inventory! \\n You see a merchant in the distance, (walk to merchant) to get directions to the battlefield for your first session of training");
					ans=kb.nextLine();
					if (ans.equals("walk to merchant")) {
						System.out.println("MERCHANT: Hello future warrior! What is your name? (say name)");
						ans=kb.nextLine();
						if (ans.equals("say name")) {
						String warname=JOptionPane.showInputDialog("Name?");
						System.out.println("MERCHANT: Well "+warname+" ,welcome to NARNIA! (head to the stadium) to start your first session of training or you can (explore narnia) to get used to the place before your training \n Good luck futrue warrior!");
				}
				}
				}
				}
			if(ans.equals("go through right door")) {
				System.out.println("You are now in THE UNDERWORLD, your journey to becoming a master overlord begins! \n You are in an open area with three different colored orbs in front of you; blue, green, and yellow \n Grabbing the blue orb will give you the ability to SHOOT FIRE \n Grabbing the green orb will give you the ability to REGENERATE HEALTH \n Grabbing the yellow orb will give you SUPER SPEED \n Will you (grab the red orb), (grab the green orb), or (grab the yellow orb)?");
				ans=kb.nextLine();
				if (ans.equals("grab the red orb")) {
					System.out.println("You absorbed the red orb and gained the ability to SHOOT FIRE! \n The UNDERWORLD now transported you to their battlefield for your first session of training \n MYSTERIOUS VOICE: Welcome to the UNDERWORLD! What do we call you future overlord? (say name) or (stay silent)");
					ans=kb.nextLine();
					if (ans.equals("say name")) {
						String ovrldname=JOptionPane.showInputDialog("Name?");
						System.out.println(ovrldname+": My name is"+ovrldname+"!");
						System.out.println("MYSTERIOUS VOICE:"+ovrldname+" ,you have been transported here to see if your worthy of becoming a powerful overlord!");
					}
					if (ans.equals("stay silent")) {
						System.out.println("YOU: .... \n MYSTERIOUS VOICE: Staying queit I see, either way were not here to talk, were here to see if your worthy of becoming a powerful overlord!");
					}
				}
				if (ans.equals("grab the green orb")) {
					System.out.println("You absorbed the green orb and gained the ability to REGENERATE HEALTH! \n The UNDERWORLD now transported you to their battlefield for your first session of training");
				}
				if (ans.equals("grab the yellow orb")) {
					System.out.println("You absorbed the yellow orb and you now have SUPER SPEED! \n The UNDERWORLD now transported you to their battlefield for your first session of training");
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
}
