import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<CD> cds;

    public Estoque() {
        this.cds = new ArrayList<>();
    }

    public Estoque(List<CD> cds) {
        this.cds = cds;
    }

    public List<CD> getCds() {
        return cds;
    }

    public void setCds(List<CD> cds) {
        this.cds = cds;
    }

    public void adicionarCD(CD cd) {
        cds.add(cd);
    }

    public void removerCD(CD cd) {
        cds.remove(cd);
    }
}
