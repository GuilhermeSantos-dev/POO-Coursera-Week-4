
public class ProdutoComTamanho extends Produto {
	
	private int tamanho;
	
	public ProdutoComTamanho(int cod, String nome, float preco, int tamanho) {
		super(cod, nome, preco);
		this.tamanho = tamanho;
	}
	public int hashCode() {
		
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + tamanho;
		
		return result;
	}
	
	public boolean equals(Object objeto) {
		
		if(!(objeto instanceof ProdutoComTamanho)) {
			return false;
		}
		
		Produto outroProduto = (ProdutoComTamanho) objeto;
		
		if(this.hashCode() == outroProduto.hashCode()) {
			return true;
		}
		else { 
			return false;
		}
	}
}
