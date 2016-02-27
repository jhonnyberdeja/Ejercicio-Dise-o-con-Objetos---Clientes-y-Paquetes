package jhonny.berdeja;

public class Cliente {
	private Double saldo;
	
	//**********************      CONSTRUCTORES        ************************************
	public Cliente(Double saldo){
		this.saldo=saldo;
	}
	//*************************************************************************************
	
	//**********************      GETERS Y SETERS       ***********************************

	// PUNTO 1: Conocer el saldo de un cliente
	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double sueldo) {
		this.saldo = sueldo;
	}
	//*************************************************************************************
	
	// PUNTO 2: Hacer que el cliente compre un paquete
	public void comprarPaquete(Double precio){
		this.setSaldo(this.getSaldo()-precio);
	}
	
}
