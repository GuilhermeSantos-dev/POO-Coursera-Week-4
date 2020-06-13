import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCarrinhoDeCompras {

	@Test
	public void testeQuantidadeNoCarrinho()
	{
		Produto p = new Produto(12, "Video Game", 1500);
		CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();
		carrinho1.adicionaProduto(p, 5);
		assertEquals(CarrinhoDeCompras.getQuantidadeNoCarrinho(), 5);
		
	}

}
