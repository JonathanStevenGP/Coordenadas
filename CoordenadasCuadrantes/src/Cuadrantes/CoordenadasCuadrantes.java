/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cuadrantes;

import java.util.Scanner;

/**
 *
 * @author Tatan
 */
public class CoordenadasCuadrantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de puntos: ");
        int n = scanner.nextInt();

        int[] cuadrantes = new int[4]; // Para almacenar el número de puntos en cada cuadrante

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese las coordenadas (x y) del punto " + (i + 1) + ": ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            // Determinar en qué cuadrante se encuentra el punto
            if (x > 0 && y > 0) {
                cuadrantes[0]++; // Cuadrante I
            } else if (x < 0 && y > 0) {
                cuadrantes[1]++; // Cuadrante II
            } else if (x < 0 && y < 0) {
                cuadrantes[2]++; // Cuadrante III
            } else if (x > 0 && y < 0) {
                cuadrantes[3]++; // Cuadrante IV
            }
        }

        // Imprimir el número total de puntos en cada cuadrante
        System.out.println("Número de puntos en el Cuadrante I: " + cuadrantes[0]);
        System.out.println("Número de puntos en el Cuadrante II: " + cuadrantes[1]);
        System.out.println("Número de puntos en el Cuadrante III: " + cuadrantes[2]);
        System.out.println("Número de puntos en el Cuadrante IV: " + cuadrantes[3]);
    }
}