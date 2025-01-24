import java.util.*;
public class Livro {
    Scanner leitura = new Scanner(System.in);
    private String titulo, autor, genero, codigo, faixaEtaria, dataLancamento;
    private boolean situacao;
    
    public Livro() {
        System.out.println("\nCATALOGANDO LIVROS");
        System.out.println("Informe o titulo do livro: ");
        titulo = leitura.nextLine();
        System.out.println("Informe o autor: ");
        autor = leitura.nextLine();
        System.out.println("Informe o gênero: ");
        genero = leitura.nextLine();
        System.out.println("Informe o código: ");
        codigo = leitura.nextLine();
        System.out.println("Informe a faixa etaria: ");
        faixaEtaria = leitura.nextLine();
        System.out.println("Informe a data de lançamento: ");
        dataLancamento = leitura.nextLine();
        System.out.println("O livro está disponível? [True, False]");
        situacao = leitura.nextBoolean();
    }
    
    public void exibirLivro() {
        System.out.println("\nEXIBINDO HISTORICO");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Gênero: " + genero);
        System.out.println("Código: " + codigo);
        System.out.println("Faixa etária: " + faixaEtaria);
        System.out.println("Data de lançamento: " + dataLancamento);
    }

    public Scanner getLeitura() {
        return leitura;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
}