package aula04.generics;

public class GenericsClasse<T> {
    private T obj;

    public GenericsClasse(T obj){
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
