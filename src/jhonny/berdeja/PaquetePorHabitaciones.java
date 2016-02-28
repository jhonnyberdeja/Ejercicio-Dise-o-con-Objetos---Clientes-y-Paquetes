package jhonny.berdeja;

public class PaquetePorHabitaciones implements Paquete {
	private int cantidadDeHabitaciones;
	private Double precioDeHabitacion;
	private int subIndice;
	
	
	//**********************      CONSTRUCTORES        ************************************
	public PaquetePorHabitaciones(int cantidadDeHabitaciones, Double precioDeHabitacioin){
		this.cantidadDeHabitaciones=cantidadDeHabitaciones;
		this.precioDeHabitacion=precioDeHabitacioin;
	}
	//*************************************************************************************
	
	//**********************      GETERS Y SETERS       ***********************************
	public int getCantidadDeHabitaciones() {
		return cantidadDeHabitaciones;
	}
	public void setCantidadDeHabitaciones(int cantidadDeHabitaciones) {
		this.cantidadDeHabitaciones = cantidadDeHabitaciones;
	}
	public Double getPrecioDeHabitacion() {
		return precioDeHabitacion;
	}
	public void setPrecioDeHabitacion(Double precioDeHabitacion) {
		this.precioDeHabitacion = precioDeHabitacion;
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
	//*************************************************************************************
	
	// Calculador de precio base del paquete
	public Double precioBase(){
		return this.cantidadDeHabitaciones * this.precioDeHabitacion;
	}

	@Override
	public Double precio() {
		return CalculadorDePrecio.precio(this);
	}



	
}
