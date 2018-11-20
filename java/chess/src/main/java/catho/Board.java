package catho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Board {
    private ArrayList<Coordinate> coordinates;
    private String[] letters = new String[]{"A", "B", "C", "D", "E", "F", "G", "H"};
    private Integer[] numbers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8};

    public Board() {
        this.coordinates = createBoard();
    }

    private ArrayList<Coordinate> createBoard() {
        ArrayList<Coordinate> tmpBoard = new ArrayList<>();
        for (String letter : letters) {
            for (int number : numbers) {
                Coordinate newCoordinate = new Coordinate(letter,number);
                tmpBoard.add(newCoordinate);
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
                output.append(
                        coordinates.stream().filter(
                                x -> x.toString().equals(key)
                        ).findFirst().get().getRepresentation()
                ).append("|");
            }
            System.out.println(output);
            System.out.println(" ---------------------------------");
        }
        System.out.println("   A   B   C   D   E   F   G   H  ");
    }

    public ArrayList<Piece> getPieces() {
        ArrayList<Piece> pieces = new ArrayList<>();
        for (Coordinate coordinate : coordinates) {
            if (coordinate.piece != null) {
                pieces.add(coordinate.piece);
            }
        }
        return pieces;
    }

    public void move(String pieceName, String to) {
        Coordinate fromCoordinate = coordinates.stream().filter(coordinate -> coordinate.piece.toString().equals(pieceName)).findFirst().get();
        Piece piece = fromCoordinate.piece;
        Coordinate toCoordinate = coordinates.stream().filter(coordinate -> coordinate.toString().equals(to)).findFirst().get();
        piece.move(fromCoordinate, toCoordinate);
    }
}
