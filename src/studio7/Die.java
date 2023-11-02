package studio7;

public class Die {
private static int numSides;


private static void main(String[] args) {
	
}
private static int roll() {
	int winner =(int)(Math.random()*numSides)+1;
	return winner;
}

}