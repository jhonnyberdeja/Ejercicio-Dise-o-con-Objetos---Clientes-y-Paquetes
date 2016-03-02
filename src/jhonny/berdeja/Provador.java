package jhonny.berdeja;

import java.util.ArrayList;

import javax.print.attribute.TextSyntax;

import org.slf4j.Logger;// ojo , este es el .....
import org.slf4j.LoggerFactory;



public class Provador {
	
	private final static Logger LOGGER =LoggerFactory.getLogger(Provador.class);
	
	public static void main(String[] args) throws SaldoInsuficienteException   { //throws SaldoInsuficienteException {
		LOGGER.info("hola mundo");
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
		
		//PUEVA 3
		individuo.terminarCompraDePaqueteReservado(pc);
		
		if(pc.isReservado()==true)
			System.out.println("El paquete PC esta reservado ");
		else
			System.out.println("El paquete PC ya No esta reservado por que termino de comprerlo");
		
		System.out.println("El saldo del individuo despues de terminar de comprar el paquete PC es: "+individuo.getSaldo());
		
		System.out.println("Cantidad de paquetes comprados por el individuo : "+individuo.getCantidadDePaquetesComprados());
		
		*/
		//*************************     EJERCICIO 3       *****************************+
		/*
		//PRUEVA 1
		CalculadorDePrecio.setPorsentajeImpuesto(25.0);
		
		Individuo juan=new Individuo(2000.0);
		
		PaqueteComun paqueteComun=new PaqueteComun(10000.0);
		
		System.out.println("Precio de PaqueComun : "+paqueteComun.precio());
		
		try {
			juan.comprarPaquete(paqueteComun);
		} catch (SaldoInsuficienteException e) {
			//e.getStackTrace();
			throw new SaldoInsuficienteException("Saldo insuficiente para realizar la operacion");
		}finally{
			System.out.println("Saldo de Juan es : "+juan.getSaldo());
        }
		
		System.out.println("Saldo de Juan despues de comprar el PaqueteComun: "+juan.getSaldo());
		*/
		//PRUEVA 2
		Individuo milton=new Individuo(100.0);
		LOGGER.info("individu Milton, creado");
		ArrayList<Paquete> listaDePaquetes=new ArrayList<Paquete>();
		LOGGER.info("Lista de paquetes, creado");
		PaqueteComun paqComun=new PaqueteComun(500.0);
		LOGGER.info("Paquete comun, creado");
		PaquetePorHabitaciones paqMardel=new PaquetePorHabitaciones(2, 50.0);
		LOGGER.info("Paquete mardel, creado");
		PaqueteSegunElSaldoDelCliente  paqSegunElSaldoDelCliente=new PaqueteSegunElSaldoDelCliente(milton);
		LOGGER.info("Paquete segun saldo del cliente, creado");
		listaDePaquetes.add(paqComun);
		listaDePaquetes.add(paqMardel);
		listaDePaquetes.add(paqSegunElSaldoDelCliente);
		LOGGER.info("PaqueteComun, PaqueteSegunSaldoDelCliente y PaqueteMardel, agregados a la lista de paquetes");
		PaqueteDePaquetes paqueteDePaquetes=new PaqueteDePaquetes(listaDePaquetes);
		LOGGER.info("Lista agregada al paquete de paquetes");
		try {
			milton.comprarPaquete(paqueteDePaquetes);
			LOGGER.info("milton intento comprar un paquete de paquetes");
		} catch (CompraNoPermitidaException e) {
			LOGGER.info("Milton no pudo comprar el paquete de paquetes porque es un individuo y a un individuo no se le permite comprar varios paquetes a la ves");
			//e.getStackTrace();
			throw new CompraNoPermitidaException("Un individuo no puede comprar mas de un paquete a la ves");
		}finally{
			System.out.println("Saldo de Juan es : "+milton.getSaldo());
        }
		
		//¿ ESTOS LOGGER SIEMPRE TENEMOS QUE PONERLE A TODAS LAS CLASES DEL PROYECTO O SOLO EN DONDE CREEMOS QUE ES NESESARIO PONERLO?
		
		
		
	}

}
