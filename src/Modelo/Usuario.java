package Modelo;

public abstract class Usuario {
    protected String nome;
    protected int id;
    protected String email;

    public Usuario(String nome, int id, String email) {
        this.nome = nome;
        this.id = id;
        this.email = email;
    }

    public abstract String getTipoUsuario();

    public String getNome() {
        return nome;
    }
}