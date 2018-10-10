package negocio;
public class Cliente extends Usuario{
	private String nome;
		
	public  void imprimir() {
		super.cabecalho();
		System.out.println("Cliente: "+ nome);
		System.out.printf("\n");
		super.exibir();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
