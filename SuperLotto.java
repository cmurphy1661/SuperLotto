import java.util.Scanner;
import java.util.Random;

public class SuperLotto {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		//Creates a Scanner object
		String firstName;
		String checkBoolean;
		int numTickets;
		do {
			System.out.println("Welcome to the Quicky Mart, what is your  name?");
			firstName = scnr.next();
			System.out.println("Hello " + firstName + ", how many Super Lotto tickets would you like to purchase?");
			System.out.println("How many lotto tickets do you want?");
			numTickets = scnr.nextInt();
			System.out.println("Super Lotto Tickets:");
			for(int i = 0; i< numTickets; i++) {
				printTicket(quickPick1());
			}
			System.out.println("Good luck! Would you like to run the program again?");
			checkBoolean = scnr.next();
		}while(checkBoolean.equals("Yes") || checkBoolean.equals("yes") || checkBoolean.equals("y") || checkBoolean.equals("Y")); 
		//Continue to run if user asks to run program again
		System.out.println("Goodbye");
	}
	
	public static int[] quickPick1() {
		Random rand = new Random();
		int[] array = new int[6];
		//Create array with 6 elements
		int x;
		for(int i = 0; i< 5; i++) {
		//first 5 numbers are andom numbers between 1 and 47
			x = rand.nextInt(47) + 1;
			if(inArray(x,array)){
			//check if element is in array, get new element otherwise
				array[i] = x;
			}
		}
		array[5] = rand.nextInt(27) + 1;
		//6th digit is between 1-27
		return array;
	}
	public static boolean inArray(int x, int[] array) {
	//Check if element is in array using for loop
		for(int i = 0; i< array.length; i++) {
			if(x == array[i]) {
				return false;
		}
		}
		return true;
	}
	public static void printTicket(int[] array) {
	//iterates through the array, and displays the lotto numbers
		for(int i = 0; i< array.length -1; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("(Mega: " + array[5] + ")");
	}
	

	}
