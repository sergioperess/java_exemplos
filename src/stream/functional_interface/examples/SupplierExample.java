package stream.functional_interface.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
public class SupplierExample {
    public static void main(String[] args) {
        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        // Não recebe nenhum argumento e retorna uma resposta do mesmo tipo (String) do Supplier
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        // Usar o Supplier para obter uma lista com 5 saudações
        /*List<String> listaSaudacoes1 = Stream.generate(saudacao)
            .limit(5)
            .collect(Collectors.toList());*/

        // Usar o Supplier para obter uma lista com 5 saudações sem lambda
        List<String> listaSaudacoes2 = Stream.generate(
                        new Supplier<String>() {
                            @Override
                            public String get() {
                                return "Olá, seja bem-vindo(a)!";
                            }
                        }
                )
                .limit(5)
                .toList();

        // Usar o Supplier para obter uma lista com 5 saudações com lambda
        List<String> listaSaudacoes3 = Stream.generate(() -> "Olá, seja bem-vindo(a)!")
                .limit(5)
                .toList();


        // Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();

        // Imprimir as saudações geradas
        //listaSaudacoes.forEach(n -> System.out.println(n));
        listaSaudacoes.forEach(System.out::println);
    }
}
