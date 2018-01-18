package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import metodos.AssertTrue;

public class AssertTrueTest {

	//Este metodo comprueba si el numero es par; si no es par, al hacer el test con
		//JUnit nos dara error
     
    @Test
    public void numeroParTest(){
        AssertTrue num = new AssertTrue();
        assertTrue(num.numeroPar(4));
    }
	
}
