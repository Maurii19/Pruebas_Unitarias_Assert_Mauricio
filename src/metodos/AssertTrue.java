package metodos;

public class AssertTrue {
   
	//Este metodo comprueba si el numero es par; si no es par, al hacer el test con
	//JUnit nos dara error
	public boolean numeroPar(int numero){
        
        boolean resultado = false;
        if(numero%2 == 0){
            resultado = true;
        }
        return resultado;
    }

}
