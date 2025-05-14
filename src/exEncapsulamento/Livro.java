package exEncapsulamento;

public class Livro {
    private String titulo;
    private String autor;
    private int paginasLidas;
    private int totalPaginas;

    public Livro(String titulo, String autor, int totalPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        if (totalPaginas > 0) {
            this.totalPaginas = totalPaginas;
        } else {
            this.totalPaginas = 1;
        }
        this.paginasLidas = 0;
    }

    public void ler(int paginas) {
        if (paginas > 0) {
            paginasLidas += paginas;
            if (paginasLidas > totalPaginas) {
                paginasLidas = totalPaginas;
            }
        }
    }

    public double progresso() {
        return (paginasLidas * 100.0) / totalPaginas;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginasLidas() {
        return paginasLidas;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }
}