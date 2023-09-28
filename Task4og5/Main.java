import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> actions = new ArrayList<String>();
		actions.add("1) Start game");
		actions.add("2) Resume game");
		actions.add("3) Pause game");
		actions.add("4) End game");

		//System.out.println(actions);

		GameMenu gameMenu = new GameMenu(actions);
		gameMenu.displayMenu();
		getAction();
		String userChoice = scanner.nextLine();
		int choice = Integer.parseInt(userChoice);
		gameMenu.doAction(choice);
	}

	public static void doAction(int action)
	{
		switch (action)
		{
		case 1: 
			System.out.println("Starting the game now");
			break;
		case 2:
			System.out.println("Fetching previously saved game data");
			break;
		case 3:
			System.out.println("Game paused");
			break;
		case 4:
			System.out.println("Ending game");
			break;
		}
	}

}