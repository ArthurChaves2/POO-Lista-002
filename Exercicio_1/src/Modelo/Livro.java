package Modelo;

import Excecoes.LivroIndisponivel;
import Excecoes.LivroDisponivel;
import Interface.Emprestavel;

public class Livro implements Emprestavel {
    private String titulo;
    private String autor;
    private boolean disponivel = true;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void emprestar() throws LivroIndisponivel {
        if (!disponivel) {
            throw new LivroIndisponivel("Livro indisponível para empréstimo.");
        }
        disponivel = false;
    }
    
    public void emprestar(Curso curso, Livro livro) {
        try {
            livro.emprestar();
            System.out.println("Curso " + curso.getNomeCurso() + " emprestou o livro: " + livro.getTitulo());
        } catch (LivroIndisponivel e) {
            System.out.println("Erro ao emprestar livro: " + e.getMessage());
        }
    }

    public void devolver() throws LivroDisponivel {
        if (disponivel) {
            throw new LivroDisponivel("Livro já está disponível na biblioteca.");
        }
        disponivel = true;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public String getTitulo() {
        return titulo;
    }
}
