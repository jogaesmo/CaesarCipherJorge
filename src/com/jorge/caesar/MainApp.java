package com.jorge.caesar;

public class MainApp {
    public static void main(String[] args) {

        char[] alphabet = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ".toCharArray();
        Cipher cipher = new Cipher(alphabet);

        // Pedimos el desplazamiento al usuario con Validator
        int shift = Validator.getValidShift();

        String inputText = FileManager.readFile("entrada.txt");
        System.out.println("Texto original leído: " + inputText);

        String encryptedText = cipher.encrypt(inputText, shift);
        System.out.println("Texto cifrado: " + encryptedText);

        FileManager.writeFile("salida_encriptada.txt", encryptedText);

        String decryptedText = cipher.decrypt(encryptedText, shift);
        System.out.println("Texto descifrado: " + decryptedText);

        FileManager.writeFile("salida_descifrada.txt", decryptedText);

        System.out.println("\n Proceso completado correctamente.");
    }
}
