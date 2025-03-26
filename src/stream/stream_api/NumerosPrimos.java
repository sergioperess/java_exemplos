package stream.stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// Desafio 17 - Filtrar os números primos da lista
public class NumerosPrimos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimos = numeros.stream()
                .filter(NumerosPrimos::ehPrimo)
                .toList();

        System.out.println(numerosPrimos);
    }

    public static boolean ehPrimo(int numero) {
        if (numero < 2) return false;
        if (numero == 2) return true;
        if (numero % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
