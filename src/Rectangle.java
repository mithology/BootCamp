/*
 *  - Create a Rectangle
 *   - Any operation related to length or breadth
 *       - Calculate area
 *       - Calculate perimeter
 */
public class Rectangle {
    private Double breadth;
    private Double length;

    protected Rectangle(Double length, Double breadth) {
        this.breadth = breadth;
        this.length = length;
    }

    public static Rectangle create(Double length, Double breadth) throws InvalidInput {
        if (length <= 0) {
            throw new InvalidInput(length);
        } else if (breadth <= 0) {
            throw new InvalidInput(breadth);
        }
        return new Rectangle(length, breadth);
    }

    public double calculateArea() {
        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}