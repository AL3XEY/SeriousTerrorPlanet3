package engine;
import java.util.Random;
import java.util.Scanner;

public class Game {

	private static Map map;
	private int idJoueurActuel;
	
	public Game() {
		Random rng = new Random();
		this.idJoueurActuel = rng.nextInt(1);
		this.map = new Map();
	}
	
	/*public void battle(){
		this.map.battle();
	}*/
	
	/*public void movePiece(int player, int caseDepart, int caseArrivee){		
		try {
			map.movePiece(player, caseDepart, caseArrivee);
		} catch(NoPieceInCellException e) {
			System.err.println(e);
		}
	}*/
	
	public void turn() {
		System.out.println("C'est au tour du joueur " + idJoueurActuel + " !");
		System.out.println("Veuillez entrer vos déplacements : ");
		// Récupère les inputs du joueur
		String input;
	    Scanner scanIn = new Scanner(System.in);
	    do{
	    	input = scanIn.nextLine();
	    }while(false); // Test si la syntaxe est valide
	    scanIn.close();
		// Test si les actions sont valides (points de mouvement)
		//TODO
		// Effectue les mouvements
		//TODO
		// Change de joueur
		togglePlayer();
	}
	
	private void togglePlayer(){
		idJoueurActuel++;
		idJoueurActuel%=2;
	}
	
	public static void main(String[] args) {
		Game game = new Game();		
	}
	
}
