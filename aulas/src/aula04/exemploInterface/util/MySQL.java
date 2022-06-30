package aula04.exemploInterface.util;

import aula04.exemploInterface.modelo.Conta;

public class MySQL implements IBancoDados{

    @Override
    public void gravar(Conta conta) {
        System.out.printf("gravando no banco de dados mysql a conta? %d\n",conta.getNumero());
    }
}
