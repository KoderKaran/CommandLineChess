public class Bishop extends Piece {
    public Bishop(PieceEnum bishop, int rank, int file) {
        super(bishop, rank, file);
    }

    @Override
    public String[] getPossibleMoves(ChessBoard cb) {
        return new String[0];
    }


}
