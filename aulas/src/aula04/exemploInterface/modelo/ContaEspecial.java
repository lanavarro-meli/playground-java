package aula04.exemploInterface.modelo;

public class ContaEspecial extends Conta{
    private double limite;
    public ContaEspecial(int numero, double limite) {
        super(numero);
        this.limite = limite;
    }

    @Override
    public void Sacar(double valor){
        if(valor <= getSaldo() + this.limite){
            super.Sacar(valor);
        }

    }
}