package aula04.praticaIntegradoraII.modelo;

public abstract class Veiculo {
    private double velocidade;
    private double aceleracao;
    private double anguloGiro;
    private String placa;
    private double peso;
    private int rodas;

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(double aceleracao) {
        this.aceleracao = aceleracao;
    }

    public double getAnguloGiro() {
        return anguloGiro;
    }

    public void setAnguloGiro(double anguloGiro) {
        this.anguloGiro = anguloGiro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
}
