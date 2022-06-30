package aula04.praticaIntegradoraI.modelo;

import java.util.ArrayList;

public class Garagem {
    private int id;
    private ArrayList<Veiculo> veiculos;

    public Garagem(int id,ArrayList<Veiculo> veiculo){
        this.id = id;
        this.veiculos = veiculo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public void ordenaPorMarca(){
        veiculos.sort((v1, v2) -> v1.getMarca().length() - v2.getMarca().length());
        veiculos.forEach((veiculo -> System.out.println(veiculo.getMarca())));
    }

    public void ordenaPorPreco(){
        veiculos.sort((v1, v2) -> Double.compare(v1.getPreco(), v2.getPreco()));
        veiculos.forEach((veiculo -> System.out.println(veiculo.getPreco())));
    }
    public void filtraPorPrecoMenor(){
        veiculos.stream().filter(v -> v.getPreco() < 1000).forEach(v -> System.out.println(v.getPreco()));
    }
    public void filtraPorPrecoMaior(){
        veiculos.stream().filter(v -> v.getPreco() >= 1000).forEach(v -> System.out.println(v.getPreco()));
    }
    public double mediaPrecos(){
        double media = veiculos.stream().mapToDouble(v -> v.getPreco()).average().orElse(0.0);
        return media;
    }




}
