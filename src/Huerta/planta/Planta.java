package Huerta.planta;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

import utils.IConstants;

public class Planta implements IConstants{
	boolean viva= true;
	private LocalTime bornTime;
	String Type;
	int ActNivelAbono;
	int ActNivelAgua;
	float ActRangeTime; 
	int ActConsumoAbono;
	int ActConsumoAgua;
	int tiempoParaConsumo; //quitar y meter en reglas
	int vitalidad; 
	int ActNivel;
	int MaxAgua;
	int MinAgua;
	int MaxAbono;
	int MinAbono;
	ArrayList<Stage> Stages; 
	Stage ActStage; 
	String Imagen;
	
	public Planta(PlantConfig taylord) {
		Type= taylord.getTipo();	
		ActNivelAbono= taylord.getActNivelAbono();  
		ActNivelAgua= taylord.getActNivelAgua();
		ActRangeTime= taylord.getActRangeTime();
		ActConsumoAbono= taylord.getActConsumoAbono();
		ActConsumoAgua= taylord.getActConsumoAgua();
		tiempoParaConsumo= taylord.getTiempoParaConsumo(); //quitar y meter en reglas
		vitalidad= taylord.getVitalidad();
		ActNivel= taylord.getActNivel();
		Stages= taylord.getStages();
		MaxAgua= taylord.getMaxAgua();
		MinAgua= taylord.getMinAgua();
		MaxAbono= taylord.getMaxAbono();
		MinAbono= taylord.getMinAgua();
		ActStage= Stages.get(1);
		bornTime=LocalTime.now();
		Imagen= ActStage.getImagen2();
	}
	

	public void imprimirPlanta() {
		System.out.println("Tipo: "+Type+"\n"+"ActNivelAbono: "+ActNivelAbono+"\n"+"ActNivelAgua: "+ActNivelAgua+"\n"+"ActRangeTime: "+ ActRangeTime+"\n"+"ActConsumoAbono: "+ActConsumoAbono+"\n"+"ActConsumoAgua: "+ActConsumoAgua+"\n"+"tiempoParaConsumo: "+tiempoParaConsumo+"\n"+"vitalidad: "+vitalidad+"\n"+"ActNivel: "+ActNivel);		
	}
	
	
	
	public String getTipo() {
		return Type;
	}



	public void setTipo(String tipo) {
		Type = tipo;
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


	public void imprimirPlantaStage() {
		if(viva) {
			System.out.println("Tipo: "+Type+"\n"+"ActNivelAbono: "+ActNivelAbono+"\n"+"ActNivelAgua: "+ActNivelAgua+"\n"+"ActRangeTime: "+ ActRangeTime+"\n"+"ActConsumoAbono: "+ActConsumoAbono+"\n"+"ActConsumoAgua: "+ActConsumoAgua+"\n"+"tiempoParaConsumo: "+tiempoParaConsumo+"\n"+"vitalidad: "+vitalidad+"\n"+"ActNivel: "+ActNivel);		
			for(int i=0; i< Stages.size(); i++) {
				Stages.get(i).imprimirStage();
			} 
		}else {
			System.out.println("La planta está en un lugar mejor, dentro del más allá, la recordaremos con aprecio, un ciclo de fetch de silencio por nuestra querida plantita");
		}
	}
	
	
	public int calcularAgua(int ActTemp, int ActLluvia) {
		if(ActTemp>ActStage.getMaxTemp()) {
			ActNivelAgua-= RIEGO_USER/2;
		}else if(ActStage.getMinTemp()>ActTemp ) {
			ActNivelAgua-= RIEGO_USER/2;
		}
		if(ActLluvia>ActStage.getMaxLluvia()) {
			ActNivelAgua+= RIEGO_USER/2;
		}else if(ActStage.getMaxLluvia()>ActLluvia ) {
			ActNivelAgua-= RIEGO_USER/2;
		}
		return ActNivelAgua;
	}
	
	public int calcularAbono(int ActSol) {
		if(ActSol>ActStage.getMaxSol()) {
			ActNivelAbono+= ABONO_USER/2;
		}else if(ActStage.getMinSol()>ActSol ) {
			ActNivelAbono-= ABONO_USER/2;
		}
		return ActNivelAbono;
	}
	
	public int calcularVitalidad() {
		if(viva) {
			if(ActNivelAbono>MaxAbono || ActNivelAbono<MinAbono ) {
				vitalidad-=CAMBIO_VITALIDAD;
				System.out.println("La planta "+Type+" necesita abono");
			}
			if(ActNivelAgua>MaxAgua || ActNivelAgua<MinAgua){
				vitalidad-=CAMBIO_VITALIDAD;
				System.out.println("La planta "+Type+" necesita agua");
			}
			if(!(ActNivelAbono>MaxAbono || ActNivelAbono<MinAbono )&&!(ActNivelAgua>MaxAgua || ActNivelAgua<MinAgua)) {
				vitalidad+=CAMBIO_VITALIDAD;
				if(VITALIDAD_MAXIMA<vitalidad) {
					vitalidad=100;
				}
			}
		}
		return vitalidad;
	}
	
	public void abonar() {
		ActNivelAbono+=ABONO_USER;
	}
	
	public void regar() {
		ActNivelAgua+=RIEGO_USER;
	}
	
	public void ElegirImagen() {
		if(ActNivelAgua<= MinAgua && vitalidad<=VITALIDAD_ENFERMA) {
			Imagen= ActStage.getImagen3();
		}else if(ActNivelAgua > MinAgua && vitalidad<=VITALIDAD_ENFERMA) {
			Imagen= ActStage.getImagen2();
		}else {
			Imagen= ActStage.getImagen();
		}
	}
	
	
	public void calcularCambioStage() {
		if(viva){
			if(vitalidad>0){
				if(ActNivel<Stages.size()-1){
					int dayPass = (int)ChronoUnit.MILLIS.between(bornTime, LocalTime.now()) / DAY_IN_MILLIS;
					if( (dayPass> ActRangeTime && vitalidad>VITALIDAD_ENFERMA) && (ActNivelAgua>0 && ActNivelAbono>0)){
						ActNivel++;
						ActStage=Stages.get(ActNivel);
						System.out.println("La planta "+ Type +" subió a nivel: "+ ActStage.getNivel());
					}
					ActConsumoAbono= ActStage.getConsumoAbono();
					ActNivelAgua= ActStage.getConsumoAgua();
					ActRangeTime= ActStage.getRangeTime();
				}
			}else{
				System.out.println("--------------------------------------------------------------------------------------------");
				ActNivel=0;
				ActStage=Stages.get(ActNivel);
				ActConsumoAbono= ActStage.getConsumoAbono();
				ActNivelAgua= ActStage.getConsumoAgua();
				ActRangeTime= ActStage.getRangeTime();
				viva=false;
				System.out.println("La planta está en un lugar mejor, dentro del más allá, la recordaremos con aprecio, un ciclo de fetch de silencio por nuestra querida plantita");
			}
		}
	}
	
	
	
	public String getImagen() {
		return Imagen;
	}


	public boolean isViva() {
		return viva;
	}


	public void evaluate(int pLluvia, int pSol, int pTemp){
		if(viva){
			calcularCambioStage();
			calcularAgua(pTemp, pLluvia);
			calcularAbono( pSol);
			System.out.println("La vitalidad es de: "+calcularVitalidad());
			ElegirImagen();
		}
	}
	
	public void consumir() {
		ActNivelAbono-= ActConsumoAbono;
		ActNivelAgua-= ActConsumoAgua;
	}
	
//-------------------termina clase	
}
