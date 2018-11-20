package catho;

public abstract class Piece {
    private Integer number;
    private String name;
    private String representation;

    public Piece(String name, String representation, Integer number) {
        this.name = name;
        this.representation = representation;
        this.number = number;
    }

    @Override
    public String toString() {
        return name+number;
    }

    public String getRepresentation() {
        return representation;
    }
}
