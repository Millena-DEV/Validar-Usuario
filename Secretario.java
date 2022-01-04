package Validar;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Secretario {

	private String usuario;
	
	
	
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	private  ArrayList <String> horario = new ArrayList<String>();
	


	public  void autenticar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o login");
		String login =sc.nextLine();
		System.out.println("Informe a senha");
		String senha =sc.nextLine();

		if (login.equals("admin") && senha.equals("admin")) {
			System.out.println("Logando");
		} else {
			System.out.println("Usuario ou senha errado");
		}
		
		

	}

	
	
	public void horario() {
		horario.add(usuario);
	}

@SuppressWarnings("unused")
public void logado() {
	
	
	if (Calendar.HOUR_OF_DAY>= 6 && Calendar.HOUR_OF_DAY <= 11.59) {
		System.out.println("Bom dia, você se logou ao nosso sistema.”");
	} else if (Calendar.HOUR_OF_DAY >= 12 && Calendar.HOUR_OF_DAY <= 17.59) {
		System.out.println("Boa tarde, você se logou ao nosso sistema.”");

	} else if (Calendar.HOUR >= 18 && Calendar.HOUR <= 23.59) {
		System.out.println("Boa noite, você se logou ao nosso sistema.”");
	} else if (Calendar.HOUR >= 00 && Calendar.HOUR <= 05.59) {
		System.out.println("Boa madrugada, você se logou ao nosso sistema.”");
	}
	

}


}