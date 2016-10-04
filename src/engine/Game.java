package engine;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.sun.xml.internal.ws.util.StringUtils;

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
		System.out.println(map.toString());
		System.out.println("C'est au tour du joueur " + idJoueurActuel + " !");
		System.out.println("Veuillez entrer vos déplacements : ");
		// Récupère les inputs du joueur
		String input;
	    Scanner scanIn = new Scanner(System.in);
	    do{
	    	input = scanIn.nextLine(); //FIXME throws NoSuchElementException
	    }while(syntaxIsValid(input));//TODO Test si la syntaxe est valide
	    scanIn.close();
	    Actions actions = new Actions(input);
		// Test si les actions sont valides (points de mouvement)
		//TODO
		// Effectue les mouvements
		//TODO
	    int[][] movments = actions.getMovments();
	    int start, end;
	    for(int i = 0; i<actions.getCount();i++){
	    	start = movments[i][0];
	    	end = movments[i][1];
	    	map.movePiece(idJoueurActuel, start, end);
	    }
	    if(actions.isBattle()){
	    	map.battle();
	    }
		// Change de joueur
		togglePlayer();
	}
	
	private boolean syntaxIsValid(String input){
		return false; //TODO
	}
	
	private List<String> decode(String inlineActions){ //TODO
		List<String> actions = new ArrayList<String>();
		//TODO delete whitespaces
		//TODO decode
		//TODO exclamation mark for battle
		return actions;
	}
	
	private void togglePlayer(){
		idJoueurActuel++;
		idJoueurActuel%=2;
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		while(true){
			game.turn();
		}
	}
	
	private class Actions{
		
		private int[][] movments;
		private int count;
		private boolean battle;
		
		protected Actions(String inlineMovments){
			//caseDepart->caseArrivee (caseDepart->caseArrivee...) (!)
			
			inlineMovments.replaceAll("\\s"," ");
			int count = inlineMovments.split("\\ ", -1).length - 1;
			this.count = count;
			movments = new int[count][2];
			battle = inlineMovments.split("\\!", -1).length == 2;
			String s = inlineMovments.split(" !")[0];
			String[] tokens = s.split(" ");
			String[] cells;
			int i=0;
			for (String t : tokens){
				cells = t.split("->");
				movments[i][0] = Integer.valueOf(cells[0]);
				movments[i][1] = Integer.valueOf(cells[1]);
				i++;
			}
		}
		
		public int getCount(){
			return count;
		}
		
		public int[][] getMovments(){
			return movments;
		}
		
		public boolean isBattle(){
			return battle;
		}
		
	}
	
}
