package com.jorge.caesar;

import java.util.Scanner;

public class Validator {

    private static final Scanner scanner = new Scanner(System.in);

    // Pide un entero positivo y lo valida
    public static int getValidShift() {
        int shift = -1;
        while (shift < 0) {
            System.out.print("Ingrese el número de desplazamiento (entero positivo): ");
            String input = scanner.nextLine();

            if (isNumeric(input)) {
                shift = Integer.parseInt(input);
                if (shift < 0) {
                    System.out.println("El número debe ser positivo.");
                }
            } else {
                System.out.println("Por favor ingrese un número entero válido.");
            }
        }
        return shift;
    }

    // Comprueba si una cadena representa un número entero
    private static boolean isNumeric(String str) {
        return str.matches("\\d+"); // Solo dígitos (0-9)
    }
}
