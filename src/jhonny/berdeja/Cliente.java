package jhonny.berdeja;

public class Cliente {
	private Double saldo;
	private Double cuantoGasto;
	private int cantidadDePaquetesComprados;
	private Double precioMasCaro;
	private Paquete paqueteMasCaro;
	
	//**********************      CONSTRUCTORES        ************************************
	public Cliente(Double saldo){
		this.saldo=saldo;
		this.cuantoGasto=0.0;
		this.cantidadDePaquetesComprados=0;
		this.precioMasCaro=0.0;
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
		return this.cuantoGasto;
	}
	//EJERCICIO 2, PUNTO 1 : Para saber la cantidad de paquetes comprados
	public int getCantidadDePaquetesComprados() {
		return this.cantidadDePaquetesComprados;
	}
	//EERCICIO 2, PUNTO 2
	public Paquete getPaqueteMasCaro() {
		return this.paqueteMasCaro;
	}
	//*************************************************************************************
	
	// EJERCICIO 1, PUNTO 2: Hacer que el cliente compre un paquete
	public void comprarPaquete(Paquete paquete){
		Double precioActual=paquete.precio();
		if(precioActual>this.precioMasCaro){
			this.precioMasCaro=precioActual;
			this.paqueteMasCaro=(Paquete) paquete.getIntanciaDePaquete();
		}
		this.cantidadDePaquetesComprados++;
		this.cuantoGasto+=precioActual;
		this.setSaldo(this.getSaldo()-paquete.precio());
	}






	
}
