package jhonny.berdeja;

public class CalculadorDePrecio {
	private Double porsentajeDeImpuesto=10.0;
	
	//**********************      CONSTRUCTORES        ************************************
	public CalculadorDePrecio(Double porsentajeDeImpuesto){
		this.porsentajeDeImpuesto=porsentajeDeImpuesto;
	}
	//*************************************************************************************
	
	//**********************      GETERS Y SETERS       ***********************************

	public  void setPorsentajeImpuesto(Double porsentajeDeImpuesto) {
		this.porsentajeDeImpuesto = porsentajeDeImpuesto;
	}
	
	public Double getPorsentajeDeImpuesto(){
		return this.porsentajeDeImpuesto;
	}
	
	//*************************************************************************************
	//Calcula el precio del paquete
	public Double precio(Paquete paquete){
		Double impuesto= paquete.precioBase() * this.porsentajeDeImpuesto/100;
		return paquete.precioBase()+impuesto;
	}
}
