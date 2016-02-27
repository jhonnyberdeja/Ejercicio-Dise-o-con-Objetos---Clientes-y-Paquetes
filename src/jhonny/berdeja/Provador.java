package jhonny.berdeja;

public class Provador {

	public static void main(String[] args) {
		//*************         EJERCICIO 2         *********************
		
		//**********************      PUNTO 1       **************************
		//PRUEBA 1
		Double porsentajeDeImpuestoParaPaqueteComun=25.0;
		
		Cliente juan=new Cliente(2000.0);
		
		PaqueteComun paqueteComun=new PaqueteComun(500.0, porsentajeDeImpuestoParaPaqueteComun);
		
		System.out.println("Precio de PaqueComun : "+paqueteComun.precio());
		
		juan.comprarPaquete(paqueteComun);
		
		System.out.println("Saldo de Juan despues de comprar el PaqueteComun: "+juan.getSaldo());
		
		Double porsentajeDeImpuestoParaPaqueteMardel=20.0;
		
		PaquetePorHabitaciones paqueteMardel=new PaquetePorHabitaciones(2, 50.0, porsentajeDeImpuestoParaPaqueteMardel);
		
		System.out.println("Precio de PAqueteMardel : "+paqueteMardel.precio());
		
		juan.comprarPaquete(paqueteMardel);
		
		System.out.println("Saldo de Juan despues de comprar el PaqueteMardel: "+juan.getSaldo());
		
		System.out.println("Juan gasto  "+juan.getCuantoGasto()+"  y compro  "+juan.getCantidadDePaquetesComprados()+"  paquetes");
		
		System.out.println("Precio de paquete mas caro que compro Juan: "+juan.getPaqueteMasCaro().precio());

	}

}
