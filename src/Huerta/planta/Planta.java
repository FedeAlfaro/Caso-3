package Huerta.planta;

import java.util.ArrayList;

public class Planta {
	String Tipo;
	int ActNivelAbono;
	int ActNivelAgua;
	float ActRangeTime; 
	int ActConsumoAbono;
	int ActConsumoAgua;
	int tiempoParaConsumo; 
	int vitalidad; 
	int ActNivel;
	ArrayList<Stage> Stages; 	
	//String Imagen;
	
	
	public Planta(PlantConfig taylord) {
		Tipo= taylord.getTipo();	
		ActNivelAbono= taylord.getActNivelAbono();  
		ActNivelAgua= taylord.getActNivelAgua();
		ActRangeTime= taylord.getActRangeTime();
		ActConsumoAbono= taylord.getActConsumoAbono();
		ActConsumoAgua= taylord.getActConsumoAgua();
		tiempoParaConsumo= taylord.getTiempoParaConsumo();
		vitalidad= taylord.getVitalidad();
		ActNivel= taylord.getActNivel();
		//Stages= taylord.getStages();
	}
	

	public void imprimirPlanta() {
		System.out.println("Tipo: "+Tipo+"\n"+"ActNivelAbono: "+ActNivelAbono+"\n"+"ActNivelAgua: "+ActNivelAgua+"\n"+"ActRangeTime: "+ ActRangeTime+"\n"+"ActConsumoAbono: "+ActConsumoAbono+"\n"+"ActConsumoAgua: "+ActConsumoAgua+"\n"+"tiempoParaConsumo: "+tiempoParaConsumo+"\n"+"vitalidad: "+vitalidad+"\n"+"ActNivel: "+ActNivel);		
	}
	
	
	
	public String getTipo() {
		return Tipo;
	}



	public void setTipo(String tipo) {
		Tipo = tipo;
	}



	public int getActNivelAbono() {
		return ActNivelAbono;
	}



	public void setActNivelAbono(int actNivelAbono) {
		ActNivelAbono = actNivelAbono;
	}



	public int getActNivelAgua() {
		return ActNivelAgua;
	}



	public void setActNivelAgua(int actNivelAgua) {
		ActNivelAgua = actNivelAgua;
	}



	public float getActRangeTime() {
		return ActRangeTime;
	}



	public void setActRangeTime(float actRangeTime) {
		ActRangeTime = actRangeTime;
	}



	public int getActConsumoAbono() {
		return ActConsumoAbono;
	}



	public void setActConsumoAbono(int actConsumoAbono) {
		ActConsumoAbono = actConsumoAbono;
	}



	public int getActConsumoAgua() {
		return ActConsumoAgua;
	}



	public void setActConsumoAgua(int actConsumoAgua) {
		ActConsumoAgua = actConsumoAgua;
	}



	public int getTiempoParaConsumo() {
		return tiempoParaConsumo;
	}



	public void setTiempoParaConsumo(int tiempoParaConsumo) {
		this.tiempoParaConsumo = tiempoParaConsumo;
	}



	public int getVitalidad() {
		return vitalidad;
	}



	public void setVitalidad(int vitalidad) {
		this.vitalidad = vitalidad;
	}



	public int getActNivel() {
		return ActNivel;
	}



	public void setActNivel(int actNivel) {
		ActNivel = actNivel;
	}



	public ArrayList<Stage> getStages() {
		return Stages;
	}



	public void setStages(ArrayList<Stage> stages) {
		Stages = stages;
	}


/*
	public String getImagen() {
		return Imagen;
	}



	public void setImagen(String imagen) {
		Imagen = imagen;
	}
*/


	public void imprimirPlantaStage() {
		System.out.println("Tipo: "+Tipo+"\n"+"ActNivelAbono: "+ActNivelAbono+"\n"+"ActNivelAgua: "+ActNivelAgua+"\n"+"ActRangeTime: "+ ActRangeTime+"\n"+"ActConsumoAbono: "+ActConsumoAbono+"\n"+"ActConsumoAgua: "+ActConsumoAgua+"\n"+"tiempoParaConsumo: "+tiempoParaConsumo+"\n"+"vitalidad: "+vitalidad+"\n"+"ActNivel: "+ActNivel);		
		for(int i=0; i< Stages.size(); i++) {
			Stages.get(i).imprimirStage();
		} 
		
	}
	
	
	
	
	/*
	public Planta(String[] taylord) {  
		Tipo= taylord[0];
		try {
			ActNivelAbono= Integer.parseInt(taylord[1]);  
			ActNivelAgua= Integer.parseInt(taylord[2]);
			ActRangeTime= Float.parseFloat(taylord[3]);
			ActConsumoAbono= Integer.parseInt(taylord[4]);
			ActConsumoAgua= Integer.parseInt(taylord[5]);
			tiempoParaConsumo= Integer.parseInt(taylord[6]);
			vitalidad= Integer.parseInt(taylord[7]);
			ActNivel= Integer.parseInt(taylord[8]);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	public Planta(String[] taylord, ArrayList<String[]> pStages) {
		Tipo= taylord[0];
		try {
			ActNivelAbono= Integer.parseInt(taylord[1]);  
			ActNivelAgua= Integer.parseInt(taylord[2]);
			ActRangeTime= Float.parseFloat(taylord[3]);
			ActConsumoAbono= Integer.parseInt(taylord[4]);
			ActConsumoAgua= Integer.parseInt(taylord[5]);
			tiempoParaConsumo= Integer.parseInt(taylord[6]);
			vitalidad= Integer.parseInt(taylord[7]);
			ActNivel= Integer.parseInt(taylord[8]);
		}catch(Exception e){
			e.printStackTrace();
		}
		for(int i=0; i< pStages.size(); i++) {
			Stage stage= new Stage(pStages.get(i));
			Stages.add(stage);
		} 
	}
	*/
}
