package stream.stream_api;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


// Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem)
public class NumerosDistintos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosDistintos = numeros.stream().distinct().toList();

        Set<Integer> vistos = new HashSet<>();
        List<Integer> numerosRepetidos = numeros.stream()
                .filter(n -> !vistos.add(n)) // Se já estiver no conjunto, é repetido
                .distinct() // Remove duplicatas na saída
                .toList();

        System.out.println("Números repetidos: " + numerosRepetidos);

        if(numeros.size() == numerosDistintos.size()){
            System.out.println("Os números são distintos");
            numerosDistintos.forEach(System.out::println);
        }else{
            System.out.println("Os números não são distintos");
            numerosRepetidos.forEach(System.out::println);
        }


    }
}
