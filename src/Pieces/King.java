package Pieces;
import Game.ChessBoard;
import java.util.ArrayList;

public class King extends Piece {

    private boolean checked;
    private boolean moved;

    public King(PieceEnum king, int rank, int file){
        super(king, rank, file);
        this.setPossibleDir(new int[][]{{0,1}, {0,-1}, {1,0}, {-1,0}, {1,1}, {-1,1}, {1,-1}, {-1,-1}});
    }

    @Override
    public boolean isValidMove(ChessBoard chessBoard, String targetSquare) {
        return false;
    }

    @Override
    public ArrayList<Position> getPossibleMoves(ChessBoard cb) {
        Piece[][] board = cb.getBoard();
        int[] rankOffsets = {0, 0, 1, -1, 1, -1, 1, -1};
        int[] fileOffsets = {1, -1, 0, 0, 1, 1, -1, -1};
        ArrayList<Position> possibleMoves = new ArrayList<>();
        Position currPos = this.getPos();
        for(int i=0; i < rankOffsets.length; i++){
            int cRank = currPos.getRank();
            int cFile = currPos.getFile();
            int rankOff = rankOffsets[i];
            int fileOff = fileOffsets[i];
            Piece piece = board[cRank+rankOff][cFile+fileOff];
            if(piece == null || !piece.getPe().getColor().equals(this.getPe().getColor())){
                possibleMoves.add(new Position(cRank+rankOff, cFile+fileOff));
            }
        }
        return possibleMoves;
    }


}
