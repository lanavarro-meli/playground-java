package aula04.exemploInterface.modelo;

import aula04.exemploInterface.util.IBancoDados;

public abstract class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero) {
        this.numero = numero;
    }

    public void Depositar(double valor) {
        this.saldo += valor;

    }

    public void Gravar(IBancoDados banco) {
        banco.gravar(Conta.this);
    }


    public void Sacar(double valor) {
        this.saldo -= valor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
