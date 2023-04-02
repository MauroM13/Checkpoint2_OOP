import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Venda implements Consumer<Venda> {

    private LocalDate dataVenda;
    private double valorTotal;
    private List<CD> cds;

    public Venda(LocalDate dataVenda, double valorTotal) {
        this.dataVenda = dataVenda;
        this.valorTotal = valorTotal;
        this.cds = new ArrayList<>();
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public List<CD> getCds() {
        return cds;
    }

    public void adicionarCD(CD cd) {
        cds.add(cd);
    }

    public void removerCD(CD cd) {
        cds.remove(cd);
    }

    @Override
    public void accept(Venda venda) {

    }
}
