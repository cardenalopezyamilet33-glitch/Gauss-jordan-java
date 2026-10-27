/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcuacionesLineales;

/**
 *
 * @author Carde
 */
public class defMatriz {
   public static double[][] obtenerMatriz(){
        return new double[][]{
                {2.0, 1.0, -1.0, 8.0},
                {-3.0, -1.0, 2.0, -11.0},
                {-2.0, 1.0, 2.0, -3.0}
        };
    }

    public static void imprimirMatriz(double[][] matriz){
        int n = matriz.length;
        for (int i=0; i<n; i++){
            for (int j=0; j<=n; j++){
                System.out.printf("%10.4f ", matriz[i][j]);
            }
            System.out.println();
        }
    } 
}
