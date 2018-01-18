package JUnitTests;

import org.junit.Assert;
import org.junit.Test;

public class AssertNullTest {

	//Este metodo comprueba si el valor es null, si no lo es el JUnit nos dara error
	
	@Test
    public void testNull() {
        Assert.assertNull(null);

}
}
