package Huerta.planta;

import java.util.ArrayList;

public class PlantConfig {
	String Tipo;
	int ActNivelAbono;
	int ActNivelAgua;
	float ActRangeTime; 
	int ActConsumoAbono;
	int ActConsumoAgua;
	int tiempoParaConsumo; 
	int vitalidad; 
	int ActNivel;
	ArrayList<StageConfig> Stages;
	
	
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public int getActNivelAbono() {
		return ActNivelAbono;
	}
	public void setActNivelAbono(long actNivelAbono) {
		ActNivelAbono = (int) actNivelAbono;
	}
	public int getActNivelAgua() {
		return ActNivelAgua;
	}
	public void setActNivelAgua(long actNivelAgua) {
		ActNivelAgua = (int) actNivelAgua;
	}
	public float getActRangeTime() {
		return ActRangeTime;
	}
	public void setActRangeTime(double actRangeTime) {
		ActRangeTime = (float) actRangeTime;
	}
	public int getActConsumoAbono() {
		return ActConsumoAbono;
	}
	public void setActConsumoAbono(long actConsumoAbono) {
		ActConsumoAbono = (int) actConsumoAbono;
	}
	public int getActConsumoAgua() {
		return ActConsumoAgua;
	}
	public void setActConsumoAgua(long actConsumoAgua) {
		ActConsumoAgua = (int) actConsumoAgua;
	}
	public int getTiempoParaConsumo() {
		return tiempoParaConsumo;
	}
	public void setTiempoParaConsumo(long tiempoParaConsumo) {
		this.tiempoParaConsumo = (int) tiempoParaConsumo;
	}
	public int getVitalidad() {
		return vitalidad;
	}
	public void setVitalidad(long vitalidad) {
		this.vitalidad = (int) vitalidad;
	}
	public int getActNivel() {
		return ActNivel;
	}
	public void setActNivel(long actNivel) {
		ActNivel = (int) actNivel;
	}
	public ArrayList<StageConfig> getStages() {
		return Stages;
	}
	public void setStages(ArrayList<StageConfig> stages) {
		Stages = stages;
	}
	
	
	
	
	
}
