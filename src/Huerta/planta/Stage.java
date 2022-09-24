package Huerta.planta;

public class Stage {

	int Nivel;
    int MinVitalidad;
    int MaxVitalidad;
    float RangeTime;
    int ConsumoAbono; 
    int ConsumoAgua;
    String Imagen;
    String Imagen2;
    String Imagen3;
    
    
    public Stage(String[] array) {
		try {
		Nivel= Integer.parseInt(array[0]); 	
		MinVitalidad= Integer.parseInt(array[1]);  
		MaxVitalidad= Integer.parseInt(array[2]);
		RangeTime= Float.parseFloat(array[3]);
		ConsumoAbono= Integer.parseInt(array[4]);
		ConsumoAgua= Integer.parseInt(array[5]);
		}catch(Exception e){
			e.printStackTrace();
		}
		Imagen= array[6];
		Imagen2= array[7];
		Imagen3= array[8];
	}
	
	public void imprimirStage() {
		System.out.println("Nivel: "+Nivel+"\n"+"MinVitalidad: "+MinVitalidad+"\n"+"MaxVitalidad: "+MaxVitalidad+"\n"+"RangeTime: "+ RangeTime+"\n"+"ConsumoAbono: "+ConsumoAbono+"\n"+"ConsumoAgua: "+ConsumoAgua+"\n"+"Imagen: "+Imagen+"\n"+"Imagen2: "+Imagen2+"\n"+"Imagen3: "+Imagen3+"\n");
	}
    
}
