package aula02.exemplo01;

public class Livro {
    private String nome;
    private String autor;

    public Livro(String nome, String autor){
        this.nome = nome;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
