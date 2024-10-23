package Empleados;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingresar su edad: ");
        int edad = sc.nextInt();
        System.out.print("Ingresar su sueldo: ");
        double sueldo = sc.nextDouble();

        Empleado empleado = new Empleado("April", 28, 250.30);
        Empleado empleado1 = new Empleado(nombre, edad, sueldo);

        empleado.imprimir();
        empleado1.imprimir2();

        sc.close();
    }
}

