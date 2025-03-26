package stream.stream_api;

import java.util.Arrays;
import java.util.List;

// Desafio 3 - Verifique se todos os números da lista são positivos
public class VerificaPositivos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, -2, -6);

        numeros.stream()
                .filter(n -> n > 0)
                .forEach(System.out::println);
    }
}
