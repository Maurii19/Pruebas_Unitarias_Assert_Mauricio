package JUnitTests;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import metodos.AssertFalse;

public class AssertFalseTest {
	//Este metodo comprueba si el numero es impar; si no es impar, al hacer el test con
		//JUnit nos dara error
	
    @Test
    public void evenNumberTest(){
        AssertFalse num = new AssertFalse();
        assertFalse(num.numerosImpares(3));
    }
    	

}
