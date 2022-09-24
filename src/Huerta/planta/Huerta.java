package Huerta.planta;

import java.util.*;




public class Huerta {

	
	public static void main(String[] args) {
		ArrayList<Season> Seasons = new ArrayList<Season>(); //Todas las estaciones existentes	
		ArrayList<Planta> Plantas = new ArrayList<Planta>();
		ArrayList<PlantConfig> arraylPlanta;
		ArrayList<SeasonConfig> arraylSeason;
		
		JsonLoader j= new JsonLoader(); //instancia de JsonLoader
		
		j.cargarEstaciones();
		j.cargarPlantas();
		arraylPlanta= j.getArraylPlanta();
		arraylSeason= j.getArraylSeason();
		
		Scanner lectura = new Scanner (System.in);
		System.out.println("Elija una opción:\n0 para cilantro\n1 para cactus \n2 para rabano");
		int opcion = lectura.nextInt();
		if(0<=opcion && opcion< arraylPlanta.size()) {
			Planta plantita = new Planta(arraylPlanta.get(opcion));
			plantita.imprimirPlanta();
			Plantas.add(plantita);
		}
		
		
		
		
		
		
		/*
		ArrayList<String[]> estaciones= j.cargarEstaciones(); //crea/carga todas las estaciones y las mete en Seasons
		for(int i=0; i< estaciones.size(); i++) {
			Season estacion= new Season(estaciones.get(i));
			Seasons.add(estacion);
		}
		
	
		for(int i=0; i< Seasons.size(); i++) { //imprime todas las estaciones
			Seasons.get(i).imprimirSeason();
			System.out.print("\n");
		}
		
		
		
		ArrayList<String[]> Plantitas= j.cargarPlantas(); //crea/carga todas las plantas y las mete en Plantas
		for(int i=0; i< Plantitas.size(); i++) {
			Planta planta= new Planta(Plantitas.get(i));
			Plantas.add(planta);
		}
		
		
		for(int f=0; f< Plantas.size(); f++) { //imprime todas las estaciones
			Plantas.get(f).imprimirPlanta();
			System.out.print("\n");
		}
		
		
		ArrayList<ArrayList<String[]>> Estados= j.cargarStages(); //crea/carga todas los stages y las mete en Estados
		for(int i=0; i< Plantitas.size(); i++) {
			Planta planta= new Planta(Plantitas.get(i), Estados.get(i));
			Plantas.add(planta);
		}
		
		*/
	
		
	}

	

}
