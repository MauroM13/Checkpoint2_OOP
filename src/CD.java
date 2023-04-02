public class CD {
    private String titulo;
    private String artista;
    private String genero;
    private int qtdEstoque;
    private int qtdDisponivel;

    public CD(String titulo, String artista, String genero, int qtdEstoque) {
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.qtdEstoque = qtdEstoque;
        this.qtdDisponivel = qtdEstoque;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public int getQtdDisponivel() {
        return qtdDisponivel;
    }

    public void setQtdDisponivel(int qtdDisponivel) {
        this.qtdDisponivel = qtdDisponivel;
    }

    public boolean verificarDisponibilidade() {
        return qtdDisponivel > 0;
    }

    public void realizarDevolucao() {
        qtdDisponivel++;
    }

    @Override
    public String toString() {
        return "CD{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", genero='" + genero + '\'' +
                ", qtdEstoque=" + qtdEstoque +
                ", qtdDisponivel=" + qtdDisponivel +
                '}';
    }
}
