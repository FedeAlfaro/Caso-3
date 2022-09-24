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
	public void setActNivelAbono(int actNivelAbono) {
		ActNivelAbono =  actNivelAbono;
	}
	public int getActNivelAgua() {
		return ActNivelAgua;
	}
	public void setActNivelAgua(int actNivelAgua) {
		ActNivelAgua =  actNivelAgua;
	}
	public float getActRangeTime() {
		return ActRangeTime;
	}
	public void setActRangeTime(float actRangeTime) {
		ActRangeTime =  actRangeTime;
	}
	public int getActConsumoAbono() {
		return ActConsumoAbono;
	}
	public void setActConsumoAbono(int actConsumoAbono) {
		ActConsumoAbono =  actConsumoAbono;
	}
	public int getActConsumoAgua() {
		return ActConsumoAgua;
	}
	public void setActConsumoAgua(int actConsumoAgua) {
		ActConsumoAgua =  actConsumoAgua;
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
	public ArrayList<StageConfig> getStages() {
		return Stages;
	}
	public void setStages(ArrayList<StageConfig> stages) {
		Stages = stages;
	}
	
	
	
	
	
}
