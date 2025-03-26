package stream.stream_api;

import java.util.Arrays;
import java.util.List;


// Desafio 6 - Verificar se a lista contém algum número maior que 10
public class VerificaNumero {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 12);

        numeros.stream()
                .filter(n -> n > 10)
                .forEach(System.out::println);
    }
}
