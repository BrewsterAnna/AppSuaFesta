package negocio;

import interfaces.IExibicao;

public class Endereco implements IExibicao {
	private String bairro;
	private String cidade;
	private String uf;
	
	public void exibir() {
		System.out.printf(
				"Endereço: %s, %s, %s \n\n",
				bairro,
				cidade,
				uf
				);
	}
	
	public Endereco(String bairro, String cidade, String uf) {
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
	}
}