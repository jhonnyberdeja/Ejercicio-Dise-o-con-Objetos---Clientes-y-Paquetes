package jhonny.berdeja;

public class PaqueteComun implements Paquete {
	private Double precioBase;
	private Double porsentageDeImpuesto;
	
	//**********************      CONSTRUCTORES        ************************************
	public PaqueteComun(Double precioBase,Double porsentageDeImpuesto){
		this.precioBase=precioBase;
		this.setPorsentageDeImpuesto(porsentageDeImpuesto);
	}
	
	//**********************      GETERS Y SETERS       ************************************
	public Double getPrecioBase(){
		return this.precioBase;
	}
	public void setPrecioBase(Double presioBase){
		this.precioBase=presioBase;
	}
	public Double getPorsentageDeImpuesto() {
		return porsentageDeImpuesto;
	}

	public void setPorsentageDeImpuesto(Double porsentageDeImpuesto) {
		this.porsentageDeImpuesto = porsentageDeImpuesto;
	}

	//***************************************************************************************
	
	// Calculador de precio base del paquete
	public Double precioBase() {
		return this.precioBase;
	}

	@Override
	public Double precio() {
		return new CalculadorDePrecio(this.porsentageDeImpuesto).precio(this);
	}

	@Override
	public Object getIntanciaDePaquete() {
		return this;
	}

}
