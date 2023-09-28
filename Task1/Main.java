public class Main
{
	
	public static void main(String[] args)
	{
		Team team1 = new Team("The vikings");
		team1.setRank(6);

		Team team2 = new Team("The Lions");
		team2.setRank(1);

		Team team3 = new Team("The Dogs");
		team3.setRank(3);

		Team team4 = new Team("The Dragons");
		team4.setRank(2);

		Team team5 = new Team("The Birds");
		team5.setRank(4);

		Team team6 = new Team("The Cats");

		System.out.println(team1);
		System.out.println(team2);
		System.out.println(team3);
		System.out.println(team4);
		System.out.println(team5);
		System.out.println(team6);
	}
}