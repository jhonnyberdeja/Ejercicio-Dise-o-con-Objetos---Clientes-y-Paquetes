package jhonny.berdeja;

public class Provador {

	public static void main(String[] args) {
		
		CalculadorDePrecio calculadorDePrecio=new CalculadorDePrecio();
		
		//**********************      PUNTO 2       **************************
		//PRUEBA 1
		PaqueteComun paqueteComun=new PaqueteComun(500.0);
		calculadorDePrecio.setPorsentajeImpuesto(25.0);
		Double precioDePaquete=calculadorDePrecio.precio(paqueteComun);
		Cliente juan=new Cliente(2000.0);
		juan.comprarPaquete(precioDePaquete);
		System.out.println("Saldo de Juan : "+juan.getSaldo());
		
		//PRUEBA 2
		paqueteComun.setPrecioBase(100.0);
		juan.setSaldo(2000.0);
		calculadorDePrecio.setPorsentajeImpuesto(10.0);
		precioDePaquete=calculadorDePrecio.precio(paqueteComun);
		juan.comprarPaquete(precioDePaquete);
		System.out.println("Saldo de Juan : "+juan.getSaldo());
		//**********************************************************************
		
		//**********************     PUNTO 3        ****************************
		// PRUEVA 2
		PaquetePorHabitaciones paqueteMardel=new PaquetePorHabitaciones(2, 50.0);
		calculadorDePrecio.setPorsentajeImpuesto(20.0);
		precioDePaquete=calculadorDePrecio.precio(paqueteMardel);
		System.out.println("Precio de PaqueteMardel : "+precioDePaquete);
		
		// PRUEVA 3
		juan.setSaldo(2000.0);
		calculadorDePrecio.setPorsentajeImpuesto(30.0);
		PaqueteSegunElSaldoDelCliente paqueteSegunElSaldoDelCliente=new PaqueteSegunElSaldoDelCliente(juan);
		precioDePaquete=calculadorDePrecio.precio(paqueteSegunElSaldoDelCliente);
		juan.comprarPaquete(precioDePaquete);
		System.out.println("Saldo de Juan : "+juan.getSaldo());
		//**********************************************************************

	}

}
