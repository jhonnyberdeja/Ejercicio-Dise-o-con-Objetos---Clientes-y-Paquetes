package jhonny.berdeja;

public class CalculadorDePrecio {
	private Double porsentajeDeImpuesto;
	private Paquete paquete;
	
	
	public CalculadorDePrecio(){
		
	}
	public CalculadorDePrecio(Paquete paquete, Double porsentajeDeImpuesto){
		this.paquete=paquete;
		this.porsentajeDeImpuesto=porsentajeDeImpuesto;
	}
	
	public Double getPorsentajeImpuesto() {
		return porsentajeDeImpuesto;
	}

	public void setPorsentajeImpuesto(Double porsentajeDeImpuesto) {
		this.porsentajeDeImpuesto = porsentajeDeImpuesto;
	}

	public Paquete getPaquete() {
		return paquete;
	}

	public void setPaquete(Paquete paquete) {
		this.paquete = paquete;
	}
	
	public Double precio(Paquete paquete){
		Double impuesto= paquete.precioBase() * this.porsentajeDeImpuesto/100;
		return paquete.precioBase()+impuesto;
	}
}
