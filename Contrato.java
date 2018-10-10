package negocio;

import java.util.Calendar;
import java.util.List;
import auxiliar.Constante;
import interfaces.IExibicao;

public class Contrato implements IExibicao {
	private Calendar dtContrato;
	private int diasAlugado;
	private List<Usuario> usuarios;
	

	public void exibir() {
		System.out.println("# Contrato #");

		System.out.printf("Data do contrato: %s\n"
		+"Dias alugado: %d\n"
		+"Aluguel: %.2f\n"
		+"Taxa administrativa: %.2f\n"
		+"Total: %.2f\n\n",
		Constante.obterDataHoraFormatada(dtContrato.getTime()),
		diasAlugado,
		0f,
		0f,
		0f
		);
		
		exibirUsuario();
	}
	
	public void exibirUsuario() {
		for (Usuario u: usuarios) {
			u.imprimir();
		}
	}
	
	public int getDiasAlugado() {
		return diasAlugado;
	}
	public void setDiasAlugado(int diasAlugado) {
		this.diasAlugado = diasAlugado;
	}
	public Calendar getDtContrato() {
		return dtContrato;
	}
	public void setDtContrato(Calendar dtContrato) {
		this.dtContrato = dtContrato;
	}
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
}
