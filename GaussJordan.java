/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcuacionesLineales;

/**
 *
 * @author Carde
 */
public class GaussJordan {
   /**
     * Convierte la matriz aumentada en la matriz identidad.
     * Reutiliza Gauss.eliminacionGaussiana para la triangulación.
     * La matriz se modifica directamente (paso por referencia).
     */
    public static void resolver(double[][] matriz) {
        int n = matriz.length;

        // Paso 1: triangulación inferior (módulo reutilizado)
        Gauss.eliminacionGaussiana(matriz);

        // Paso 2: de abajo hacia arriba
        for (int i = n - 1; i >= 0; i--) {
            double pivote = matriz[i][i];

            // Normaliza la fila para que el pivote sea 1
            for (int j = 0; j <= n; j++) {
                matriz[i][j] /= pivote;
            }

            // Anula los coeficientes superiores al pivote
            for (int k = i - 1; k >= 0; k--) {
                double factor = matriz[k][i];
                for (int j = 0; j <= n; j++) {
                    matriz[k][j] -= factor * matriz[i][j];
                }
            }
        }
    } 
}
