package engine;
import java.util.Random;

public class Game {

	private static Map map;
	private int idJoueurActuel;
	
	public Game() {
		Random rng = new Random();
		this.idJoueurActuel = rng.nextInt(1);
		this.map = new Map();
	}
	
	public void battle(){
		this.map.battle();
	}
	
	/*public void movePiece(int player, int caseDepart, int caseArrivee){		
		try {
			map.movePiece(player, caseDepart, caseArrivee);
		} catch(NoPieceInCellException e) {
			System.err.println(e);
		}
	}*/
	
	public void turn() {
		// Récupère les inputs du joueur
		
		// Test si la syntaxe est valide
		
		// Test si les actions sont valides (points de mouvement)
		
		// Effectue les mouvements
		
	}
	
	public static void main(String[] args) {
		Game game = new Game();		
	}
	
}
