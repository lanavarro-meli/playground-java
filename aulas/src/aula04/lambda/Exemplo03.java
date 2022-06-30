package aula04.lambda;

import java.util.Arrays;
import java.util.List;

public class Exemplo03 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3);

        //for(Integer n: numeros){
        //  System.out.println(n);
        //}
        numeros.forEach(n -> System.out.println(n));
    }
//    public boolean par(int n){
//        return n % 2 == 0;
//    }

    //Expressoes Lambda
    //n -> n % 2 == 0; estrutura
}