package testes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import auxiliar.Constante;
import negocio.Contato;
import negocio.Empresa;
import negocio.Endereco;
import negocio.Servico;

public class Testa_3_Servicos {
	public static void main(String[] args) {
				
        Calendar dtInicio = Calendar.getInstance();
        Calendar dtFim = Calendar.getInstance();
        
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");        
        try {
        	Date dataI = (Date)df.parse("13/05/2019 18:00");            
            dtInicio.setTime(dataI);
            
        	Date dataF = (Date)df.parse("18/05/2019 12:00");
        	dtFim.setTime(dataF);
        } catch (ParseException erro) {
			erro.printStackTrace();
		} 

		Servico salao = new Servico();
		salao.setDescricao("Salão de festas, piscina e Churrasqueira");
		salao.setDtInicio(dtInicio);
		salao.setDtFim(dtFim);
		salao.setDiaria(200);
				
		Servico buffet = new Servico();
		buffet.setDescricao("Buffet completo");
		buffet.setDtInicio(dtInicio);
		buffet.setDtFim(dtFim);
		buffet.setDiaria(100);
		buffet.exibir();
		
		Servico dj = new Servico();
		dj.setDescricao("DJ com equipamento de som completo");
		dj.setDtInicio(dtInicio);
		dj.setDtFim(dtFim);
		dj.setDiaria(100);
		dj.exibir();
				
	}
}

