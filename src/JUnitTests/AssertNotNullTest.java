package JUnitTests;

import org.junit.Assert;
import org.junit.Test;

public class AssertNotNullTest {


//Comprueba que el valor introducido no sea "null"

	@Test
    public void testNotNull() {
        Assert.assertNotNull("Mauricio");
    }

}
