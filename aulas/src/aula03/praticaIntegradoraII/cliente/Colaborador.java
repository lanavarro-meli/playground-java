package aula03.praticaIntegradoraII.cliente;

import aula03.praticaIntegradoraII.transacao.IConsultaSaldo;
import aula03.praticaIntegradoraII.transacao.ISaquesDinheiro;

public class Colaborador extends Cliente implements IConsultaSaldo,ISaquesDinheiro {


    @Override
    public void ConsultaSaldo() {

    }

    @Override
    public void SaqueDinheiro() {

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
