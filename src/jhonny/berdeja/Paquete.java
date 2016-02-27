package jhonny.berdeja;

public class Paquete{
	private Double precioBase;
	private int porsentajeDeImpuesto;
	
	public Paquete(Double precioBase, int porsentajeDeImpuesto){
		this.precioBase=precioBase;
		this.porsentajeDeImpuesto=porsentajeDeImpuesto;
	}
	
	//**********************      GETERS Y SETERS       ************************************
	public Double getPrecioBase(){
		return this.precioBase;
	}
	public void setPrecioBase(Double presioBase){
		this.precioBase=presioBase;
	}
	public int getPorsentajeDeImpuesto(){
		return this.porsentajeDeImpuesto;
	}
	
	public void setPorsentajeDeImpuesto(int porsentajeDeImpuesto){
		this.porsentajeDeImpuesto=porsentajeDeImpuesto;
	}
	//***************************************************************************************

	public Double precio() {
		Double impuesto= precioBase*porsentajeDeImpuesto/100;
		return precioBase+impuesto;
	}

}
