package jhonny.berdeja;

public class PaqueteComun implements Paquete {
	private Double precioBase;
	
	//**********************      CONSTRUCTORES        ************************************
	public PaqueteComun(Double precioBase){
		this.precioBase=precioBase;
	}
	
	//**********************      GETERS Y SETERS       ************************************
	public Double getPrecioBase(){
		return this.precioBase;
	}
	public void setPrecioBase(Double presioBase){
		this.precioBase=presioBase;
	}

	//***************************************************************************************
	
	// Calculador de precio base del paquete
	public Double precioBase() {
		return this.precioBase;
	}

}
