import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {

	private Map<Produto, Integer> carrinhoDeCompras = new HashMap<>();
	private static int qtdProdutos;
	private static double total = 0;
	
	public void adicionaProduto(Produto p, int quantidade) {
		if(carrinhoDeCompras.containsKey(p)) {
			carrinhoDeCompras.put(p, quantidade += quantidade);
		}
		else {
			carrinhoDeCompras.put(p, quantidade);
			qtdProdutos += quantidade;
		}
	}
	
	public void removerProduto(Produto p, int quantidade) {
		if(carrinhoDeCompras.containsKey(p)) {
			carrinhoDeCompras.remove(p);
			qtdProdutos -= quantidade;
		}
	}
	
	public double calculaPreco() {
		for (Produto p : carrinhoDeCompras.keySet()) {
			total = p.getPreco() * qtdProdutos;
		}
		return total;
	}
	
	public HashMap<Produto, Integer> getCarrinho() {
		return (HashMap<Produto, Integer>) carrinhoDeCompras;
	}

	public void setCarrinho(HashMap<Produto, Integer> carrinhoDeCompras) {
		this.carrinhoDeCompras = carrinhoDeCompras;
	}

	public static int getQuantidadeNoCarrinho() {
		return qtdProdutos;
	}

	public static void setQuantidadeNoCarrinho(int quantidadeDeProdutos) {
		CarrinhoDeCompras.qtdProdutos = quantidadeDeProdutos;
	}	
}
