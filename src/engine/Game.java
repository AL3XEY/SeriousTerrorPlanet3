package engine;

public class Game {

	private Player bluePlayer;
	private Player redPlayer;
	private Map map;
	
	public Game(){
		map = new Map();
	}
	
	public void battle(){
		//for
	}
	
	public void movePiece(Player player, int i, int j){
		Piece piece;
		if(player.equals(redPlayer)){
			piece = new RedPiece();
		}else{
			piece = new BluePiece();
		}
		
		try{
			map.movePiece(piece, i, j);
		}catch(NoPieceInCellException e){
			System.err.println(e);
		}
	}
	
}
