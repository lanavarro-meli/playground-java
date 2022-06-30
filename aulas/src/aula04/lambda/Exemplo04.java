package aula04.lambda;

public class Exemplo04 {

    interface InterfaceString{
        String executar(String string);
    }

    public static void imprimir(String texto, InterfaceString inter){
        String resultado = inter.executar(texto);
        System.out.println(resultado);

    }
    public static void main(String[] args) {
        InterfaceString interString = s -> s + "complemento";
        imprimir("meu texto ", interString);
    }


}
