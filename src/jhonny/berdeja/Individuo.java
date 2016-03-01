package jhonny.berdeja;

public class Individuo extends Cliente {

	public Individuo(Double saldo) {
		super(saldo);
	}
	void reservarPaquete(Paquete paquete){
		paquete.setReservado(true);
		super.setSaldo(super.getSaldo()-paquete.precio()/2);
	}
	
	void terminarCompraDePaqueteReservado(Paquete paquete){
		if(paquete.isReservado()==true){
			paquete.setReservado(false);
			super.setSaldo(super.getSaldo()-paquete.precio()/2);
			super.setPrecioActual(paquete.precio());
			if(super.getPrecioActual()>super.getPrecioMasCaro()){
				super.setPrecioMasCaro(super.getPrecioActual());
			}
			super.setCantidadDePaquetesComprados(super.getCantidadDePaquetesComprados()+1);
		}else{
			System.out.println("este paquete no esta resevado por usted o directamente no se lo reservo nadie");
		}
	}
}
