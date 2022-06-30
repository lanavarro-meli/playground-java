package aula03.praticaIntegradoraI.animal;

import aula03.praticaIntegradoraI.animalInterfaces.ICarnivoro;

public class Gato extends Animal implements ICarnivoro {
    @Override
    public String EmitirSom() {
        return "miau";
    }

    @Override
    public String ComerCarne() {
        return null;
    }
}