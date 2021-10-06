// Chapter 8 Exercise
// Susan 9/2021

import java.util.*;

public class BowlingTeamDemo2
{
	public static void main(String[] args)
	{
		// variables and constants
		String name;
		final int NUM_TEAMS = 4;
		BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
		int x;
		int y;
		final int NUM_TEAM_MEMBERS = 4;
		Scanner input = new Scanner(System.in);

		// input phase
		// this loop creates each individual team for the teams array
		for(y = 0; y < NUM_TEAMS; ++y)
		{
			teams[y] = new BowlingTeam();
			System.out.print("Enter team name >> ");
			name = input.nextLine();
			teams[y].setTeamName(name);
			// this loop will fill all four members of the members array
			for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
			{
				System.out.print("Enter team member's name >> ");
				name = input.nextLine();
				teams[y].setMember(x, name);
				System.out.println("Adding team member...");
			}
			System.out.println("Team added!");
			System.out.println();
		}

		// output phase
		for(y = 0; y < NUM_TEAMS; ++y)
		{
			System.out.println("\nMembers of team " + teams[y].getTeamName());
			for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
			{
				System.out.print(teams[y].getMember(x) + " ");
			}
			System.out.println();
		}

		// prompt the user to look up a team name to see the roster of members
		System.out.print("\n\nEnter a team name to see its roster >>");
		name = input.nextLine();

		// now loop through the array of teams to see if the input matches any team name
		for(y = 0; y < teams.length; ++y)
		{
			if(name.equals(teams[y].getTeamName()))
			{
				// now that a team name is found, loop through the members to output the roster
				for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
				{
					System.out.print(teams[y].getMember(x) + " ");
				}
			} // end of if statement
		}
		System.out.println();
	} //  end of main()
}