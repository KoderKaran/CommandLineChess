import java.util.ArrayList;

public class Bishop extends Piece {
    public Bishop(PieceEnum bishop, int rank, int file) {
        super(bishop, rank, file);
    }

    @Override
    public ArrayList<Position> getPossibleMoves(ChessBoard cb) {
        System.out.println("hi");
        Piece[][] board = cb.getBoard();
        ArrayList<Position> possibleMoves = new ArrayList<>();
        Position currPos = this.getPos();
        int[][] directions = {{1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
        for(int[] dir : directions) {
            int rankMod = dir[0];
            int fileMod = dir[1];
            boolean done = false;
            int rankTemp = currPos.getRank();
            int fileTemp = currPos.getFile();
            while (!done) {
                int newRank = rankTemp + rankMod;
                int newFile = fileTemp + fileMod;
                boolean withinBounds = (newFile>0) && (newRank>0) && (newRank < board.length) && (newFile < board[0].length);
                if (withinBounds && board[rankTemp + rankMod][fileTemp + fileMod] == null) {
                    possibleMoves.add(new Position(newRank, newFile));
                    rankTemp = newRank;
                    fileTemp = newFile;
                }else{
                    if(withinBounds){
                        Piece p = board[newRank][newFile];
                        if (!p.getPe().getColor().equals(this.getPe().getColor())) {
                            possibleMoves.add(new Position(newRank, newFile));
                        }
                    }
                    done = true;
                }
            }
            System.out.println(dir[0]);
        }
        return possibleMoves;
    }

}



