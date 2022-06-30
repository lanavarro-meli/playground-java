package aula04.exemploInterface.modelo;

public class ContaCorrente extends Conta{
    public ContaCorrente(int numero) {
        super(numero);
    }

    public void Sacar(double valor){
        if(valor <= getSaldo()){
            super.Sacar(valor);
        }
    }
}
