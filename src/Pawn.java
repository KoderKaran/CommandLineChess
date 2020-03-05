import java.util.ArrayList;

public class Pawn extends Piece {
    private boolean moved;
    public Pawn(PieceEnum pawn, int rank, int file) {
        super(pawn, rank, file);
        moved = false;
    }

    @Override
    public ArrayList<Position> getPossibleMoves(ChessBoard cb) {
        Piece[][] board = cb.getBoard();
        ArrayList<Position> possibleMoves = new ArrayList<>();
        Position currPos = this.getPos();
        int rankTemp = currPos.getRank();
        int fileTemp = currPos.getFile();
        int[][] possiblePos;
        if(moved){
            possiblePos = new int[][]{{-1, 0}};
        }else{
            possiblePos = new int[][]{{-1, 0}, {-2, 0}};
        }
        int[][] possibleCaps = {{-1,-1}, {-1, 1}};
        for(int[] pos : possiblePos){
            int rankMod = pos[0];
            int fileMod = pos[1];
            int newRank = rankTemp + rankMod;
            int newFile = fileTemp + fileMod;
            boolean withinBounds = (newFile>0) && (newRank>0) && (newRank < board.length) && (newFile < board[0].length);
            if (withinBounds && board[newRank][newFile] == null) {
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
        for(int[] cap : possibleCaps){
            int capRank = rankTemp + cap[0];
            int capFile = fileTemp + cap[1];
            boolean withinBounds = (capFile>0) && (capRank>0) && (capRank < board.length) && (capFile < board[0].length);
            Piece piece = board[capRank][capFile];
            if(withinBounds && piece != null && !piece.getPe().getColor().equals(this.getPe().getColor())){
                possibleMoves.add(new Position(capRank, capFile));
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
