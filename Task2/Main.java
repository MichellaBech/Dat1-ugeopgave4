import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please type your name: ");

		//Waiting for user input
		String name = scanner.nextLine();
		System.out.println("Hello " + name + 
			". Nice to meet you! Please Write your age: ");

		int age = scanner.nextInt();

		System.out.println("Your age is: " + age);
		int retirementStarts = 75 - age;

		System.out.println("You may assume retirement starts at " 
			+ retirementStarts + " years.");
	}


}