package Huerta.planta;

import java.io.FileReader;
import java.util.ArrayList;
//import org.json.*;
import org.json.simple.parser.JSONParser;

import utils.IConstants;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;



public class JsonLoader implements IConstants{
	private JSONObject jObj;
	ArrayList<SeasonConfig> arraylSeason = new ArrayList<SeasonConfig>();
	ArrayList<PlantConfig> arraylPlanta = new ArrayList<PlantConfig>();
	
	
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
				newConfig.setActNivelAbono(((Number)jObj1.get("ActNivelAbono")).intValue());
				newConfig.setActNivel(((Number)jObj1.get("ActNivel")).intValue());
				newConfig.setActNivelAgua(((Number) jObj1.get("ActNivelAgua")).intValue()); 
				newConfig.setActRangeTime(((Number) jObj1.get("ActRangeTime")).floatValue()); 
				newConfig.setActConsumoAbono(((Number) jObj1.get("ActConsumoAbono")).intValue()); 
				newConfig.setActConsumoAgua(((Number) jObj1.get("ActConsumoAgua")).intValue()); 
				newConfig.setTiempoParaConsumo(((Number) jObj1.get("tiempoParaConsumo")).intValue()); 
				newConfig.setMaxAgua(((Number) jObj1.get("MaxAgua")).intValue());
				newConfig.setMaxAbono(((Number) jObj1.get("MaxAbono")).intValue());
				newConfig.setMinAgua(((Number) jObj1.get("MinAgua")).intValue());
				newConfig.setMinAbono(((Number) jObj1.get("MinAbono")).intValue());
				newConfig.setVitalidad(((Number) jObj1.get("vitalidad")).intValue());
				
				JSONArray Stages = (JSONArray) jObj1.get("Stage");
				
				ArrayList<StageConfig> arraylStage = new ArrayList<StageConfig>();
				for(int j=0; j< Stages.size(); j++) {
					JSONObject jObj2= (JSONObject) Stages.get(j);
					
					StageConfig newConfigS = new StageConfig();
					
					newConfigS.setNivel(((Number) jObj2.get("Nivel")).intValue());
					newConfigS.setMinTemp(((Number)jObj2.get("MinTemp")).intValue());
					newConfigS.setMaxTemp(((Number)jObj2.get("MaxTemp")).intValue());
					newConfigS.setMinSol(((Number)jObj2.get("MinSol")).intValue());
					newConfigS.setMaxSol(((Number)jObj2.get("MaxSol")).intValue());
					newConfigS.setMinLluvia(((Number)jObj2.get("MinLluvia")).intValue());
					newConfigS.setMaxLuvia(((Number)jObj2.get("MaxLuvia")).intValue());
					newConfigS.setRangeTime(((Number) jObj2.get("RangeTime")).floatValue()); 
					newConfigS.setConsumoAbono(((Number) jObj2.get("ConsumoAbono")).intValue()); 
					newConfigS.setConsumoAgua(((Number) jObj2.get("ConsumoAgua")).intValue()); 
					newConfigS.setImagen((String) jObj2.get("Imagen")); 
					newConfigS.setImagen2((String) jObj2.get("Imagen2")); 
					newConfigS.setImagen3((String) jObj2.get("Imagen3"));
					
					arraylStage.add(newConfigS);
					
					/*
					System.out.println("Nivel: "+ ((Number) jObj2.get("Nivel")).intValue());
					System.out.println("MinTemp: "+((Number)jObj2.get("MinTemp")).intValue());
					System.out.println("MaxTemp: "+((Number)jObj2.get("MaxTemp")).intValue());
					System.out.println("MinSol: "+((Number)jObj2.get("MinSol")).intValue());
					System.out.println("MaxSol: "+((Number)jObj2.get("MaxSol")).intValue());
					System.out.println("MinLluvia: "+((Number)jObj2.get("MinLluvia")).intValue());
					System.out.println("MaxLuvia: "+((Number)jObj2.get("MaxLuvia")).intValue());
					System.out.println("RangeTime: "+((Number) jObj2.get("RangeTime")).floatValue());
					System.out.println("ConsumoAbono: "+((Number) jObj2.get("ConsumoAbono")).intValue());
					System.out.println("ConsumoAgua: "+((Number) jObj2.get("ConsumoAgua")).intValue());
					System.out.println("Imagen: "+(String) jObj2.get("Imagen"));
					System.out.println("Imagen2: "+(String) jObj2.get("Imagen2"));
					System.out.println("Imagen3: "+(String) jObj2.get("Imagen3"));
					*/
					
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
				newConfigS.setNivelSolMax(((Number)jObj1.get("NivelSolMax")).intValue());
				newConfigS.setNivelSolMin(((Number)jObj1.get("NivelSolMin")).intValue());
				newConfigS.setNivelLluviaMin(((Number) jObj1.get("NivelLluviaMin")).intValue()); 
				newConfigS.setNivelLluviaMax(((Number) jObj1.get("NivelLluviaMax")).intValue()); 
				newConfigS.setNivelTemperaturaMin(((Number) jObj1.get("NivelTemperaturaMin")).intValue()); 
				newConfigS.setNivelTemperaturaMax(((Number) jObj1.get("NivelTemperaturaMax")).intValue()); 
				newConfigS.setDuracion(((Number) jObj1.get("Duracion")).floatValue()); 
							
				arraylSeason.add(newConfigS);
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	
	/*
	public void chargeRules() {  
		try {					
			JSONObject rules = (JSONObject) jObj.get("Rules"); 
			utils.IConstants.DAYS_IN_YEARS = ((Number) rules.get("DaysInYears")).intValue();
			utils.IConstants.DAY_IN_MILLIS = ((Number) rules.get("DayInMillis")).intValue();
			utils.IConstants.ABONO_USER = ((Number) rules.get("Abono")).intValue();
			utils.IConstants.RIEGO_USER = ((Number) rules.get("Riego")).intValue();
			utils.IConstants.CAMBIO_VITALIDAD = ((Number) rules.get("CambioVitalidad")).intValue();
			utils.IConstants.VITALIDAD_ENFERMA= ((Number) rules.get("VitalidadEnferma")).intValue();
			utils.IConstants.VITALIDAD_MAXIMA = ((Number) rules.get("VitalidadMaxima")).intValue();
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	*/
	
	public ArrayList<PlantConfig> getArraylPlanta(){
		return arraylPlanta;
	}
	
	public ArrayList<SeasonConfig> getArraylSeason(){
		return arraylSeason;
	}
	
	
	
}
