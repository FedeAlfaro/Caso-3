package Huerta.planta;

public class SeasonConfig {
	
	private String Nombre;
	private int NivelSolMax;  
	private int NivelSolMin;
	private int NivelLluviaMin;
	private int NivelLluviaMax;
	private int NivelTemperaturaMin;
	private int NivelTemperaturaMax;
	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getNivelSolMax() {
		return NivelSolMax;
	}
	public void setNivelSolMax(long nivelSolMax) {
		NivelSolMax = (int) nivelSolMax;
	}
	public int getNivelSolMin() {
		return NivelSolMin;
	}
	public void setNivelSolMin(long nivelSolMin) {
		NivelSolMin = (int) nivelSolMin;
	}
	public int getNivelLluviaMin() {
		return NivelLluviaMin;
	}
	public void setNivelLluviaMin(long nivelLluviaMin) {
		NivelLluviaMin = (int) nivelLluviaMin;
	}
	public int getNivelLluviaMax() {
		return NivelLluviaMax;
	}
	public void setNivelLluviaMax(long nivelLluviaMax) {
		NivelLluviaMax = (int) nivelLluviaMax;
	}
	public int getNivelTemperaturaMin() {
		return NivelTemperaturaMin;
	}
	public void setNivelTemperaturaMin(long nivelTemperaturaMin) {
		NivelTemperaturaMin = (int) nivelTemperaturaMin;
	}
	public int getNivelTemperaturaMax() {
		return NivelTemperaturaMax;
	}
	public void setNivelTemperaturaMax(long nivelTemperaturaMax) {
		NivelTemperaturaMax = (int) nivelTemperaturaMax;
	}
	
}
