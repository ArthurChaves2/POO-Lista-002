package Interface;

import Excecoes.LivroIndisponivel;
import Excecoes.LivroDisponivel;

public interface Emprestavel {
    void emprestar() throws LivroIndisponivel;
    void devolver() throws LivroDisponivel;
}
