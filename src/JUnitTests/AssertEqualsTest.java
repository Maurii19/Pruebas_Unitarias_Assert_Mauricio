package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import metodos.AssertEquals;


public class AssertEqualsTest {
	//En este ejemplo, compara si los resultados son correctos
	
   
		AssertEquals calculador = new AssertEquals();
		
		@Test
		 public void testSumar() {
			assertEquals(calculador.sumar(10, 20), 30);
    }
		@Test
		public void testRestar(){
			assertEquals(calculador.restar(30, 20), 10);
		}
		@Test
		public void testMultiplicar(){
			assertEquals(calculador.multiplicar(30, 20), 600);
		}
		@Test
		public void testDividir(){
			assertEquals(calculador.dividir(10, 2), 5);
		}
	  
	}


