package aula04.exemploInterface;

import aula04.exemploInterface.modelo.Conta;
import aula04.exemploInterface.modelo.ContaCorrente;
import aula04.exemploInterface.modelo.ContaEspecial;
import aula04.exemploInterface.util.MongoDB;
import aula04.exemploInterface.util.MySQL;

import java.util.ArrayList;
import java.util.HashMap;

public class AppConta {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(222);
        ContaEspecial conta2 = new ContaEspecial(222,500.0);
        ArrayList<Conta> contas = new ArrayList<Conta>();
        contas.add(conta1);
        contas.add(conta2);

        HashMap<Integer,Conta> mapa = new HashMap<>();

        mapa.put(conta1.getNumero(),conta1);
        mapa.put(conta2.getNumero(),conta2);

        Conta contaencontrada = mapa.get(222);
        System.out.println("Conta encontrada:"+ contaencontrada);

        for (int i = 0; i < contas.size() ; i++) {
            System.out.println("Conta: " + contas.get(i).getNumero());
        }

        for(Conta c: contas){
            System.out.println("Conta:" + c.getNumero());
        }

        MySQL bdMySQL = new MySQL();
        MongoDB bdMongoDb = new MongoDB();

        conta1.Gravar(bdMySQL);
        conta2.Gravar(bdMongoDb);
    }
}
