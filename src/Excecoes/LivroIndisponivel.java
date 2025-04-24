package Excecoes;

public class LivroIndisponivel extends Exception {
    public LivroIndisponivel(String mensagem) {
        super(mensagem);
    }
}