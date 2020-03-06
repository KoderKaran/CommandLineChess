package Pieces;
import Game.ChessBoard;
import java.util.ArrayList;

public class Queen extends Piece {
    public Queen(PieceEnum queen, int rank, int file) {
        super(queen, rank, file);
        this.setPossibleDir(new int[][]{{1,0}, {-1,0}, {0,1}, {0,-1}, {1,1}, {1,-1}, {-1,1}, {-1,-1}});
    }

    @Override
    public boolean isValidMove(ChessBoard chessBoard, String targetSquare) {
        return false;
    }

    @Override
    public ArrayList<Position> getPossibleMoves(ChessBoard cb) {
        Piece[][] board = cb.getBoard();
        ArrayList<Position> possibleMoves = new ArrayList<>();
        Position currPos = this.getPos();
        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}, {1,1}, {1,-1}, {-1,1}, {-1,-1}};
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
        }
        System.out.print("Possible moves: [ ");
        for(Position p : possibleMoves){
            System.out.print(p + ", ");
        }
        System.out.print("]\n");
        return possibleMoves;
    }


}
