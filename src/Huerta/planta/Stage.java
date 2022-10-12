package Huerta.planta;


public class Stage {

	private int Nivel;
	private int MinTemp;
	private int MaxTemp;
	private int MinSol;
	private int MaxSol;
	private int MinLluvia;
	private int MaxLluvia;
	private float RangeTime;
	private int ConsumoAbono; 
	private int ConsumoAgua;
	private String Imagen;
	private String Imagen2;
	private String Imagen3;
    
    
    public Stage(StageConfig taylord) {
		Nivel= taylord.getNivel(); 	
		MinTemp= taylord.getMinTemp();  
		MaxTemp= taylord.getMaxTemp();
		MinSol= taylord.getMinSol();  
		MaxSol= taylord.getMaxSol();
		MinLluvia= taylord.getMinLluvia();  
		MaxLluvia= taylord.getMaxLuvia();
		RangeTime= taylord.getRangeTime();
		ConsumoAbono= taylord.getConsumoAbono();
		ConsumoAgua= taylord.getConsumoAgua();
		Imagen=  taylord.getImagen();
		Imagen2= taylord.getImagen2();
		Imagen3= taylord.getImagen3();
	}
	
	public void imprimirStage() {
		System.out.println("Nivel: "+Nivel+"\n"+"RangeTime: "+ RangeTime+"\n"+"ConsumoAbono: "+ConsumoAbono+"\n"+"ConsumoAgua: "+ConsumoAgua+"\n"+"Imagen: "+Imagen+"\n"+"Imagen2: "+Imagen2+"\n"+"Imagen3: "+Imagen3+"\n");
	}

	public int getNivel() {
		return Nivel;
	}

	public int getMinTemp() {
		return MinTemp;
	}

	public int getMaxTemp() {
		return MaxTemp;
	}

	public int getMinSol() {
		return MinSol;
	}

	public int getMaxSol() {
		return MaxSol;
	}

	public int getMinLluvia() {
		return MinLluvia;
	}

	public int getMaxLluvia() {
		return MaxLluvia;
	}

	public float getRangeTime() {
		return RangeTime;
	}

	public int getConsumoAbono() {
		return ConsumoAbono;
	}

	public int getConsumoAgua() {
		return ConsumoAgua;
	}

	public String getImagen() {
		return Imagen;
	}

	public String getImagen2() {
		return Imagen2;
	}

	public String getImagen3() {
		return Imagen3;
	}
	
	
	
	
    
}
