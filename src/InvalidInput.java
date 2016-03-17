public class InvalidInput extends Throwable {
    public InvalidInput(double side) {
        super("Invalid input, please check the input, Require positive value but found "+ side);
    }
}