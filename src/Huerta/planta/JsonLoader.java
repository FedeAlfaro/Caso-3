package Huerta.planta;

import java.io.FileReader;
import java.util.ArrayList;
//import org.json.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;



public class JsonLoader {
	private JSONObject jObj;
	ArrayList<SeasonConfig> arraylSeason = new ArrayList<SeasonConfig>();
	ArrayList<PlantConfig> arraylPlanta = new ArrayList<PlantConfig>();
	ArrayList<StageConfig> arraylStage = new ArrayList<StageConfig>();
	
	public JsonLoader() {
		JSONParser parser= new JSONParser();

				try {
					Object obj = parser.parse(new FileReader("JsonHuerta.json")); //JsonHuerta //Ejemplo
					this.jObj = (JSONObject) obj;										
				}catch(Exception e){
					e.printStackTrace();
				}
				
	}
	
	
	
	
	public void cargarPlantas() { 
		
		try {					
			JSONArray Plantas = (JSONArray) jObj.get("Plantas"); 
			for(int i=0; i< Plantas.size(); i++) {
				JSONObject jObj1= (JSONObject) Plantas.get(i);
				
				PlantConfig newConfig = new PlantConfig();

				newConfig.setTipo((String) jObj1.get("Tipo"));
				newConfig.setActNivelAbono((long)jObj1.get("ActNivelAbono"));
				newConfig.setActNivel((long)jObj1.get("ActNivel"));
				newConfig.setActNivelAgua((long) jObj1.get("ActNivelAgua")); 
				newConfig.setActRangeTime((double) jObj1.get("ActRangeTime")); 
				newConfig.setActConsumoAbono((long) jObj1.get("ActConsumoAbono")); 
				newConfig.setActConsumoAgua((long) jObj1.get("ActConsumoAgua")); 
				newConfig.setTiempoParaConsumo((long) jObj1.get("tiempoParaConsumo")); 
				newConfig.setVitalidad((long) jObj1.get("vitalidad"));
				
				JSONArray Stages = (JSONArray) jObj1.get("Stage");
				for(int j=0; j< Plantas.size(); j++) {
					JSONObject jObj2= (JSONObject) Stages.get(i);
					
					StageConfig newConfigS = new StageConfig();
					
					newConfigS.setNivel((long) jObj2.get("Nivel"));
					newConfigS.setMinVitalidad((long)jObj2.get("MinVitalidad"));
					newConfigS.setMaxVitalidad((long)jObj2.get("MaxVitalidad"));
					newConfigS.setRangeTime((double) jObj2.get("RangeTime")); 
					newConfigS.setConsumoAbono((long) jObj2.get("ConsumoAbono")); 
					newConfigS.setConsumoAgua((long) jObj2.get("ConsumoAgua")); 
					newConfigS.setImagen((String) jObj1.get("Imagen")); 
					newConfigS.setImagen2((String) jObj1.get("Imagen2")); 
					newConfigS.setImagen3((String) jObj1.get("Imagen3"));
					
					arraylStage.add(newConfigS);
				}
				newConfig.setStages(arraylStage);
				
				arraylPlanta.add(newConfig);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public void cargarEstaciones() {  
		
		try {					
			JSONArray Seasons = (JSONArray) jObj.get("Seasons"); 
			for(int i=0; i< Seasons.size(); i++) {
				JSONObject jObj1= (JSONObject) Seasons.get(i);
				
				SeasonConfig newConfigS = new SeasonConfig();
				
				newConfigS.setNombre((String) jObj1.get("Nombre"));
				newConfigS.setNivelSolMax((long)jObj1.get("NivelSolM"));
				newConfigS.setNivelSolMin((long)jObj1.get("NivelSolMin"));
				newConfigS.setNivelLluviaMin((long) jObj1.get("NivelLluviaMin")); 
				newConfigS.setNivelLluviaMax((long) jObj1.get("NivelLluviaMax")); 
				newConfigS.setNivelTemperaturaMin((long) jObj1.get("NivelTemperaturaMin")); 
				newConfigS.setNivelTemperaturaMax((long) jObj1.get("NivelTemperaturaMax")); 
							
				arraylSeason.add(newConfigS);
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	
	public ArrayList<PlantConfig> getArraylPlanta(){
		return arraylPlanta;
	}
	
	public ArrayList<SeasonConfig> getArraylSeason(){
		return arraylSeason;
	}
	
	/*
	public ArrayList<ArrayList<String[]>> cargarStages() {
		
		try {					
			JSONArray Plantitas = (JSONArray) jObj.get("Plantas"); 
			for(int i=0; i< Plantitas.size(); i++) {
				JSONObject jObj1= (JSONObject) Plantitas.get(i);
				ArrayList<String[]> arrayStage= new ArrayList<String[]>(); //cantidad de stages
				
				JSONArray Stages = (JSONArray) jObj1.get("Stage");
				for(int j=0; j< Plantitas.size(); j++) {
					JSONObject jObj2= (JSONObject) Stages.get(i);
					
					String arrayStage2[]= new String[9]; //cantidad de atributos del stage
					
					arrayStage2[0]= (String) jObj2.get("Nivel");
					arrayStage2[1]= (String) jObj2.get("MinVitalidad");
					arrayStage2[2]= (String) jObj2.get("MaxVitalidad"); 
					arrayStage2[3]= (String) jObj2.get("RangeTime"); 
					arrayStage2[4]= (String) jObj2.get("ConsumoAbono"); 
					arrayStage2[5]= (String) jObj2.get("ConsumoAgua"); 
					arrayStage2[6]= (String) jObj2.get("Imagen"); 
					arrayStage2[7]= (String) jObj2.get("Imagen2");
					arrayStage2[8]= (String) jObj2.get("Imagen3");
					
					arrayStage.add(arrayStage2) ;
				}
				
				arraylStage.add(arrayStage);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return arraylStage;
	}
	
	
	
	public ArrayList<String[]> cargarPlantas() {
		
		try {					
			JSONArray Plantas = (JSONArray) jObj.get("Plantas"); 
			for(int i=0; i< Plantas.size(); i++) {
				JSONObject jObj1= (JSONObject) Plantas.get(i);
				String arrayPlanta[]= new String[9];
				
				arrayPlanta[0]= (String) jObj1.get("Tipo");
				arrayPlanta[1]= (String) jObj1.get("ActNivelAbono");
				arrayPlanta[2]= (String) jObj1.get("ActNivelAgua"); 
				arrayPlanta[3]= (String) jObj1.get("ActRangeTime"); 
				arrayPlanta[4]= (String) jObj1.get("ActConsumoAbono"); 
				arrayPlanta[5]= (String) jObj1.get("ActConsumoAgua"); 
				arrayPlanta[6]= (String) jObj1.get("tiempoParaConsumo"); 
				arrayPlanta[7]= (String) jObj1.get("vitalidad");
				arrayPlanta[8]= (String) jObj1.get("ActNivel");
				arraylPlanta.add(arrayPlanta);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return arraylPlanta;
	}
	
	public ArrayList<String[]> cargarEstaciones() {  
		
				try {					
					JSONArray Seasons = (JSONArray) jObj.get("Seasons"); 
					for(int i=0; i< Seasons.size(); i++) {
						JSONObject jObj1= (JSONObject) Seasons.get(i);
						String arraySeason[]= new String[7];
						
						arraySeason[0]= (String) jObj1.get("Nombre");
						arraySeason[1]= (String) jObj1.get("NivelSolMax"); 
						arraySeason[2]= (String) jObj1.get("NivelSolMin"); 
						arraySeason[3]= (String) jObj1.get("NivelLluviaMin"); 
						arraySeason[4]= (String) jObj1.get("NivelLluviaMax"); 
						arraySeason[5]= (String) jObj1.get("NivelTemperaturaMin"); 
						arraySeason[6]= (String) jObj1.get("NivelTemperaturaMax"); 
						
						arraylSeason.add(arraySeason);
					}
				}catch(Exception e){
					e.printStackTrace();
				}
		return arraylSeason;
	}
	*/
	
}
