package Excecoes;

public class LivroDisponivel extends Exception {
    public LivroDisponivel(String mensagem) {
        super(mensagem);
    }
}