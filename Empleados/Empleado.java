package Empleados;

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void imprimir() {
        System.out.println("Su nombre es: " + nombre + ", su edad es: " + edad + ", su salario es: " + salario);
    }

    public void imprimir2() {
        System.out.println("Su nombre es: " + getNombre() + ", su edad es: " + getEdad() + ", su sueldo es: " + getSalario());
    }
}

