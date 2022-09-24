package Huerta.planta;

public class StageConfig {
	int Nivel;
    int MinVitalidad;
    int MaxVitalidad;
    float RangeTime;
    int ConsumoAbono; 
    int ConsumoAgua;
    String Imagen;
    String Imagen2;
    String Imagen3;
    
    
    
    
	public int getNivel() {
		return Nivel;
	}
	public void setNivel(long nivel) {
		Nivel = (int) nivel;
	}
	public int getMinVitalidad() {
		return MinVitalidad;
	}
	public void setMinVitalidad(long minVitalidad) {
		MinVitalidad = (int) minVitalidad;
	}
	public int getMaxVitalidad() {
		return MaxVitalidad;
	}
	public void setMaxVitalidad(long maxVitalidad) {
		MaxVitalidad = (int) maxVitalidad;
	}
	public float getRangeTime() {
		return RangeTime;
	}
	public void setRangeTime(double rangeTime) {
		RangeTime = (float) rangeTime;
	}
	public int getConsumoAbono() {
		return ConsumoAbono;
	}
	public void setConsumoAbono(long consumoAbono) {
		ConsumoAbono = (int) consumoAbono;
	}
	public int getConsumoAgua() {
		return ConsumoAgua;
	}
	public void setConsumoAgua(long consumoAgua) {
		ConsumoAgua = (int) consumoAgua;
	}
	public String getImagen() {
		return Imagen;
	}
	public void setImagen(String imagen) {
		Imagen = imagen;
	}
	public String getImagen2() {
		return Imagen2;
	}
	public void setImagen2(String imagen2) {
		Imagen2 = imagen2;
	}
	public String getImagen3() {
		return Imagen3;
	}
	public void setImagen3(String imagen3) {
		Imagen3 = imagen3;
	}
    
    
    
}
