package metodos;

import java.util.ArrayList;
import java.util.List;

public class Empleados {

		 
	    private String nombre;
	    private int codigo;
	    private int salario;
	     
	    public Empleados(int id, String nom, int sal){
	        this.codigo = id;
	        this.nombre = nom;
	        this.salario = sal;
	    }
	     
	    public boolean equals(Object obj){
	        Empleados empl = (Empleados) obj;
	        boolean status = false;
	        if(this.nombre.equalsIgnoreCase(empl.nombre)
	                && this.codigo == empl.codigo 
	                && this.salario == empl.salario){
	            status = true;
	        }
	        return status;
	    }
	     
	    //Lista que se usara en el metodo "AssertArrayEqualsTest"
	    public static List<Empleados> getEmpList(){
	        List<Empleados> empleados = new ArrayList<Empleados>();
	        empleados.add(new Empleados(1, "Mikel", 15000));
	        empleados.add(new Empleados(2, "David", 25000));
	        empleados.add(new Empleados(3, "Hugo", 5000));
	        return empleados;
	    }
	     
	    public String getNombre() {
	        return nombre;
	    }
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }
	    public int getCodigo() {
	        return codigo;
	    }
	    public void setCodigo(int cod) {
	        this.codigo = cod;
	    }
	    public int getSalario() {
	        return salario;
	    }
	    public void setSalario(int salarioo) {
	        this.salario = salarioo;
	    }
}

