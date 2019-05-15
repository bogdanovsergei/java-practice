package day08_casting_conditional;

public class IfElseWithVariables {
	public static void main(String[] args) {
		int temperature = 45;
		
		if (temperature >= 65) {
			System.out.println("It is a nice day! Let's code java.");
		} else {
			System.out.println("Stay home and code Java.");
		}
		
		// 2 int variables, teamAScore, teamBScore
		//put a condition. check if teamA won. 
			//"Team A won".
			//Go to Team A!
		//Else "team B won or it was a draw
			//Go Team!
		
		int teamAScore=10;
		int teamBScore=12;
		if (teamAScore > teamBScore) {
			System.out.println("Team A won\n" + 
					           "Go to Team A!");
		} else {
			System.out.println("Team B won or it was a draw\n" + 
					            "Go Team!");
		}
	}

}
