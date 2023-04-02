import java.time.LocalDate;

public class Locacao {
    private LocalDate dataLocacao;
    private LocalDate dataDevolucao;
    private CD cd;

    public Locacao(LocalDate dataLocacao, LocalDate dataDevolucao, CD cd) {
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.cd = cd;
    }

    public LocalDate getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDate dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public CD getCd() {
        return cd;
    }

    public void setCd(CD cd) {
        this.cd = cd;
    }

    @Override
    public String toString() {
        return "Locação: " + cd.getTitulo() + " (" + cd.getArtista() + ") - " + dataLocacao + " a " + dataDevolucao;
    }
}
