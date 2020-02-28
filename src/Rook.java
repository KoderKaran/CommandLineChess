public class Rook extends Piece {
    public Rook(PieceEnum rook, int rank, int file) {
        super(rook, rank, file);
    }

    @Override
    public String[] getPossibleMoves(ChessBoard cb) {
        return new String[0];
    }

}
