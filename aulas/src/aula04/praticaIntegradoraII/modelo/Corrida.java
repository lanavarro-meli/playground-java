package aula04.praticaIntegradoraII.modelo;

import aula04.praticaIntegradoraII.interfaceModelo.ISocorristaCarro;
import aula04.praticaIntegradoraII.interfaceModelo.ISocorristaMoto;

import java.util.ArrayList;

public class Corrida implements ISocorristaMoto, ISocorristaCarro {
    private double distancia;
    private double premioDolares;
    private String nome;
    private int numeroVeiculosPermitidos;
    private ArrayList<Veiculo> listaveiculos;

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPremioDolares() {
        return premioDolares;
    }

    public void setPremioDolares(double premioDolares) {
        this.premioDolares = premioDolares;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroVeiculosPermitidos() {
        return numeroVeiculosPermitidos;
    }

    public void setNumeroVeiculosPermitidos(int numeroVeiculosPermitidos) {
        this.numeroVeiculosPermitidos = numeroVeiculosPermitidos;
    }

    public ArrayList<Veiculo> getListaveiculos() {
        return listaveiculos;
    }

    public void setListaveiculos(ArrayList<Veiculo> listaveiculos) {
        this.listaveiculos = listaveiculos;
    }

    public void addCarro(Carro carro){
        listaveiculos.add(carro);

    }
    public void addMoto(Motocicleta moto){
        listaveiculos.add(moto);

    }

    public void deleteVeiculo(Veiculo veiculo){
        listaveiculos.remove(veiculo);

    }
    public void deleteVeiculoPorPlaca(Veiculo veiculo){
        listaveiculos.removeIf(v -> v.getPlaca().equals(veiculo.getPlaca()));

    }

    public double desafioVencedor(Veiculo veiculo){
        return veiculo.getVelocidade() * Math.pow(veiculo.getAceleracao(),0.5) * (veiculo.getPeso() - veiculo.getRodas()*100);
    }


    @Override
    public void salvaVidasCarro() {

    }

    @Override
    public void socorre(Carro carro) {
        System.out.println("Socorro carro" + carro.getPlaca());
    }

    @Override
    public void salvaVidasMoto() {

    }

    @Override
    public void socorre(Motocicleta moto) {
        System.out.println("Socorro carro" + moto.getPlaca());
    }
}

