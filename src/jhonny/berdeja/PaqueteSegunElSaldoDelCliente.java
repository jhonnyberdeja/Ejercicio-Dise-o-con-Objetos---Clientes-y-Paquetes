package jhonny.berdeja;

public class PaqueteSegunElSaldoDelCliente implements Paquete{
	private Cliente cliente;
	private Double porsentageDeImpuesto;
	
	//**********************      CONSTRUCTORES        ************************************
	public PaqueteSegunElSaldoDelCliente(Cliente cliente, Double porsentageDeImpuesto){
		this.cliente=cliente;
		this.porsentageDeImpuesto=porsentageDeImpuesto;
	}
	//*************************************************************************************
	
	//**********************      GETERS Y SETERS       ***********************************
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente ciente) {
		this.cliente = ciente;
	}
	//**************************************************************************************
	
	// Calculador de precio base del paquete
	public Double precioBase(){
		return this.cliente.getSaldo() * 10 / 100;
	}

	@Override
	public Double precio() {
		return new CalculadorDePrecio(this.porsentageDeImpuesto).precio(this);
	}

	@Override
	public Object getIntanciaDePaquete() {
		return this;
	}
	
	
}
