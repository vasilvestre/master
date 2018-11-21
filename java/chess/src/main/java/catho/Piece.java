package catho;

public abstract class Piece {
    private String color;
    private Integer number;
    private String name;
    private String representation;

    public Piece(String name, String representation, Integer number, String color) {
        this.name = name;
        this.representation = representation;
        this.number = number;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return name+number;
    }

    public String getRepresentation() {
        return representation;
    }

    public boolean move(Coordinate fromCoordinate, Coordinate toCoordinate) {
        if (canMove(fromCoordinate, toCoordinate)) {
            if (toCoordinate.piece != null && toCoordinate.piece.getColor().equals(fromCoordinate.piece.color)) {
                System.out.println("Une piece de votre couleur est déjà sur la case");
                return false;
            }
            fromCoordinate.piece = null;
            toCoordinate.piece = this;
            return true;
        }
        System.out.println("Mouvement impossible");
        return false;
    }

    public abstract boolean canMove(Coordinate fromCoordinate, Coordinate toCoordinate);

    public boolean moveToDifferentPosition(Coordinate fromCoordinate, Coordinate toCoordinate) {
        if (fromCoordinate.equals(toCoordinate)) {
            return false;
        }
        return true;
    }
}
