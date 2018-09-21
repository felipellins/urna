package controlador;

import java.util.List;

import model.Candidato;
import model.CandidatoModel;

public class GerarRelatorioController {

	CandidatoModel cm = new CandidatoModel();
	
	public List<Candidato> gerarRelatorioAction(){
		
		
		return cm.getCandidatos();
	}
	
}
