package Huerta.planta;

public class SeasonConfig {
	
	private String Nombre;
	private int NivelSolMax;  
	private int NivelSolMin;
	private int NivelLluviaMin;
	private int NivelLluviaMax;
	private int NivelTemperaturaMin;
	private int NivelTemperaturaMax;
	private float Duracion;
	
	
	public float getDuracion() {
		return Duracion;
	}
	public void setDuracion(float duracion) {
		Duracion = duracion;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getNivelSolMax() {
		return NivelSolMax;
	}
	public void setNivelSolMax(int nivelSolMax) {
		NivelSolMax =  nivelSolMax;
	}
	public int getNivelSolMin() {
		return NivelSolMin;
	}
	public void setNivelSolMin(int nivelSolMin) {
		NivelSolMin = nivelSolMin;
	}
	public int getNivelLluviaMin() {
		return NivelLluviaMin;
	}
	public void setNivelLluviaMin(int nivelLluviaMin) {
		NivelLluviaMin = nivelLluviaMin;
	}
	public int getNivelLluviaMax() {
		return NivelLluviaMax;
	}
	public void setNivelLluviaMax(int nivelLluviaMax) {
		NivelLluviaMax =  nivelLluviaMax;
	}
	public int getNivelTemperaturaMin() {
		return NivelTemperaturaMin;
	}
	public void setNivelTemperaturaMin(int nivelTemperaturaMin) {
		NivelTemperaturaMin = nivelTemperaturaMin;
	}
	public int getNivelTemperaturaMax() {
		return NivelTemperaturaMax;
	}
	public void setNivelTemperaturaMax(int nivelTemperaturaMax) {
		NivelTemperaturaMax =  nivelTemperaturaMax;
	}
	

	
}
