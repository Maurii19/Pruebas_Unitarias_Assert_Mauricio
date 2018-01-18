package metodos;

public class AssertFalse {
	 	
	//Este metodo comprueba si el numero es impar; si no es impar, al hacer el test con
	//JUnit nos dara error
	    public boolean numerosImpares(int numero){
	        boolean resultado = false;
	        if(numero%2 == 0){
	            resultado = true;
	        }
	        return resultado;
	    }
	     

	
}

