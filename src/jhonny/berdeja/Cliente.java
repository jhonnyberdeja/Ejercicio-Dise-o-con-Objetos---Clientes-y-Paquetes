package jhonny.berdeja;

public class Cliente {
	private Double saldo;
	
	public Cliente(Double saldo){
		this.saldo=saldo;
	}
	
	//**********************      GETERS Y SETERS       ************************************

	// PUNTO 1: Conocer el saldo de un cliente
	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double sueldo) {
		this.saldo = sueldo;
	}
	
	// PUNTO 2: Hacer que el cliente compre un paquete. El precio de un paquete se calcula
	// como precioBase + impuesto (que es un porcentaje sobre el base).
	public void comprarPaquete(Paquete paquete){
		this.setSaldo(getSaldo()-paquete.precio());
	}
}
