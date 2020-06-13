
import static org.junit.Assert.*;
import org.junit.Test;

public class TesteProduto {

	@Test
	public void testeEquals() {
		Produto prod1 = new Produto (2, "Bolacha", 2);
		Produto prod2 = new Produto (2, "Salgadinho", 3);
		assertEquals(prod1.equals(prod2), prod2.equals(prod1));
	}

	
	@Test
	public void testeHashCode()
	{
		Produto prod1 = new Produto(2, "Chocolate", 3);
		Produto prod2 = new Produto(2, "Halls", 2);
		assertEquals(prod1.hashCode(), prod2.hashCode());
		
	}

}