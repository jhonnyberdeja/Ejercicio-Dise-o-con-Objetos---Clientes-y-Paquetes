package jhonny.berdeja;

public class Provador {

	public static void main(String[] args) {
		//PRUEBA 1
		Paquete paquete=new Paquete(500.0,25);
		Cliente juan=new Cliente(2000.0);
		juan.comprarPaquete(paquete);
		System.out.println("Saldo de Juan : "+juan.getSaldo());
		
		//PRUEBA 2
		juan.setSaldo(2000.0);
		paquete.setPorsentajeDeImpuesto(10);
		paquete.setPrecioBase(100.0);
		juan.comprarPaquete(paquete);
		System.out.println("Saldo de Juan : "+juan.getSaldo());

	}

}
