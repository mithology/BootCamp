/*
 *   - Any operation related to side
 */
public class Square extends Rectangle {
    private Square(Double side) {
        super(side,side);
    }

    public static Square create(Double side) throws InvalidInput {
        if (side <= 0)
            throw new InvalidInput(side);
        return new Square(side);
    }

}