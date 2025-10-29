package com.jorge.caesar;

public class Cipher {
    private char[] alphabet;

    // Constructor que recibe el alfabeto
    public Cipher(char[] alphabet) {
        this.alphabet = alphabet;
    }

    // Método para cifrar texto
    public String encrypt(String text, int shift) {
        StringBuilder encrypted = new StringBuilder();

        shift = shift % alphabet.length; // normalizar también aquí

        for (char c : text.toCharArray()) {
            char upper = Character.toUpperCase(c);
            int index = indexOf(upper);

            if (index != -1) {
                int newIndex = (index + shift) % alphabet.length;
                encrypted.append(alphabet[newIndex]);
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }


    // Método para descifrar texto
    public String decrypt(String encryptedText, int shift) {
        StringBuilder decrypted = new StringBuilder();

        // Normalizamos el desplazamiento (por si es mayor que el alfabeto)
        shift = shift % alphabet.length;

        for (char c : encryptedText.toCharArray()) {
            char upper = Character.toUpperCase(c);
            int index = indexOf(upper);

            if (index != -1) {
                // Calculamos el nuevo índice asegurando que no sea negativo
                int newIndex = (index - shift + alphabet.length) % alphabet.length;
                decrypted.append(alphabet[newIndex]);
            } else {
                decrypted.append(c); // caracteres no alfabéticos se copian tal cual
            }
        }
        return decrypted.toString();
    }


    // Método auxiliar: busca la posición del carácter en el alfabeto
    private int indexOf(char c) {
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == c) {
                return i;
            }
        }
        return -1;
    }
}
