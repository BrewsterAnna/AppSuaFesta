package testes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import negocio.Cliente;
import negocio.Contato;
import negocio.Contrato;
import negocio.Empresa;
import negocio.Endereco;
import negocio.Servico;
import negocio.Usuario;

public class Testa_4_Contrato {

	public static void main(String[] args) {
		
		Calendar dtContrato = Calendar.getInstance();
	        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");        
	        try {
	        	Date dataC = (Date)df.parse("02/10/2018 12:00");            
	            dtContrato.setTime(dataC);
	           	        	
	        } catch (ParseException erro) {
				erro.printStackTrace();
			} 
	        
        Calendar dtInicio = Calendar.getInstance();
        Calendar dtFim = Calendar.getInstance();
        DateFormat dS = new SimpleDateFormat("dd/MM/yyyy HH:mm");        
        try {
        	Date dataI = (Date)dS.parse("13/05/2019 18:00");            
            dtInicio.setTime(dataI);
            
        	Date dataF = (Date)dS.parse("18/05/2019 12:00");
        	dtFim.setTime(dataF);
        } catch (ParseException erro) {
			erro.printStackTrace();
		} 
	
		String[] teleEmp = {"34352596","969954828"};
		Contato c = new Contato("casafesta@gmail.com", teleEmp);
		Endereco e = new Endereco ("Centro","Niteroi","RJ");
		
		Servico salao = new Servico();
		salao.setDescricao("Salão de festas, piscina e Churrasqueira");
		salao.setDtInicio(dtInicio);
		salao.setDtFim(dtFim);
		salao.setDiaria(200);
		
		List<Servico> servicos = new ArrayList<Servico>();
		servicos.add(salao);
		
		Empresa espacoFesta = new Empresa();
		espacoFesta.setRazaoSocial("Espaço festa ltda");
		espacoFesta.setNomeFantasia("Casa de Festas");
		espacoFesta.setCnpj("59.456.277/0001-76");
		espacoFesta.setAnoFundacao(2010);
		espacoFesta.setContato(c);
		espacoFesta.setEndereco(e);
		espacoFesta.setNovoPrestador(true);
		espacoFesta.setValor(10000);
		espacoFesta.setServicos(servicos);
				
		String[] teleCliente = {"24856409","975747678"};
		Contato cClient = new Contato("maria@gmail.com", teleCliente);
		Endereco eClient = new Endereco ("Centro","Rio de janeiro","RJ");
		
		Cliente maria = new Cliente();
		maria.setContato(cClient);
		maria.setEndereco(eClient);
		maria.setNome("Maria");
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(espacoFesta);
		usuarios.add(maria);
		
		Contrato contrato = new Contrato();
		contrato.setDiasAlugado(5);
		contrato.setDtContrato(dtContrato);
		contrato.setUsuarios(usuarios);
		contrato.exibir();
				
	}

}
