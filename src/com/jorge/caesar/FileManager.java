package com.jorge.caesar;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileManager {

    // Lee el contenido completo de un archivo de texto y lo devuelve como String
    public static String readFile(String filePath) {
        try {
            return Files.readString(Path.of(filePath));
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return "";
        }
    }

    // Escribe un texto en un archivo de salida
    public static void writeFile(String filePath, String content) {
        try {
            Files.writeString(Path.of(filePath), content);
            System.out.println("Archivo guardado correctamente en: " + filePath);
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
