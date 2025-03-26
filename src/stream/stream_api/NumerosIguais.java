package stream.stream_api;

import java.util.Arrays;
import java.util.List;

// Desafio 18 - Verifique se todos os números da lista são iguais
public class NumerosIguais {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numeros2 = Arrays.asList(1, 1, 1, 1, 1, 1);

        boolean todosIguais = numeros.stream()
                .allMatch(n -> n.equals(numeros.getFirst()));

        if (todosIguais) {
            System.out.println("Todos os números são iguais.");
        } else {
            System.out.println("Os números não são todos iguais.");
        }
    }
}
