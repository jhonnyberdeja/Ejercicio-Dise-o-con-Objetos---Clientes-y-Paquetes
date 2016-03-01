package jhonny.berdeja;

public class Empresa extends Cliente {

	public Empresa(Double saldo) {
		super(saldo);
	}
	
	public void comprarPaquete(Paquete paquete){
		super.setSaldo(super.getSaldo()-paquete.precio());
	}

}
