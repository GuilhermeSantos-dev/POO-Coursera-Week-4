import static org.junit.Assert.*;

import org.junit.Test;

public class TesteProdutoComTamanho {

	@Test
	public void testeEquals() {

			Produto prod1 = new ProdutoComTamanho(1, "Chinelo", 10, 40);
			Produto prod2 = new ProdutoComTamanho(1, "Cortina", 20, 2);
			assertEquals(prod1.equals(prod2), prod2.equals(prod1));
	}
	
	@Test
	public void testeHashCode()
	{
		Produto prod1 = new ProdutoComTamanho(1, "Calça", 40, 40);
		Produto prod2 = new ProdutoComTamanho(1, "Tênis", 100, 40);
		assertEquals(prod1.hashCode(), prod2.hashCode());
		
	}
}
