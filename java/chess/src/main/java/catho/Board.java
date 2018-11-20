package catho;

import java.util.*;

public class Board {
    private LinkedHashMap<String, Square> board; // should have been coordonate then map of square and piece
    private String[] letters = new String[]{"A", "B", "C", "D", "E", "F", "G", "H"};
    private Integer[] numbers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8};

    public Board() {
        this.board = createBoard();
    }

    private LinkedHashMap<String, Square> createBoard() {
        LinkedHashMap<String, Square> tmpBoard = new LinkedHashMap<>();
        for (String letter : letters) {
            for (int number : numbers) {
                String key = letter + number;
                tmpBoard.put(key, new Square(key));
            }
        }
        return tmpBoard;
    }

    void print() {
        Integer[] reservedNumbers = numbers.clone();
        Collections.reverse(Arrays.asList(reservedNumbers));

        System.out.println("|---------------------------------");
        for (int number : reservedNumbers) {
            StringBuilder output = new StringBuilder().append(number).append("|");
            for (String letter : letters) {
                String key = letter + number;
                output.append(board.get(key).toString()).append("|");
            }
            System.out.println(output);
            System.out.println(" ---------------------------------");
        }
        System.out.println("   A   B   C   D   E   F   G   H  ");
    }

    public ArrayList<Piece> getPieces() {
        ArrayList<Piece> pieces = new ArrayList<>();
        for (Square square : board.values()) {
            if (square.piece != null) {
                pieces.add(square.piece);
            }
        }
        return pieces;
    }

    public boolean move(String pieceName, String to) {
        Square actualSquare = null;
        Square newSquare = board.get(to);
        for (Square square : board.values()) {
            if (square.piece != null && square.piece.toString().equals(pieceName)) {
                actualSquare = square;
            }
        }
        if (actualSquare == null) {
            return false;
        }
        Piece piece = actualSquare.piece;

        return true;
    }
}
