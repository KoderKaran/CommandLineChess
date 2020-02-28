public class Queen extends Piece {
    public Queen(PieceEnum queen, int rank, int file) {
        super(queen, rank, file);
    }

    @Override
    public String[] getPossibleMoves(ChessBoard cb) {
        return new String[0];
    }


}
