package jhonny.berdeja;

public class Provador {

	public static void main(String[] args) {
		//*************         EJERCICIO 2         *********************
		
		//**********************      PUNTO 1       **************************
		//PRUEBA 1
		CalculadorDePrecio.setPorsentajeImpuesto(25.0);
		
		Cliente juan=new Cliente(2000.0);
		
		PaqueteComun paqueteComun=new PaqueteComun(500.0);
		
		juan.comprarPaquete(paqueteComun);
		
		System.out.println("Saldo de Juan despues de comprar el PaqueteComun: "+juan.getSaldo());
		
		CalculadorDePrecio.setPorsentajeImpuesto(20.0);
		
		PaquetePorHabitaciones paqueteMardel=new PaquetePorHabitaciones(2, 50.0);
		
		juan.comprarPaquete(paqueteMardel);
		
		System.out.println("Saldo de Juan despues de comprar el PaqueteMardel: "+juan.getSaldo());
		
		System.out.println("Juan gasto  "+juan.getCuantoGasto()+"  y compro  "+juan.getCantidadDePaquetesComprados()+"  paquetes");

	}

}
