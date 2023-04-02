import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String endereco;
    private String telefone;
    private List<Locacao> historicoLocacoes;
    private List<Venda> historicoCompras;

    public Cliente(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.historicoLocacoes = new ArrayList<>();
        this.historicoCompras = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Locacao> getHistoricoLocacoes() {
        return historicoLocacoes;
    }

    public List<Venda> getHistoricoCompras() {
        return historicoCompras;
    }

    public void adicionarLocacao(Locacao locacao1) {
    }

    public void adicionarCompra(Venda venda1) {
    }
}




