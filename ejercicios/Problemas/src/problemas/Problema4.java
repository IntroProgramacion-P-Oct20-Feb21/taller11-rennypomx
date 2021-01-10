/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner entrada=new Scanner(System.in);
        int opcion;
        System.out.println("Ingresar 1 para calcular el valor de la "
                + "planilla de luz\nIngresar 2 para calcular predio de"
                + "un inmueble: ");
        opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                calcularValorLuz();
                break;
            case 2:
                calcularPredio();
                break;
        }
    }
    public static void calcularValorLuz() {
        Scanner entrada=new Scanner(System.in);
        String nombre;
        String cedula;
        double valorKilovatios;
        double kilovatiosMes;
        double valorPanilla;
        System.out.println("Ingresar el nombre del cliente: ");
        nombre = entrada.nextLine();
        System.out.println("Ingresar el numero de cédula del cliente: ");
        cedula = entrada.nextLine();
        System.out.println("Ingresar el valor del kilovatio: ");
        valorKilovatios = entrada.nextDouble();
        System.out.println("Ingresar el número de kilovatios consumidos: ");
        kilovatiosMes = entrada.nextDouble();
        valorPanilla = valorKilovatios * kilovatiosMes;
        System.out.printf("Cliente %s con cédula %s debe cancelar el "
                + "valor de $%.2f\n",
                nombre, cedula, valorPanilla);
    }
    public static void calcularPredio() {
        Scanner entrada=new Scanner(System.in);
        String nombre;
        String cedula;
        double inmueble;
        double total;
        System.out.println("Ingresar el nombre del cliente: ");
        nombre = entrada.nextLine();
        System.out.println("Ingresar el numero de cédula del cliente: ");
        cedula = entrada.nextLine();
        System.out.println("Ingresar el valor del inmueble: ");
        inmueble = entrada.nextDouble();
        total = inmueble * 0.2;
        System.out.printf("Cliente %s con cédula %s tiene un bien inmueble "
                + "valorado en $%.2f y tiene que pagar de predio $%.2f\n",
                nombre, cedula, inmueble, total);
    }
    
}
