package negocio;

public abstract class Usuario {
	
	private Contato contato;
	private Endereco endereco;
	
	public abstract void imprimir();
	
	protected final void cabecalho() {
		System.out.println("# USUÁRIO #");
	}
	
	public void exibir() {
		contato.exibir();
		endereco.exibir();
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
