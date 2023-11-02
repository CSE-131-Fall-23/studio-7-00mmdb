package studio7;

public class HockeyPlayer {
	private static String name;
	private static int number;
	private static String handedness;
	private static int pointsTotal; 
	private static int assistsTotal;
	private static int scoresTotal;
	private static int gamesPlayedTotal;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	}
	
	private static void playAGame(int goalsScored, int assistsMade){
		pointsTotal+= goalsScored+assistsMade; 
		assistsTotal += assistsMade; 
		scoresTotal+= goalsScored;
	}
}
