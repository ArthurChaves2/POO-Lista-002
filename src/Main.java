import Modelo.*;
import Servico.BibliotecaServico;

public class Main {
    public static void main(String[] args) {
        Usuario aluno = new Aluno("Arthur", 1, "arthur@gmail.com", "2023001");
        Curso Curso = new Curso("Sistemas de Informação");

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro2 = new Livro("1984", "George Orwell");

        BibliotecaServico biblioteca = new BibliotecaServico();

        biblioteca.emprestarLivro(aluno, livro1);
        biblioteca.emprestarLivro(Curso, livro2);

        biblioteca.devolverLivro(livro1);
        biblioteca.emprestarLivro(Curso, livro2);
    }
}
