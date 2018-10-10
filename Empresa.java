package negocio;

import java.util.List;

public class Empresa extends Usuario {
	
	private String razaoSocial;
	private String nomeFantasia;
	private String cnpj;
	private int anoFundacao;
	private boolean novoPrestador;
	private float capital;
	private List<Servico> servicos;
		
	private String novoPrestador() {
		return novoPrestador ? "Sim": "Não";
	}		
	public void imprimir() {
		super.cabecalho();
		System.out.printf("Empresa: %s"
				+" (%s) \n"
				+"Cnpj: %s\n"
				+"Ano de fundação: %d\n"
				+"capital: %.0f\n"
				+"Novo prestador? %s\n\n",
				nomeFantasia,
				razaoSocial,
				cnpj,
				anoFundacao,
				capital,
				novoPrestador()
				);
		super.exibir();
		System.out.println("Serviços Cadastrados: ");
		exibirServico();
	}
	
	public void exibirServico() {
		for (Servico s: servicos) {
			s.exibir();
		}
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public boolean isNovoPrestador() {
		return novoPrestador;
	}

	public void setNovoPrestador(boolean novoPrestador) {
		this.novoPrestador = novoPrestador;
	}

	public float getValor() {
		return capital;
	}

	public void setValor(float valor) {
		this.capital = valor;
	}
	public int getAnoFundacao() {
		return anoFundacao;
	}
	public void setAnoFundacao(int anoFundacao) {
		this.anoFundacao = anoFundacao;
	}
	public float getCapital() {
		return capital;
	}
	public void setCapital(float capital) {
		this.capital = capital;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public List<Servico> getServicos() {
		return servicos;
	}
	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}
}
