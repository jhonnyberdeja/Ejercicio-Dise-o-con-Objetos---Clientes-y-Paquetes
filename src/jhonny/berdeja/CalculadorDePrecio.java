package jhonny.berdeja;

public class CalculadorDePrecio {
	private static Double porsentajeDeImpuesto=10.0;
	
	//**********************      CONSTRUCTORES        ************************************
	public CalculadorDePrecio(){
		
	}
	public CalculadorDePrecio(Double porsentajeDeImpuesto){
		CalculadorDePrecio.porsentajeDeImpuesto=porsentajeDeImpuesto;
	}
	//*************************************************************************************
	
	//**********************      GETERS Y SETERS       ***********************************

	public static  void setPorsentajeImpuesto(Double porsentajeDeImpuesto) {
		CalculadorDePrecio.porsentajeDeImpuesto = porsentajeDeImpuesto;
	}
	
	//*************************************************************************************
	//Calcula el precio del paquete
	public static Double precio(Paquete paquete){
		Double impuesto= paquete.precioBase() * CalculadorDePrecio.porsentajeDeImpuesto/100;
		return paquete.precioBase()+impuesto;
	}
}
