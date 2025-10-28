package com.jorge.caesar;

public class MainApp {
    public static void main(String[] args) {
        // Probar lectura
        String contenido = FileManager.readFile("entrada.txt");
        System.out.println("Contenido leído: " + contenido);

        // Probar escritura
        FileManager.writeFile("salida.txt", "Hola desde FileManager!");
    }
}
