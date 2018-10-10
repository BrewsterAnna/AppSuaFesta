package auxiliar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Constante {
	public static final String VERSAO = "1.0.0";
	public static final float TAXA = 0.05f;
	
	public static void VersaoApp() {
		System.out.println("Versão do sistema: "+ VERSAO+"\n");
	}
	
	public static String obterDataHoraFormatada(Date data) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
        return df.format(data);
	}	

}
