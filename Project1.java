/*
 * Class: CMSC203 
 * Instructor: Dr Ahmed Tarik
 * Description:Program that tests the users ES. Program asks the user to enter the color that the computer has selected. After the user has entered his or her guess, the program displays the name of the randomly selected color. The program repeats these 11 times and then display the number of times the user correctly guessed the selected color.
 * Due: 02/06/2024
* Platform/compiler:Eclipse
* I pledge that I have completed the programming assignment
* independently. I have not copied the code from a student or any source. I have not given my code to any student.
* Print your Name here: Zahra Sarfraz
*/

import java.util.Scanner;
public class Project1{
	final static String Color_one="Red";
	final static String Color_two="Orange";
	final static String Color_three="Blue";
	final static String Color_four="Yellow";
	final static String Color_five="Green";
	final static String prog_Name="Zahra Sarfraz";
	
	public static void main(String[] args) {
		System.out.println("Welcome to the ESP game. Here we will test your skills. The computer will think of a color and you have to guess it, the game goes on for 11 times");
		
		int max_attempts=12;
		int correct_guesses=0;
		String answer=null;
		
		double randomizedNumber;//for use math random because only with double
		
		int randomNumber;//for switch
		
		String randomColor="";//display the color
		
		System.out.println("Please enter your name to begin the game");
		Scanner scan = new Scanner(System.in);//resource leak?? fixed 
		String name=scan.nextLine();
		
		System.out.println("Please print out your MC number:");
		String mcNumber=scan.nextLine();
		
		System.out.println("Please write a few words about yourself, give a brief description");
		String description=scan.nextLine();
		
		System.out.println("Please enter the due date (MM/DD/YY):");
		String due_date=scan.next();
		
		System.out.println("Now lets start\nIts time to test your skills, you have the colors\\n1.Orange\\n2.Red\\n3.Green\\n4.Blue\\n5.Yellow. \\nMay the odds be ever in your favor");
		
		do {
			for(int attempt=1;max_attempts>attempt;attempt++) {
		
			System.out.println("This is your attempt number: "+attempt);
			
			System.out.println("I am thinking of a color, from the colors provided to you guess the color");
			String guess=scan.next();
			
			randomizedNumber=Math.random()*5;//to get the random color through the number
			randomNumber=(int)randomizedNumber;
			
			switch(randomNumber) {
			case 0:
				randomColor=Color_one;
				break;
			case 1:
				randomColor=Color_two;
				break;
			case 2:
				randomColor=Color_three;
				break;
			case 3:
				randomColor=Color_four;
				break;
			case 4:
				randomColor=Color_five;
				break;
			}//switch
			
			
			if(guess.equalsIgnoreCase(randomColor)) {
				System.out.println("Congrats you figured out the color. It was "+randomColor);
				
				correct_guesses++;
			}
			else {
				System.out.println("Thats not quite what I an thinking why dont you try again");
				String guess_2=scan.next();
				if (guess_2.equalsIgnoreCase(randomColor)) {
					System.out.println("Congrats you figured out the color");
					correct_guesses++;
				}else {
					System.out.println("Guess again");
					String guess_3=scan.next();
					if (guess_3.equalsIgnoreCase(randomColor)) {
						System.out.println("Congrats you figured out the color");
						correct_guesses++;
					}else {
						System.out.println("I was thinking of the color "+randomColor+". Better luck next time");
				}
			}//else within else
			}//og else
			}//for loop
			
			System.out.println("GAME OVER!! \nThankyou for playing, come back again soon");

		}//do
		while(answer=="yes");
		
		scan.close();//to close scanner and to resolve the resource leak
		
		System.out.println("Correct guesses: "+correct_guesses+"/11");
		System.out.println("Student name: "+name);
		System.out.println("MC number: "+mcNumber);
		System.out.println("Description: "+description);
		System.out.println("Due date: "+due_date);
		System.out.println("Programmer name: "+prog_Name);
		
		System.exit(0);
	
	}//main
	
}