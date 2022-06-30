package aula03.praticaIntegradoraI.animal;

import aula03.praticaIntegradoraI.animalInterfaces.IHerbivoro;

public class Vaca extends Animal implements IHerbivoro {
    @Override
    public String EmitirSom() {
        return "muuu";
    }

    @Override
    public String ComerPasto() {
        return null;
    }
}
