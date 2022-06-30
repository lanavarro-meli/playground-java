package aula04.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exemplo05 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5);

        Stream<Integer> stream = lista.stream();
        stream.forEach( s -> System.out.println(s));

        List<Integer> listaAlterada = lista.stream().map(n -> n * 2).toList();
        listaAlterada.forEach( n -> System.out.println(n));
    }
}
