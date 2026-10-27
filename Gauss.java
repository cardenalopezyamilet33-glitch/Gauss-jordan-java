/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcuacionesLineales;

/**
 *
 * @author Carde
 */
public class Gauss {
     /** Triangula la matriz aumentada hacia forma triangular superior. */
    public static void eliminacionGaussiana(double[][] matriz) {
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            double pivote = matriz[i][i];

            // Anula los elementos debajo del pivote
            for (int k = i + 1; k < n; k++) {
                double factor = matriz[k][i] / pivote;
                for (int j = i; j <= n; j++) {
                    matriz[k][j] -= factor * matriz[i][j];
                }
            }
        }
    }
}
