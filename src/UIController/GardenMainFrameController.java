package UIController;

import Huerta.planta.PlantConfig;
import Huerta.planta.StatusManager;
import UIVentana.GardenMainFrame;
import simulation.SimulatorReport;
import utils.IObserver;
import utils.Observable;

public class GardenMainFrameController implements IObserver{//implements IObserver{
	private GardenMainFrame controlledFrame;
	private StatusManager manager;
	
	
	public GardenMainFrameController(StatusManager pManager) {
		this.manager = pManager;
	}
	
	public void setWindow(GardenMainFrame pFrame) {
		controlledFrame = pFrame;
		int contador=1;
		for(PlantConfig plantita:manager.getArraylPlanta()) {
			controlledFrame.AddPlantBottons(plantita.getTipo(), contador, (contador-1)*115);
			contador++;
		}
		
	}
	
	public void AddPlant() {
		if(manager.AddPlant()) {	
			int opcion=controlledFrame.AddPlant();
			this.manager.CrearPlanta(opcion);
			String pImagen=manager.getLastImagen();
			String pType=manager.getLastType();
			int pVitalidad=manager.getLastVitalidad();
			int pAbono=manager.getLastAbono(); 
			int pAgua=manager.getLastAgua();
			controlledFrame.insertPlant(pImagen, 300, pType, pVitalidad, pAbono, pAgua);
		}
	}
	
	
	public void update(Observable o, Object arg) {
		SimulatorReport simReport = (SimulatorReport)arg;
		controlledFrame.setActualValues(simReport.Rain,simReport.Temperature,simReport.Sun,simReport.days, simReport.Season);
		setImagen();
		setVitalidad();
		setAgua();
		setAbono();
		AddPlant();
	}

	public void Regar(int i) {
		manager.regar(i);
		
	}
	
	public void Abonar(int i) {
		manager.abonar(i);
		
	}

	public void setVitalidad() {
		for(int i=0; i<manager.getGardenSize();i++) {
			controlledFrame.cambiarVitalidad(getVitalidad(i),i);
		}
	}
	
	public void setAgua() {
		for(int i=0; i<manager.getGardenSize();i++) {
			controlledFrame.cambiarAgua(getAgua(i),i);
		}
	}
	
	public void setAbono() {
		for(int i=0; i<manager.getGardenSize();i++) {
			controlledFrame.cambiarAbono(getAbono(i),i);
		}
	}
	
	public void setImagen() {
		for(int i=0; i<manager.getGardenSize();i++) {
			controlledFrame.cambiarImagen(getImagen(i),i);
		}
	}
	
	private String getImagen(int i) {
		return manager.getImagen(i);
	}

	public int getVitalidad(int i) {
		return manager.getVitaliadad(i);
	}
	
	public int getAgua(int i) {
		return manager.getAgua(i);
	}
	
	public int getAbono(int i) {
		return manager.getAbono(i);
	}
}
