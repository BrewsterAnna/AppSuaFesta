package testes;

import negocio.Contato;

public class Testa_6_Contato {

	public static void main(String[] args) {
		String[] teleEmp = {"34352596","969954828"};
		Contato c = new Contato("casafesta@gmail.com", teleEmp);
		c.exibir();

	}

}
