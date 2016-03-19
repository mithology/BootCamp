import org.hamcrest.CoreMatchers;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by mitesh on 3/18/16.
 */
public class ChanceTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void throwsInvalidProbabilityException() throws InvalidProbabilityException {
        thrown.expectMessage(CoreMatchers.is("Expected the value to be greater than zero and less than one"));
        Chance chance=Chance.create(1.5);
    }
    @Test
    public void givesChancesOfNotOccuring() throws InvalidProbabilityException {

        Chance chance=Chance.create(0.5);
        Chance notOccuring = chance.notOccuringEvent();
        Chance expectedNotChance=Chance.create(0.5);
        assertEquals(expectedNotChance,notOccuring);
    }

    @Test
    public void givesChancesOfMultipleEventsOccuring() throws Exception, InvalidProbabilityException {
        Chance firstChance=Chance.create(0.5);
        Chance secondChance=Chance.create(0.5);
        Chance actualChance=Chance.create(0.25);
        Chance expectedChance=firstChance.and(secondChance);
        assertEquals(expectedChance,actualChance);

    }
}