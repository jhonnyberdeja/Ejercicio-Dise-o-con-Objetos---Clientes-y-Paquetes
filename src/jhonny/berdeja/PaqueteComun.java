package jhonny.berdeja;

public class PaqueteComun implements Paquete {
	private Double precioBase;
	private int subIndice;
	private boolean reservado;
	
	//**********************      CONSTRUCTORES        ************************************
	public PaqueteComun(Double precioBase){
		this.precioBase=precioBase;
		this.subIndice=-1;
		this.setReservado(false);
	}
	
	//**********************      GETERS Y SETERS       ************************************
	public Double getPrecioBase(){
		return this.precioBase;
	}
	public void setPrecioBase(Double presioBase){
		this.precioBase=presioBase;
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

	//***************************************************************************************
	
	// Calculador de precio base del paquete
	public Double precioBase() {
		return this.precioBase;
	}

	@Override
	public Double precio() {
		return CalculadorDePrecio.precio(this);
	}








}
