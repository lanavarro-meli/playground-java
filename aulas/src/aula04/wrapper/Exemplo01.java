package aula04.wrapper;

public class Exemplo01 {
    public static void main(String[] args) {
        int n = 10;
        Integer integer = 10; // autoboxing: boxing conversion
        int valor = integer.intValue();
        valor = integer; // autoboxing: unboxing conversion

        System.out.println(integer);
        System.out.println(valor);

        int numero = Integer.parseInt("123");
        System.out.println(numero);

        Integer n1 = 200;
        Integer n2 = 200;
        System.out.println(n1.equals(n2));
        System.out.println(n1 == n2);
    }
}
