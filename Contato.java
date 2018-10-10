package negocio;

import interfaces.IExibicao;

public class Contato implements IExibicao  {
	private String email;
	private String[] telefones;
	
		
	public void exibir() {
		System.out.printf("# CONTATO #\n"
				+"E-mail: %s\n",
					email
					);
		this.exibirTelefones();
	}
	
	private void exibirTelefones() {
		 System.out.println("Telefones: ");
		 
		 for (String tel : telefones) {
				System.out.printf("%s\n", tel);			
		 }
	}
	public Contato(String email, String[] telefone ) {
		this.email = email;
		this.telefones = telefone;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}