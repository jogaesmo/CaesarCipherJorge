package com.jorge.caesar;

public class MainApp {
    public static void main(String[] args) {
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Cipher cipher = new Cipher(alphabet);

        String text = "HOLA MUNDO";
        int shift = 3;

        String encrypted = cipher.encrypt(text, shift);
        String decrypted = cipher.decrypt(encrypted, shift);

        System.out.println("Texto original: " + text);
        System.out.println("Texto cifrado: " + encrypted);
        System.out.println("Texto descifrado: " + decrypted);
    }
}
