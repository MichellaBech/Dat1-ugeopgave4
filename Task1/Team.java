import java.util.ArrayList;

public class Team
{
	
	private String teamName;
	private int rang;
	private ArrayList<String> playersNames = new ArrayList<String>();

	public Team(String teamName)
	{
		this.teamName = teamName;
	}

	public int setRank(int rang)
	{
		return this.rang = rang;
	}

	
	public String toString()
	{
		return "Team: " + teamName + " Rang: " + rang;
	}

}