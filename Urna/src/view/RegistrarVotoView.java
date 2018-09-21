package view;

import java.util.Scanner;

import controlador.RegistrarVotoController;

public class RegistrarVotoView {

	
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o numero do seu candidato:");
		
		int numero = s.nextInt();
		
		RegistrarVotoController contr = new RegistrarVotoController();
		contr.registrarVotoAction(numero);
		
		
	}	
}
