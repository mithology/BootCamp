import org.hamcrest.CoreMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SquareTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void create_should_give_a_Invalid_input_exception_when_it_get_side_is_zero() throws InvalidInput {
        double side = 0;
        thrown.expect(InvalidInput.class);
        thrown.expectMessage(CoreMatchers.startsWith("Invalid input, please check the input, Require positive value but found "));
        Square.create(side);
    }

    @Test
    public void create_should_give_a_Invalid_input_exception_when_it_get_negative_side() throws InvalidInput {
        double side = -10;
        thrown.expect(InvalidInput.class);
        thrown.expectMessage(CoreMatchers.startsWith("Invalid input, please check the input, Require positive value but found "));
        Square.create(side);
    }

}