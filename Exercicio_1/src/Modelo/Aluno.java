package Modelo;

public class Aluno extends Usuario {
    private String matricula;

    public Aluno(String nome, int id, String email, String matricula) {
        super(nome, id, email);
        this.matricula = matricula;
    }

    @Override
    public String getTipoUsuario() {
        return "Aluno";
    }
}

