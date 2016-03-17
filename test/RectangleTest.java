import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    Rectangle rectangle2_4;

    @Before
    public void setUp() throws InvalidInput {
        double length = 2;
        double breadth = 4;
        rectangle2_4 = Rectangle.create(length, breadth);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void calculateArea_should_return_the_area_of_a_rectangle() throws InvalidInput {
        assertEquals(8, rectangle2_4.calculateArea(), 0.0);
    }

    @Test
    public void calculatePerimeter_should_return_the_perimeter_of_a_rectangle() throws InvalidInput {
        assertEquals(12, rectangle2_4.calculatePerimeter(), 0.0);
    }

    @Test
    public void create_should_give_a_Invalid_input_exception_when_it_get_length_is_zero() throws InvalidInput {
        double length = 0;
        double breadth = 3;
        thrown.expect(InvalidInput.class);
        thrown.expectMessage(CoreMatchers.startsWith("Invalid input, please check the input, Require positive value but found "));
        Rectangle.create(length, breadth);
    }

    @Test
    public void create_should_give_a_Invalid_input_exception_when_it_get_breadth_is_zero() throws InvalidInput {
        double length = 3;
        double breadth = 0;
        thrown.expect(InvalidInput.class);
        thrown.expectMessage(CoreMatchers.startsWith("Invalid input, please check the input, Require positive value but found "));
        Rectangle.create(length, breadth);
    }

    @Test
    public void create_should_give_a_Invalid_input_exception_when_it_get_length_and_breadth_is_zero() throws InvalidInput {
        double length = 0;
        double breadth = 0;
        thrown.expect(InvalidInput.class);
        thrown.expectMessage(CoreMatchers.startsWith("Invalid input, please check the input, Require positive value but found "));
        Rectangle.create(length, breadth);
    }

    @Test
    public void create_should_give_a_Invalid_input_exception_when_it_get_negative_breadth() throws InvalidInput {
        double length = 10;
        double breadth = -3;
        thrown.expect(InvalidInput.class);
        thrown.expectMessage(CoreMatchers.startsWith("Invalid input, please check the input, Require positive value but found "));
        Rectangle.create(length, breadth);
    }

    @Test
    public void create_should_give_a_Invalid_input_exception_when_it_get_negative_length() throws InvalidInput {
        double length = -10;
        double breadth = 3;
        thrown.expect(InvalidInput.class);
        thrown.expectMessage(CoreMatchers.startsWith("Invalid input, please check the input, Require positive value but found "));
        Rectangle.create(length, breadth);
    }

    @Test
    public void create_should_give_a_Invalid_input_exception_when_it_get_negative_length_and_breadth() throws InvalidInput {
        double length = -10;
        double breadth = -3;
        thrown.expect(InvalidInput.class);
        thrown.expectMessage(CoreMatchers.startsWith("Invalid input, please check the input, Require positive value but found "));
        Rectangle.create(length, breadth);
    }
}