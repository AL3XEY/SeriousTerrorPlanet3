package engine;

import java.util.List;

public class Map {
	
	private int[][] cells;
	
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
		int firstPlayerPieces;
		int secondPlayerPieces;
		int foo;
		for(int i=1; i<11;i++){
			firstPlayerPieces = cells[0][i];
			secondPlayerPieces = cells[1][i];
			if(firstPlayerPieces > 0 && secondPlayerPieces > 0){
				foo = firstPlayerPieces - secondPlayerPieces;
				cells[0][i]-=Math.abs(foo);
				cells[1][i]-=Math.abs(foo);
				cells[0][0]+=Math.abs(foo);
				cells[1][0]+=Math.abs(foo);
			}
		}
		
	}

	public void movePiece(int player, int caseDepart, int caseArrivee){
		// TODO Exceptions, verifications and co.
		cells[player][caseDepart]--;
		cells[player][caseArrivee]++;
	}
	
	public int testMove(int player, int caseDepart, int caseArrivee, int pointsDeplacement){
		//TODO test if player does have a piece on this cell
		
		//TODO test if correct move number
		
		//TODO test if valid move (for the special last cell)
		
		return -1;
	}
	
	// method test finalMove
	
	public String toString(){
		String output = "";
		
		//top
		output += " s |";
		for(int i=1; i<11; i++){
			output += " " + i + " |";
		}
		output += " e |\n";
		
		//x
		
		for(int i=1; i<12; i++){
			int piecesCount = cells[0][i];
			for(int j=0;j<piecesCount;j++){
				output += "X";
			}
			for(int j=0;j<3-piecesCount;j++){
				output += " ";
			}
			output += "|";
		}
		output += "\n";
		
		//separation
		for(int i=0; i<12; i++){
			output += "---|";
		}
		output += "\n";
	
		//o
		
		for(int i=1; i<12; i++){
			int piecesCount = cells[1][i];
			for(int j=0;j<piecesCount;j++){
				output += "O";
			}
			for(int j=0;j<3-piecesCount;j++){
				output += " ";
			}
			output += "|";
		}
		output += "\n";
		
		
		return output;
	}
}
