package aula02.praticaIntegradora;

public class Pessoa {
    private String id;
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(){}
    public Pessoa(String id, String nome, int idade){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }
    public Pessoa(String id, String nome, int idade, double peso, double altura){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String calcularIMC(){
        double calculo = this.peso/(Math.pow(this.altura,2));
        if(calculo <20){
            return "Abaixo do peso";
        }
        else if(calculo>= 20 && calculo <=25){
            return "Peso saudável";
        }
        return "Sobrepeso";
    }

    public boolean maiorIdade(){
        if(this.idade >= 18){
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return "Nome: " + this.nome + " Idade: " + this.idade +
                " Peso:" + this.peso + " Altura : " +this.altura;
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
