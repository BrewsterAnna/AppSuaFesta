package testes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import negocio.Contato;
import negocio.Empresa;
import negocio.Endereco;
import negocio.Servico;

public class Testa_1_Empresa {

	public static void main(String[] args) {
		
		String[] teleEmp = {"34352596","969954828"};
		Contato c = new Contato("casafesta@gmail.com", teleEmp);
		Endereco e = new Endereco ("Centro","Niteroi","RJ");
		
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
//		salao.setEmpresa(emp);
				
		Servico buffet = new Servico();
		buffet.setDescricao("Buffet completo");
		buffet.setDtInicio(dtInicio);
		buffet.setDtFim(dtFim);
		buffet.setDiaria(100);
//		buffet.setEmpresa(emp);
		
		
		Servico dj = new Servico();
		dj.setDescricao("DJ com equipamento de som completo");
		dj.setDtInicio(dtInicio);
		dj.setDtFim(dtFim);
		dj.setDiaria(100);
		
		List<Servico> servicos = new ArrayList<Servico>();
		servicos.add(salao);
		servicos.add(buffet);
		servicos.add(dj);		
		
		Empresa emp = new Empresa();
		emp.setRazaoSocial("Espaço festa ltda");
		emp.setNomeFantasia("Casa de Festas");
		emp.setCnpj("59.456.277/0001-76");
		emp.setAnoFundacao(2010);
		emp.setContato(c);
		emp.setEndereco(e);
		emp.setServicos(servicos);
		emp.setNovoPrestador(true);
		emp.setValor(10000);
		emp.imprimir();
	}

}
