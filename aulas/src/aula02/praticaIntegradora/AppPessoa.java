package aula02.praticaIntegradora;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa pessoaA = new Pessoa();
        Pessoa pessoaB = new Pessoa("1","Larissa",25);
        Pessoa pessoaC = new Pessoa("2","Larissa",25,87.5,1.75);
        System.out.println(pessoaA.calcularIMC());
        System.out.println(pessoaB.calcularIMC());
        System.out.println(pessoaC.calcularIMC());

        System.out.println(pessoaA.maiorIdade());
        System.out.println(pessoaB.maiorIdade());
        System.out.println(pessoaC.maiorIdade());

    }
}
