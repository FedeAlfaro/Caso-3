package Huerta.planta;

import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.JSONObject;


public class Prueba {

	public static void main(String[] args) {
		long pp=12;
		int cc=(int) pp;
		System.out.println(cc);	

		
		JSONObject jObj = null;
		
		
		
		JSONParser parser= new JSONParser();

		try {
			Object obj = parser.parse(new FileReader("JsonHuerta.json")); //JsonHuerta //Ejemplo
			jObj = (JSONObject) obj;										
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		try {					
			JSONArray Plantas = (JSONArray) jObj.get("Plantas"); 
			for(int i=0; i< Plantas.size(); i++) {
				JSONObject jObj1= (JSONObject) Plantas.get(i);
				
				//PlantConfig newConfig = new PlantConfig();

				//newConfig.setTipo((String) jObj1.get("Tipo"));
				//newConfig.setActNivelAbono((Long)jObj1.get("ActNivelAbono"));
				float kk= jObj1.getFloat("ActNivelAbono");
				System.out.println((int) kk+pp);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
			
		
	}

}
