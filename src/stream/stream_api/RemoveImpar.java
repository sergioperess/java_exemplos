package stream.stream_api;

import java.util.Arrays;
import java.util.List;

// Desafio 4 - Remova todos os valores ímpares:
public class RemoveImpar {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosImpares = numeros.stream()
                .filter(n -> n % 2 != 0).toList();

        System.out.println(numerosImpares);

        numerosImpares.forEach(System.out::println);
    }
}
