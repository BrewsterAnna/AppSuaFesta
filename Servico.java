package negocio;

import java.util.Calendar;

import auxiliar.Constante;
import interfaces.IExibicao;

public class Servico implements IExibicao {
	
	private float diaria;
	private String descricao;
	private Calendar dtInicio;
	private Calendar dtFim;

	public void exibir() {
				System.out.println("");
		System.out.printf("Descri��o do servi�o: %s\n"
				+"Per�odo de utiliza��o: %s �s %s\n"
				+"Valor di�ria: %.2f\n\n",
				descricao,
				Constante.obterDataHoraFormatada(dtInicio.getTime()),
				Constante.obterDataHoraFormatada(dtFim.getTime()),
				diaria
				);
	}

	public float getDiaria() {
		return diaria;
	}

	public void setDiaria(float diaria) {
		this.diaria = diaria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Calendar getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(Calendar dtInicio) {
		this.dtInicio = dtInicio;
	}

	public Calendar getDtFim() {
		return dtFim;
	}

	public void setDtFim(Calendar dtFim) {
		this.dtFim = dtFim;
	}
}

