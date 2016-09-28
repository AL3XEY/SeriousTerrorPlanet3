package engine;

import java.util.List;

public class Map {

	private Cell[] cells;
	
	public Map(){
		cells = new Cell[12];
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
