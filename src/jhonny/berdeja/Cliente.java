package jhonny.berdeja;

public class Cliente {
	private Double saldo;
	private Double cuantoGasto;
	private int cantidadDePaquetesComprados;
	
	//**********************      CONSTRUCTORES        ************************************
	public Cliente(Double saldo){
		this.saldo=saldo;
		this.cuantoGasto=0.0;
		this.cantidadDePaquetesComprados=0;
	}
	//*************************************************************************************
	
	//**********************      GETERS Y SETERS       ***********************************

	// EJERCICIO 1, PUNTO 1 : Conocer el saldo de un cliente
	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double sueldo) {
		this.saldo = sueldo;
	}
	// EJERCICIO 2, PUNTO 1 : Para conocer cuanto gasto
	public Double getCuantoGasto() {
		return cuantoGasto;
	}
	//EJERCICIO 2, PUNTO 1 : Para saber la cantidad de paquetes comprados
	public int getCantidadDePaquetesComprados() {
		return cantidadDePaquetesComprados;
	}
	//*************************************************************************************
	
	// EJERCICIO 1, PUNTO 2: Hacer que el cliente compre un paquete
	public void comprarPaquete(Paquete paquete){
		this.cantidadDePaquetesComprados++;
		this.cuantoGasto+=paquete.precio();
		this.setSaldo(this.getSaldo()-paquete.precio());
	}



	
}
