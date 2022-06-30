package aula03.praticaIntegradoraI.util;

import aula03.praticaIntegradoraI.animal.Cachorro;
import aula03.praticaIntegradoraI.animal.Gato;
import aula03.praticaIntegradoraI.animal.Vaca;

public class AppAnimal {
    public static void main(String[] args) {
        Vaca vaca = new Vaca();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        System.out.println(vaca.ComerPasto());
        System.out.println(vaca.EmitirSom());
        System.out.println(cachorro.ComerCarne());
        System.out.println(cachorro.EmitirSom());
        System.out.println(gato.EmitirSom());
        System.out.println(gato.ComerCarne());
    }
}
