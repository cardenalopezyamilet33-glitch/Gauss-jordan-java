# Método de Gauss-Jordan en Java

- *Materia:* SCC-1017 Métodos Numéricos, Unidad 3
- *Docente:* Víctor Hugo Vásquez Herrera
- *Alumno:* Cardeña Lopez Yamilet — 257O02788
- *Institución:* Instituto Tecnológico Superior de Xalapa

## Descripción

Implementación del método de Gauss-Jordan para resolver sistemas de ecuaciones lineales. El programa reutiliza el módulo de Eliminación Gaussiana de la práctica anterior para triangular la matriz aumentada y después normaliza los pivotes y anula los coeficientes superiores hasta obtener la matriz identidad. Las soluciones quedan directamente en la última columna, sin sustitución regresiva.

## Estructura modular del proyecto

    Gauss-jordan-java/
    ├── Gauss.java        # Eliminación gaussiana (triangulación superior)
    ├── GaussJordan.java  # Reutiliza Gauss y completa la reducción a la identidad
    ├── defMatriz.java    # Define la matriz aumentada e imprime matrices
    ├── main.java         # Programa principal
    └── README.md

Todas las clases pertenecen al paquete EcuacionesLineales.

| Clase | Responsabilidad |
|---|---|
| Gauss | eliminacionGaussiana(matriz): lleva la matriz a forma triangular superior. |
| GaussJordan | resolver(matriz): invoca Gauss.eliminacionGaussiana, normaliza cada pivote a 1 y anula los coeficientes superiores. |
| defMatriz | obtenerMatriz() devuelve el sistema; imprimirMatriz(matriz) lo muestra en consola. |
| main | Orquesta el flujo: matriz inicial, resolución, matriz final y vector de soluciones. |

La matriz se pasa por referencia, así que todos los métodos modifican el mismo arreglo en memoria y no se hacen copias.

## Cómo compilar y ejecutar

Requisito: JDK 8 o superior.

Desde la carpeta raíz del repositorio:

    # Compilar
    mkdir out
    javac -d out *.java

    # Ejecutar
    java -cp out EcuacionesLineales.main

También se puede abrir como proyecto en NetBeans y ejecutar main.java.

## Ejemplo de prueba

Sistema de ecuaciones:

     2x1 +  x2 -  x3 =   8
    -3x1 -  x2 + 2x3 = -11
    -2x1 +  x2 + 2x3 =  -3

Salida por consola:

    === MATRIZ AUMENTADA INICIAL ===
        2.0000     1.0000    -1.0000     8.0000 
       -3.0000    -1.0000     2.0000   -11.0000 
       -2.0000     1.0000     2.0000    -3.0000 

    === MATRIZ IDENTIDAD Y RESULTADO ===
        1.0000     0.0000     0.0000     2.0000 
        0.0000     1.0000     0.0000     3.0000 
       -0.0000    -0.0000     1.0000    -1.0000 

    === VECTOR DE SOLUCIONES DIRECTAS ===
    x1 = 2.0000
    x2 = 3.0000
    x3 = -1.0000

Nota: el -0.0000 en la matriz final es un residuo de redondeo de punto flotante (un valor negativo muy cercano a cero). No afecta el resultado.

Comprobación: 2(2) + 3 − (−1) = 8, −3(2) − 3 + 2(−1) = −11 y −2(2) + 3 + 2(−1) = −3.
