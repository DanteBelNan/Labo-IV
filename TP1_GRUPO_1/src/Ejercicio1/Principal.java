package Ejercicio1;

public class Principal {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 20);
        Empleado empleado2 = new Empleado("Pedro", 25);
        Empleado empleado3 = new Empleado("Lucas", 30);
        
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
    }

}