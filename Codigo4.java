
/*
 * 
package com.generation;

public class Codigo4 {

    Scanner s = new Scanner();
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    Scanner s2 = new Scanner();
    String j2 = s.nextLine();
    
    if (j1 == j2)) {
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2 == "tijeras") {
            g = 1;
          }

        case "papel":
          if (j2 == "piedra") {
            g = 1;
          
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
    }
  
  
}
 * 
 * 
 */

/**
 * 
 * Creé un nuevo Java Project y en la carpeta source creé una nueva clase llamada Codigo4.
 * 
 */

import java.util.Scanner; // Importé Scanner

public class Codigo4 {

	// Agregué "public static void main"
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) { // Agregué "System.in" para inicializar Scanner
        	// y "try" para asegurar que el Scanner se cierre automáticamente.

            System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
            String j1 = s.nextLine().toLowerCase(); // Se convierte a minúsculas para evitar problemas con mayúsculas

            // Quité Scanner duplicado
            System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
            String j2 = s.nextLine().toLowerCase();

            if (j1.equals(j2)) { // Cambié "==" por "equals" para comparar los Strings
                System.out.println("Empate");
            } else {
                int g = 2;
                switch (j1) { 
                    case "piedra":
                    	// Cambié "tijeras" por "tijera"
                        if (j2.equals("tijera")) {
                            g = 1;
                        }
                        break; // Agregué un "break" para cada caso
                    case "papel":
                        if (j2.equals("piedra")) {
                            g = 1;
                        }
                        break;
                    case "tijera":
                        if (j2.equals("papel")) {
                            g = 1;
                        }
                        break;
                    default:
                        System.out.println("Entrada no válida");
                        return; // Salir del método en caso de entrada no válida
                }
                System.out.println("Gana el jugador " + g);
            }
        } 
    }
}
