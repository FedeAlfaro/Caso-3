package Huerta.planta;


public class Season {
	private String Nombre;
	private int NivelSolMax;  
	private int NivelSolMin;
	private int NivelLluviaMin;
	private int NivelLluviaMax;
	private int NivelTemperaturaMin;
	private int NivelTemperaturaMax;
	private float Duracion;
	
	public Season(SeasonConfig taylord) {
		Nombre= taylord.getNombre();
		NivelSolMax=taylord.getNivelSolMax();  
		NivelSolMin=taylord.getNivelSolMin();
		NivelLluviaMin=taylord.getNivelLluviaMin();
		NivelLluviaMax=taylord.getNivelLluviaMax();
		NivelTemperaturaMin=taylord.getNivelTemperaturaMin();
		Duracion=taylord.getDuracion();
	}

	public float getDuracion() {
		return Duracion;
	}

	public void setDuracion(float duracion) {
		Duracion = duracion;
	}

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
	
	public int GenerarSolActual() {
		int solActual = (int)(Math.random()*(NivelSolMax-NivelSolMin+1)+NivelSolMin);
		return solActual;
	}
	
	public int GenerarLluviaActual() {
		int lluviaActual = (int)(Math.random()*(NivelLluviaMax-NivelLluviaMin+1)+NivelLluviaMin);
		return lluviaActual;
	}
	
	public int GenerarTemperaturaActual() {
		int temperaturaActual = (int)(Math.random()*(NivelTemperaturaMax-NivelTemperaturaMin+1)+NivelTemperaturaMin);
		return temperaturaActual;
	}
	

}
