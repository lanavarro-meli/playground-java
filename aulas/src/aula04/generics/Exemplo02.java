package aula04.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Exemplo02 {
    public static void main(String[] args) {
        GenericsClasse<Integer> objeto01 = new GenericsClasse(123);
        GenericsClasse<String> objeto02 = new GenericsClasse("Texto");
        System.out.println(objeto01.getObj());
        System.out.println(objeto02.getObj());

        List<?> lista = new ArrayList<>();
        HashMap<Integer, String> mapa = new HashMap<>();
    }
}

