package engine;

import java.util.List;

public class Map {

	private Cell[] cells;
	
	public Map(){
		cells = new Cell[12];
		//init
		for(int i=0; i<3;i++){
			cells[0].add(new BluePiece());
			cells[0].add(new RedPiece());
		}
	}
	
	public Cell[] getCells(){
		return cells;
	}
	
	public Cell getCell(int i){
		return cells[i];
	}
	
	public List<Piece> getPieces(int i){
		return cells[i].getPieces();
	}
	
}
