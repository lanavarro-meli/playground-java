package aula03.praticaIntegradoraII.cliente;

import aula03.praticaIntegradoraII.transacao.IConsultaSaldo;
import aula03.praticaIntegradoraII.transacao.IPagamentoServicos;
import aula03.praticaIntegradoraII.transacao.ISaquesDinheiro;

public class Basico extends Cliente implements IConsultaSaldo, IPagamentoServicos, ISaquesDinheiro {


    @Override
    public void ConsultaSaldo() {

    }


    @Override
    public void SaqueDinheiro() {

    }

    @Override
    public void PagamentoServicos() {

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
