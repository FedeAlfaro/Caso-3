package Huerta.planta;

import simulation.Simulator;

import UIController.GardenMainFrameController;
import UIVentana.GardenMainFrame;




public class Huerta {

	
	public static void main(String[] args) {
		StatusManager manager = new StatusManager();
		Simulator sim = new Simulator(manager);
		GardenMainFrameController controller = new GardenMainFrameController(manager);
		GardenMainFrame mygardenwindow = new GardenMainFrame("Garden game", controller);
		sim.addObserver(manager);
		sim.addObserver(controller);
		
		Thread simThread = new Thread(sim);
		simThread.start();
		

		
	
		
	}	

}
