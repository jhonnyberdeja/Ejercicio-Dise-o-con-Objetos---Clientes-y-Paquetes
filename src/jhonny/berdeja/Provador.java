package jhonny.berdeja;

import java.util.ArrayList;

public class Provador {

	public static void main(String[] args) {
		/*
		//*************         EJERCICIO 2         *********************
		
		//**********************      PUNTO 1       *********************
		//PRUEBA 1
		CalculadorDePrecio.setPorsentajeImpuesto(25.0);
		
		Cliente juan=new Cliente(2000.0);
		
		PaqueteComun paqueteComun=new PaqueteComun(500.0);
		
		System.out.println("Precio de PaqueComun : "+paqueteComun.precio());
		
		juan.comprarPaquete(paqueteComun);
		
		System.out.println("Saldo de Juan despues de comprar el PaqueteComun: "+juan.getSaldo());
		
		CalculadorDePrecio.setPorsentajeImpuesto(20.0);
		
		PaquetePorHabitaciones paqueteMardel=new PaquetePorHabitaciones(2, 50.0);
		
		System.out.println("Precio de PAqueteMardel : "+paqueteMardel.precio());
		
		juan.comprarPaquete(paqueteMardel);
		
		System.out.println("Saldo de Juan despues de comprar el PaqueteMardel: "+juan.getSaldo());
		
		System.out.println("Juan gasto  "+juan.getCuantoGasto()+"  y compro  "+juan.getCantidadDePaquetesComprados()+"  paquetes");
		
		//***********************    PUNTO 2     *************************
		//PRUEVA
		System.out.println("Precio de paquete mas caro que compro Juan: "+juan.getPaqueteMasCaro().precio());
		*/
		//**********************     PUNTO 3     *************************
		//PRUEVA 1
		CalculadorDePrecio.setPorsentajeImpuesto(10.0);
		
		Empresa empresaBerdeja=new Empresa(10000.0);
		
		ArrayList<Paquete> listaDePaquetes=new ArrayList<Paquete>();
		
		PaqueteComun paqComun=new PaqueteComun(500.0);
		
		PaquetePorHabitaciones paqMardel=new PaquetePorHabitaciones(2, 50.0);
		
		PaqueteSegunElSaldoDelCliente  paqSegunElSaldoDelCliente=new PaqueteSegunElSaldoDelCliente(empresaBerdeja);
		
		listaDePaquetes.add(paqComun);
		listaDePaquetes.add(paqMardel);
		listaDePaquetes.add(paqSegunElSaldoDelCliente);
		
		PaqueteDePaquetes paqueteDePaquetes=new PaqueteDePaquetes(listaDePaquetes);
		
		empresaBerdeja.comprarPaquete(paqueteDePaquetes);
		
		System.out.println("Saldo de la empresa despues de comprar un paquete de tres paquetes : "+empresaBerdeja.getSaldo());
		
		//PRUEVA 2
		Individuo individuo=new Individuo(1000.0);
		
		PaqueteComun pc=new PaqueteComun(100.0);
		
		individuo.reservarPaquete(pc);
		
		if(pc.isReservado()==true)
			System.out.println("El paquete PC esta reservado ");
		else
			System.out.println("El paquete PC No esta reservado");
		
		System.out.println("El precio del paquete PC es : "+pc.precio());
		
		System.out.println("El saldo del individuo despues de reservar el paquete PC es: "+individuo.getSaldo());
		
		individuo.terminarCompraDePaqueteReservado(pc);
		
		if(pc.isReservado()==true)
			System.out.println("El paquete PC esta reservado ");
		else
			System.out.println("El paquete PC ya No esta reservado por que termino de comprerlo");
		
		System.out.println("El saldo del individuo despues de terminar de comprar el paquete PC es: "+individuo.getSaldo());
		
		System.out.println("Cantidad de paquetes comprados por el individuo : "+individuo.getCantidadDePaquetesComprados());
		
		//PUEVA 3
		
		
		
	}

}
