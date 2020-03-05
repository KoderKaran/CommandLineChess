package Pieces;

public class Position{
	private int rank;
	private int file;

	public Position(){}

	public Position(int nrank, int nfile){
		rank = nrank;
		file = nfile;
	}

	public void setRank(int newRank){
		if(newRank >= 0 && newRank <= 7){
			rank = newRank;
		}
	}

	public void setFile(int newFile){
		if(newFile >= 0 && newFile <=7){
			file = newFile;
		}
	}

	@Override
	public String toString(){
		return Piece.indexToCoords(this);
	}

	public boolean checkEquality(Position other){
		return this.getFile() == other.getFile() && this.getRank() == other.getRank();
	}

	public int getRank(){
		return rank;
	}

	public int getFile(){
		return file;
	}
}