/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        imprimirValores(informacion);
    }
    public static void imprimirValores (int[][] valores){
        String cadena = "";
        for (int fila = 0; fila < valores.length; fila++){
            for (int columna = 0; columna < valores[fila].length; columna++) {
                cadena = String.format("%s[%d][%d] = %d\n",
                        cadena,
                        fila,
                        columna,
                        valores[fila][columna]);
            }
        }
        System.out.printf("%s", cadena);
    }
}
    
    

