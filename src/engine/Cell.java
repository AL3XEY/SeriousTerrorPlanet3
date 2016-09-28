package engine;

import java.util.ArrayList;
import java.util.List;

public class Cell {
	
	private List<Piece> pieces;
	
	public Cell(){
		pieces = new ArrayList<Piece>();
	}
	
	public List<Piece> getPieces(){
		return pieces;
	}
	
	public void add(Piece piece){
		pieces.add(piece);
	}

}
