package controlador;


import model.CandidatoModel;

public class RegistrarVotoController {

	private CandidatoModel cm = new CandidatoModel();
	
	
	public void registrarVotoAction(int numero) {
		
		cm.registraVoto(numero);
		
		// va para tela de confirmação		
		
	}
}
