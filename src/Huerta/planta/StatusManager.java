package Huerta.planta;

import java.util.ArrayList;

//import Plant;
import simulation.SimulatorReport;
import utils.*;

public class StatusManager implements IObserver, IConstants {
	private ArrayList<Planta> garden= new ArrayList<Planta>();
	ArrayList<PlantConfig> arraylPlanta;
	ArrayList<Season> Seasons;// = new ArrayList<Season>();
	int ActSeason;
	ArrayList<SeasonConfig> arraylSeason;
	JsonLoader j= new JsonLoader(); //instancia de JsonLoader
	int currentRain;
	int currentSun;
	int currentTemp;
	
	
	public StatusManager() {
		
		j.cargarEstaciones();
		j.cargarPlantas();
		//j.chargeRules();
		arraylPlanta= j.getArraylPlanta();
		arraylSeason= j.getArraylSeason();

		Seasons = new ArrayList<Season>();
		for(int i=0; i< arraylSeason.size(); i++) {
			Season season = new Season(arraylSeason.get(i));
			Seasons.add(season);
		}
		ActSeason= 0; //ActSeason=updateSeason(cantDays);
		currentRain=updateRain(Seasons.get(ActSeason));
		currentSun=updateSun(Seasons.get(ActSeason));
		currentTemp=updateTemperature(Seasons.get(ActSeason));
	}
	


	public ArrayList<PlantConfig> getArraylPlanta() {
		return arraylPlanta;
	}



	public void CrearPlanta(int opcion) {
		if(1<=opcion && opcion<= arraylPlanta.size()) {
			Planta plantita = new Planta(arraylPlanta.get(opcion-1));
			garden.add(plantita);
		}else {
			System.out.println("Opción digitada está fuera de los limites");
		}
	}
	
	
	public void evaluate(int pCurrentDays) {
		updateSeason(pCurrentDays) ;
		currentRain=updateRain(Seasons.get(ActSeason));
		currentSun=updateSun(Seasons.get(ActSeason));
		currentTemp=updateTemperature(Seasons.get(ActSeason));
		for(Planta currentPlant : garden) {
			if(pCurrentDays%currentPlant.getTiempoParaConsumo()==currentPlant.getTiempoParaConsumo()-1) {
				currentPlant.evaluate(currentRain, currentSun, currentTemp);;
			}
		}		
	}
	
	public void updateSeason(int cantDays) {
		int day = cantDays%DAYS_IN_YEARS;
		int nextSeason= (ActSeason+1)%Seasons.size();
		for(int i=0; i<Seasons.size();i++) {
			if(Seasons.get(ActSeason).getDuracion()*DAYS_IN_YEARS < day) {
				ActSeason=nextSeason;
			}
			if(day==0) {
				ActSeason=0;
			}
		}
		System.out.println("Estamos en la estacion: "+Seasons.get(ActSeason).getNombre());
	}
	
	public int updateTemperature(Season season) {
		int tempNow= season.GenerarTemperaturaActual();
		return tempNow;
	}
	
	public int updateSun(Season season) {
		int SunNow= season.GenerarSolActual();
		return SunNow;
	}
	
	public int updateRain(Season season) {
		int RainNow= season.GenerarLluviaActual();
		return RainNow;
	}
	
	public void consumir(int pCurrentDays) {
		for(Planta currentPlant : garden) {
			if(pCurrentDays%currentPlant.getTiempoParaConsumo()==currentPlant.getTiempoParaConsumo()-1) {
				currentPlant.consumir();
			}
		}		
	}
	
	public int getCurrentRain() {
		return currentRain;
	}
	
	
	public int getCurrentSun() {
		return currentSun;
	}

	public int getCurrentTemp() {
		return currentTemp;
	}
	
	public String getCurrentSeason() {
		return Seasons.get(ActSeason).getNombre();
	}
	
	public boolean AddPlant() {
		int contador=0;
		if(garden.size()==0) {
			return true;
		}else{
			for(Planta plantita:garden) {
				if(plantita.getActNivel()==plantita.getStages().size()-1 || !plantita.isViva()) {
					contador++;
				}
			}
		}
		return contador==garden.size();
	}

	@Override
	public void update(Observable o, Object arg) {
		SimulatorReport simReport = (SimulatorReport)arg;
		if (simReport.action.compareTo(UPDATE_DAYS)==0) {
			evaluate(simReport.days);
			consumir(simReport.days);
		}
		/*
		if (simReport.action.compareTo(UPDATE_WEATHER)==0) {
			updateTemperature(ActSeason);
			updateWater(ActSeason);
		}
		*/
	}

	public int getVitaliadad(int i) {
		return garden.get(i).getVitalidad();		
	}

	public int getAgua(int i) {
		return garden.get(i).getActNivelAgua();		
	}
	
	public int getAbono(int i) {
		return garden.get(i).getActNivelAbono();		
	}

	public void regar(int i) {
		garden.get(i).regar();		
	}

	public void abonar(int i) {
		garden.get(i).abonar();		
	}



	public int getGardenSize() {
		return garden.size();
	}



	public String getLastImagen() {
		return garden.get(garden.size()-1).getImagen();
	}



	public int getLastVitalidad() {
		return garden.get(garden.size()-1).getVitalidad();
	}
	
	public int getLastAgua() {
		return garden.get(garden.size()-1).getActNivelAgua();
	}
	
	public int getLastAbono() {
		return garden.get(garden.size()-1).getActNivelAbono();
	}
	
	public String getLastType() {
		return garden.get(garden.size()-1).getTipo();
	}



	public String getImagen(int i) {
		return garden.get(i).getImagen();
	} 
	
}

