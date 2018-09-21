package view;

import java.util.List;

import controlador.GerarRelatorioController;
import model.Candidato;

public class GerarRelatorioView {

	
	public static void main(String[] args) {
		
		GerarRelatorioController gr = new GerarRelatorioController();
		
		List<Candidato> candidatos = gr.gerarRelatorioAction();
		
		
		
		
	}
}
