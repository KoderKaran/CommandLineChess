package Pieces;
import Game.ChessBoard;
import java.util.ArrayList;

public class Knight extends Piece {
    public Knight(PieceEnum knight, int rank, int file) {
        super(knight, rank, file);
        this.setPossibleDir(new int[][]{{2,-1}, {2,1}, {1,-2}, {1,2}, {-1,-2}, {-1,2}, {-2,1}, {-2,-1}});
    }

    @Override
    public ArrayList<Position> getPossibleMoves(ChessBoard cb) {
        Piece[][] board = cb.getBoard();
        ArrayList<Position> possibleMoves = new ArrayList<>();
        Position currPos = this.getPos();
        int rankTemp = currPos.getRank();
        int fileTemp = currPos.getFile();
        int[][] possiblePos = {{2, -1}, {2, 1}, {1, -2}, {1, 2}, {-1, -2}, {-1, 2}, {-2, 1}, {-2, -1}};
        for(int[] pos : possiblePos){
            int rankMod = pos[0];
            int fileMod = pos[1];
            int newRank = rankTemp + rankMod;
            int newFile = fileTemp + fileMod;
            boolean withinBounds = (newFile>0) && (newRank>0) && (newRank < board.length) && (newFile < board[0].length);
            if (withinBounds && board[rankTemp + rankMod][fileTemp + fileMod] == null) {
                possibleMoves.add(new Position(newRank, newFile));
            }else{
                if(withinBounds){
                    Piece p = board[newRank][newFile];
                    if (!p.getPe().getColor().equals(this.getPe().getColor())) {
                        possibleMoves.add(new Position(newRank, newFile));
                    }
                }
            }
        }
        return possibleMoves;
    }


}
