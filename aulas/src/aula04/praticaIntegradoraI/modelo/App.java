package aula04.praticaIntegradoraI.modelo;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Veiculo> veiculos = new ArrayList<>();
        Veiculo veiculo01 = new Veiculo("Fiesta", "Ford", 1000.0);
        Veiculo veiculo02 = new Veiculo("Focus", "Ford", 1200.0);
        Veiculo veiculo03 = new Veiculo("Aveo", "Chevrolet", 1250.0);
        veiculos.add(veiculo01);
        veiculos.add(veiculo02);
        veiculos.add(veiculo03);
        Garagem garagem = new Garagem(0, veiculos);

        System.out.println("Ordenado por Marca:");
        garagem.ordenaPorMarca();


        System.out.println("Ordenado  por Preco:");
        garagem.ordenaPorPreco();


        System.out.println("Filtro por Preco < 1000:");
        garagem.filtraPorPrecoMenor();


        System.out.println("Filtro por Preco >= 1000:");
        garagem.filtraPorPrecoMaior();

        System.out.println("Média dos valores: "+ garagem.mediaPrecos() );






    }
}
