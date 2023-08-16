package br.com.etecia.myapp;

public class Jogadoras {

    private String nome,titulo, descricao, time;
    private int image;

    // criar o construtor com parametros alt+insert


    public Jogadoras(String nome, String titulo, String descricao, String time, int image) {
        this.nome = nome;
        this.titulo = titulo;
        this.descricao = descricao;
        this.time = time;
        this.image = image;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
