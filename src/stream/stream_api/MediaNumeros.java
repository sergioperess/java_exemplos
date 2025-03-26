package stream.stream_api;

import java.util.Arrays;
import java.util.List;

// Desafio 5 - Calcule a média dos números maiores que 5
public class MediaNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaMaioresQueCinco = numeros.stream()
                .filter(n -> n > 5)
                .reduce(0, Integer::sum);

        System.out.println("A soma dos números maiores que 5 é: " + somaMaioresQueCinco);
    }
}
