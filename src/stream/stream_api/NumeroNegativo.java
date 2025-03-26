package stream.stream_api;

import java.util.Arrays;
import java.util.List;

// Desafio 15 - Verifique se a lista contém pelo menos um número negativo
public class NumeroNegativo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosNegativos = numeros.stream()
                .filter(n -> n < 0).toList();

        if(numerosNegativos.isEmpty()){
            System.out.println("Não há numeros negativos na lista");
        }else{
            System.out.println("Há numeros negativos na lista");
            System.out.println(numerosNegativos);
            numerosNegativos.forEach(System.out::println);
        }
    }
}
