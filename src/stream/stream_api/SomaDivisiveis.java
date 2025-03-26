package stream.stream_api;

import java.util.Arrays;
import java.util.List;

//Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5
public class SomaDivisiveis {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15, 30);

        List<Integer> multiplosImpares = numeros.stream()
                .filter(n -> (n % 3 == 0 && n % 5 == 0)).toList();

        int soma = multiplosImpares.stream()
                        .reduce(0, Integer::sum);

        System.out.println(multiplosImpares);

        System.out.println("A soma dos números divisiveis por 3 e por 5 é: " + soma);
    }
}
