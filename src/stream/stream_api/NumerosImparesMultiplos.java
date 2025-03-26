package stream.stream_api;

import java.util.Arrays;
import java.util.List;

// Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5
public class NumerosImparesMultiplos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> multiplosImpares = numeros.stream()
                .filter(n -> (n % 2 != 0) && (n % 3 == 0 || n % 5 == 0)).toList();

        System.out.println(multiplosImpares);
    }
}
