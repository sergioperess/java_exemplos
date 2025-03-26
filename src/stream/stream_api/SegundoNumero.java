package stream.stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Desafio 7 - Encontrar o segundo maior número da lista:
public class SegundoNumero {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 10);

        Integer maiorNumero = numeros.stream()
                .max(Comparator.naturalOrder()).orElseThrow();

        int segundoMaior = numeros.stream()
                .filter(n -> !n.equals(maiorNumero))
                .max(Comparator.naturalOrder()).orElseThrow();

        System.out.println(segundoMaior);
    }
}
