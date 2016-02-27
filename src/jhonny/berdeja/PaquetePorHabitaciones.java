package jhonny.berdeja;

public class PaquetePorHabitaciones implements Paquete {
	private int cantidadDeHabitaciones;
	private Double precioDeHabitacion;
	private Double porsentageDeImpuesto;
	
	
	//**********************      CONSTRUCTORES        ************************************
	public PaquetePorHabitaciones(int cantidadDeHabitaciones, Double precioDeHabitacioin, Double porsentageDeImpuesto){
		this.cantidadDeHabitaciones=cantidadDeHabitaciones;
		this.precioDeHabitacion=precioDeHabitacioin;
		this.porsentageDeImpuesto=porsentageDeImpuesto;
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
	//*************************************************************************************
	
	// Calculador de precio base del paquete
	public Double precioBase(){
		return this.cantidadDeHabitaciones * this.precioDeHabitacion;
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
