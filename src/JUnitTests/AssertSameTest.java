package JUnitTests;

import org.junit.Assert;
import org.junit.Test;

public class AssertSameTest {

	//Este metodo comprueba si los dos Strings son iguales, si los dos Strings no son iguales
	//al hacer el test con JUnit nos dara error
	@Test
    public void testCompararIgualR() {
        Assert.assertSame("Nicolas Cage", "Nicolas Cage");
}
}
