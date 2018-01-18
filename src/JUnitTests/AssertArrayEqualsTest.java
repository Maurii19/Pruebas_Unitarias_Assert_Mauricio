package JUnitTests;

import org.junit.Test;
import metodos.Empleados;
import static org.junit.Assert.*;
import org.junit.Before;

 
public class AssertArrayEqualsTest {
	
	//Este metodo compara si dos arrays son iguales

	
    Object[] nuevosEmpleados = new Object[3];
    
    @Before
    public void initInputs(){
        nuevosEmpleados[0] = new Empleados(1, "Mikel", 15000);
        nuevosEmpleados[1] = new Empleados(2, "David", 25000);
        nuevosEmpleados[2] = new Empleados(3, "Hugo", 5000);
    }
     
    @Test
    public void compararEmpleados(){
        /**
         * Convierte la lista de objetos a un array de objetos
         */
        Object[] empleadosListaDefinida = Empleados.getEmpList().toArray();
        assertArrayEquals(nuevosEmpleados, empleadosListaDefinida);
    }
    
        
        
       
    }
