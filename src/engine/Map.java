package engine;

import java.util.List;

public class Map {
	
	private int[][] cells;

	//private Cell[] cells;
	
	public Map(){
		cells = new int[2][12];
		
		// Case de départ
		cells[0][0] = 3;
		cells[1][0] = 3;
		
		// Case 
		for(int i=1; i<12;i++){
			cells[0][i] = 0;
			cells[1][i] = 0;
		}
	}

	public void battle() {
		// TODO Auto-generated method stub
		
	}

	public void movePiece(int player, int caseDepart, int caseArrivee) {
		// TODO Auto-generated method stub
		
	}
	
	/*public Cell[] getCells(){
		return cells;
	}
	
	public Cell getCell(int i){
		return cells[i];
	}
	
	public List<Piece> getPieces(int i){
		return cells[i].getPieces();
	}*/
	
}
