public class Produto {

	private String nome;
	private int cod;
	private float preco;
	
	
	public Produto(int cod, String nome, float preco) {
		
		this.cod = cod;
		this.nome = nome;
		this.preco = preco;
		
	}
	@Override
	public boolean equals(Object objeto) {
		
		Produto outroProduto = (Produto) objeto;
		
		if(!(objeto instanceof Produto))
			return false;

		if(this.hashCode() == outroProduto.hashCode()) 
			return true;
		else
			return false;
	}
	@Override
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		result = prime * result + cod;
		
		return result;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCodigo() {
		return cod;
	}


	public void setCodigo(int cod) {
		this.cod = cod;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}
	
}
