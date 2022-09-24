package Huerta.planta;


public class Season {
	private String Nombre;
	private int NivelSolMax;  
	private int NivelSolMin;
	private int NivelLluviaMin;
	private int NivelLluviaMax;
	private int NivelTemperaturaMin;
	private int NivelTemperaturaMax;
	

	public void imprimirSeason() {
		System.out.println("Nombre: "+Nombre+"\n"+"NivelSolMax: "+NivelSolMax+"\n"+"NivelSolMin: "+NivelSolMin+"\n"+"NivelLluviaMin: "+ NivelLluviaMin+"\n"+"NivelLluviaMax: "+NivelLluviaMax+"\n"+"NivelTemperaturaMin: "+NivelTemperaturaMin+"\n"+"NivelTemperaturaMax: "+NivelTemperaturaMax+"\n");
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
		NivelSolMax = nivelSolMax;
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
		NivelLluviaMax = nivelLluviaMax;
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
		NivelTemperaturaMax = nivelTemperaturaMax;
	}
	
	
	
	/*
	public Season(String[] array) {
		Nombre= array[0];
		try {
		NivelSolMax= Integer.parseInt(array[1]);  
		NivelSolMin= Integer.parseInt(array[2]);
		NivelLluviaMin= Integer.parseInt(array[3]);
		NivelLluviaMax= Integer.parseInt(array[4]);
		NivelTemperaturaMin= Integer.parseInt(array[5]);
		NivelTemperaturaMax= Integer.parseInt(array[6]);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	*/ 
}
