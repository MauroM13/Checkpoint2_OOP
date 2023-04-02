import java.time.LocalDate;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    private static Venda venda;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        // Instanciando CDs
        CD cd1 = new CD("Let It Be", "The Beatles", "Rock", 10);
        CD cd2 = new CD("Thriller", "Michael Jackson", "Pop", 15);
        CD cd3 = new CD("The Dark Side of the Moon", "Pink Floyd", "Rock", 5);

        // Instanciando clientes
        Cliente cliente1 = new Cliente("João", "Rua A, 123", "(11) 99999-9999");
        Cliente cliente2 = new Cliente("Maria", "Rua B, 456", "(11) 88888-8888");
        Cliente cliente3 = new Cliente("Pedro", "Rua C, 789", "(11) 77777-7777");

        // Instanciando locações
        Locacao locacao1 = new Locacao(LocalDate.now(), LocalDate.now().plusDays(7), cd1);
        Locacao locacao2 = new Locacao(LocalDate.now(), LocalDate.now().plusDays(5), cd2);
        Locacao locacao3 = new Locacao(LocalDate.now(), LocalDate.now().plusDays(3), cd3);

        // Instanciando vendas
        Venda venda1 = new Venda(LocalDate.now(), 50.0);
        venda1.adicionarCD(cd1);
        venda1.adicionarCD(cd2);
        Venda venda2 = new Venda(LocalDate.now(), 30.0);
        venda2.adicionarCD(cd3);
        Venda venda3 = new Venda(LocalDate.now(), 20.0);
        venda3.adicionarCD(cd1);

        // Instanciando estoque
        Estoque estoque;
        estoque = new Estoque();
        estoque.adicionarCD(cd1);
        estoque.adicionarCD(cd2);
        estoque.adicionarCD(cd3);

        // Adicionando locações e vendas aos clientes
        cliente1.adicionarLocacao(locacao1);
        cliente1.adicionarCompra(venda1);
        cliente2.adicionarLocacao(locacao2);
        cliente2.adicionarCompra(venda2);
        cliente3.adicionarLocacao(locacao3);
        cliente3.adicionarCompra(venda3);

        // Imprimindo informações
        out.println("CDs no estoque:");
        for (CD cd : estoque.getCds()) {
            out.println("- " + cd.getTitulo() + " (" + cd.getArtista() + ") - " + cd.getGenero() + " - " + cd.getQtdDisponivel() + " unidades");
        }

        out.println("\nClientes:");
        out.println(cliente1.getNome() + " - " + cliente1.getEndereco() + " - " + cliente1.getTelefone());
        out.println("Histórico de locações:");
        for (Locacao locacao : cliente1.getHistoricoLocacoes()) {
            out.println("- " + locacao.getCd().getTitulo() + " (" + locacao.getCd().getArtista() + ") - " + locacao.getDataLocacao() + " a " + locacao.getDataDevolucao());

            out.println("Histórico de compras:");
            cliente1.getHistoricoCompras().forEach(venda);
            out.println("- " + venda.getDataVenda() + " - R$");
            for (Venda venda : cliente1.getHistoricoCompras()) {
                double totalCompra = venda.getValorTotal();
                out.println("- " + venda.getDataVenda() + " - R$" + totalCompra);
            }
        }
    }}