package JUnitTests;

import org.junit.Assert;
import org.junit.Test;

public class AssertNotSameTest {

	//El metodo comprobara si ambos Strings son iguales.
	//Si lo son nos dara error.
	@Test
	  public void testComprarIgualRef() {
	        Assert.assertNotSame("Mauricio", "Manuel");
	}
}
