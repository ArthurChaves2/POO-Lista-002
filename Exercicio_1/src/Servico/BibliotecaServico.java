package Servico;

import Excecoes.LivroIndisponivel;
import Excecoes.LivroDisponivel;
import Modelo.Livro;
import Modelo.Usuario;
import Modelo.Curso;

public class BibliotecaServico {
    public void emprestarLivro(Usuario usuario, Livro livro) {
        try {
            livro.emprestar();
            System.out.println("Biblioteca emprestou o livro: " + livro.getTitulo());
        } catch (LivroIndisponivel e) {
            System.out.println("Erro ao emprestar livro: " + e.getMessage());
        }
    }
    
    public void emprestarLivro(Curso curso, Livro livro) {
        try {
            livro.emprestar();
            System.out.println("Biblioteca emprestou o livro: " + livro.getTitulo());
        } catch (LivroIndisponivel e) {
            System.out.println("Erro ao emprestar livro: " + e.getMessage());
        }
    }

    public void devolverLivro(Livro livro) {
        try {
            livro.devolver();
            System.out.println("Livro devolvido: " + livro.getTitulo());
        } catch (LivroDisponivel e) {
            System.out.println("Erro ao devolver livro: " + e.getMessage());
        }
    }
}