import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeComprasImpl implements CarrinhoDeCompras {
    private List<Vendavel> vendaveis = new ArrayList<>();

    @Override
    public void adicionarVendavel(Vendavel vendavel) {
        vendaveis.add(vendavel);
    }

    @Override
    public double getTotal() {
        double total = 0;
        for (Vendavel vendavel : vendaveis) {
            total += vendavel.getPreco();
        }
        return total;
    }
}
