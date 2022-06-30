package aula02.exemplo03;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        double resultado;

        System.out.println("Digite um valor inteiro: ");
        try{
            numero = teclado.nextInt();
        }
        catch (Exception ex){
            System.out.println("Digitacao inválida" + ex.getMessage());
        }
        finally{
            teclado.close();
        }
        //resultado = 34.0/ numero;
        //System.out.println(resultado);
    }
}
