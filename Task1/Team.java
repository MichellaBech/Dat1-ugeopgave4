import java.util.ArrayList;

public class Team
{
	
	private String teamName;
	private int rank;
	private ArrayList<String> playersNames = new ArrayList<String>();

	public Team(String teamName)
	{
		this.teamName = teamName;
	}

	public void setRank(int rank)
	{
		this.rank = rank;
	}

	
	public String toString()
	{
		return "Team: " + this.teamName + " Rank: " + this.rang;
	}

}