/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcuacionesLineales;

/**
 *
 * @author Carde
 */
public class main {
  public static void main(String[] args) {
        double[][] sistema = defMatriz.obtenerMatriz();

        System.out.println("=== MATRIZ AUMENTADA INICIAL ===");
        defMatriz.imprimirMatriz(sistema);

        GaussJordan.resolver(sistema);

        System.out.println("\n=== MATRIZ IDENTIDAD Y RESULTADO ===");
        defMatriz.imprimirMatriz(sistema);

        System.out.println("\n=== VECTOR DE SOLUCIONES DIRECTAS ===");
        for (int i = 0; i < sistema.length; i++) {
            System.out.printf("x%d = %.4f\n", (i + 1), sistema[i][sistema.length]);
        }
    }
}
