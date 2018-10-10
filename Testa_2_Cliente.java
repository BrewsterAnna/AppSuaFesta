package testes;

import negocio.Cliente;
import negocio.Contato;
import negocio.Endereco;

public class Testa_2_Cliente {

	public static void main(String[] args) {

		String[] teleCliente = {"24856409","975747678"};
		Contato cClient = new Contato("maria@gmail.com", teleCliente);
		Endereco eClient = new Endereco ("Centro","Rio de janeiro","RJ");
		
		Cliente client = new Cliente();
		client.setContato(cClient);
		client.setEndereco(eClient);
		client.setNome("Maria");
		client.imprimir();
	}

}
