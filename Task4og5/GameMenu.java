import java.util.ArrayList;
import java.util.Scanner; 

public class GameMenu
{
	private ArrayList<String> actions = new ArrayList<String>();


	public GameMenu(ArrayList<String> actions )
	{
		this.actions = actions;
	}

	public void displayMenu()
	{
		System.out.println(actions);
	}

	public String getAction()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a number to choose an action " + actions);
		String choice = scanner.nextLine();
		
		return choice;  
	}
}