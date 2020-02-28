public class Pawn extends Piece {
    public Pawn(PieceEnum pawn, int rank, int file) {
        super(pawn, rank, file);
    }

    @Override
    public String[] getPossibleMoves(ChessBoard cb) {
        return new String[0];
    }


}
