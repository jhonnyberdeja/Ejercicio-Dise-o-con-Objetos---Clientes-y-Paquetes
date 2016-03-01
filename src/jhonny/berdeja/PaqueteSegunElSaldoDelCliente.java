package jhonny.berdeja;

public class PaqueteSegunElSaldoDelCliente implements Paquete{
	private Cliente cliente;
	private int subIndice;
	private boolean reservado;
	
	//**********************      CONSTRUCTORES        ************************************
	public PaqueteSegunElSaldoDelCliente(Cliente cliente){
		this.cliente=cliente;
		this.setReservado(false);
	}
	//*************************************************************************************
	
	//**********************      GETERS Y SETERS       ***********************************
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente ciente) {
		this.cliente = ciente;
	}
	
	@Override
	public void setSubIndice(int subIndice) {
		this.subIndice=subIndice;
		
	}
	@Override
	public int getSubIndice() {
		return this.subIndice;
	}
	@Override
	public Object getIntanciaDePaquete() {
		return this;
	}
	
	public boolean isReservado() {
		return reservado;
	}

	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}
	//**************************************************************************************
	// Calculador de precio base del paquete
	public Double precioBase(){
		return this.cliente.getSaldo() * 10 / 100;
	}

	@Override
	public Double precio() {
		return CalculadorDePrecio.precio(this);
	}


	
}
