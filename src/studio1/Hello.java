package studio1;

import java.util.Scanner;

public class Hello {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String mood = in.nextLine();
		
		System.out.println("Hi " + mood + ". How are you?");
	}

}
