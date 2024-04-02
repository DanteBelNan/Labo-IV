package Ejercicio1;

public class Empleado {
    private final int id;
    private String nombre;
    private int edad;
    
    static int cont = 1000;
    
    public Empleado() {
    	cont ++;
    	this.id = cont;
    	this.nombre = "Sin nombre";
    	this.edad = 99;
    }
    
    //Constructores
    public Empleado(String nombre, int edad) {
    	
    	cont++; 
    	this.id = cont;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Getters
    public int getId(){
    	return id;
    }
    
    public String getNombre() {
 		return nombre;
 	}
    
    public int getEdad() {
		return edad;
	}
    
    //Setters
    public void setNombre(String nombre) {
 		this.nombre = nombre;
 	}
    
    public void setEdad(int edad) {
		this.edad = edad;
	}
    
    //M�todo ToString
    @Override
    public String toString() {
        return "Id empleado: " + id + ", Nombre: " + nombre + ", Edad: " + edad;
    }
    
    //M�todo Pr�ximo ID
    public static int devuelveProximoID() {
        return cont + 1;
    }
    
    
    
    
  
    
    
    
    
    
}