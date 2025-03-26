package stream.stream_api;

import java.util.Arrays;
import java.util.List;

// Desafio 8 - Somar os dígitos de todos os números da lista
public class SomaDigitos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDigitos = numeros.stream()
                .map(n -> String.valueOf(n).length()) // Conta os dígitos de cada número
                .reduce(0, Integer::sum); // Soma os valores

        System.out.println("O número de caracteres é: " + somaDigitos);
    }
}
