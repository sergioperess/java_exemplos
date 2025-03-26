package stream.stream_api;

import java.util.Arrays;
import java.util.List;

// Desafio 11 - Encontre a soma dos quadrados de todos os números da lista
public class SomaQuadrados {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosDobrados = numeros.stream()
                .map(n -> Math.pow(n, 2))
                .map(Double::intValue)
                .toList();

        int soma = numerosDobrados.stream()
                        .reduce(0, Integer::sum);

        System.out.println(numerosDobrados);

        System.out.println("A soma dos números dobrados é: " + soma);

    }
}
