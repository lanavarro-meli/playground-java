package aula03.praticaIntegradoraII.cliente;

import aula03.praticaIntegradoraII.transacao.IDeposito;
import aula03.praticaIntegradoraII.transacao.ITransferencia;

public class Executivo extends Cliente implements IDeposito, ITransferencia {


    @Override
    public void Deposito() {

    }

    @Override
    public void Transferencia() {

    }

    @Override
    public boolean TransacaoOk() {
        return false;
    }

    @Override
    public boolean TransacaoNaoOk() {
        return false;
    }
}


