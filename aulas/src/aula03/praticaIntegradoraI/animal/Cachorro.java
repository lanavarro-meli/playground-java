package aula03.praticaIntegradoraI.animal;

import aula03.praticaIntegradoraI.animalInterfaces.ICarnivoro;

public class Cachorro extends Animal implements ICarnivoro {
    @Override
    public String EmitirSom() {
        return "auau";
    }

    @Override
    public String ComerCarne() {
        return null;
    }
}
