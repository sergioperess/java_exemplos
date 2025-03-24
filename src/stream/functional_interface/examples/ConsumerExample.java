package stream.functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */
public class ConsumerExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar o Consumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        // Formas de se usar o Consumer juntamente com o stream
        numeros.stream().forEach(imprimirNumeroPar);

        numeros.forEach(imprimirNumeroPar);

        numeros.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                if (integer % 2 == 0) {
                    System.out.println(integer);
                }
            }
        });

        // Usar o Consumer para imprimir números pares no Stream com função Lambda
        numeros.forEach(integer -> {
            if (integer % 2 == 0) {
                System.out.println(integer);
            }
        });

        // Usar o Consumer para imprimir números pares no Stream com filter
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
