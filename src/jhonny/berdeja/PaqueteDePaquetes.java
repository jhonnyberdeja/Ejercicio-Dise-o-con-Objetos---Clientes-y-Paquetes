package jhonny.berdeja;

import java.util.ArrayList;

public class PaqueteDePaquetes implements Paquete {
	
	private ArrayList<Paquete> listaDePaquetes;
	private int subIndice;
	
	//**********************      CONSTRUCTORES        ************************************
	
	public PaqueteDePaquetes(ArrayList<Paquete> paquetes){
		this.listaDePaquetes=paquetes;
	}
	
	//*************************************************************************************
	
	//**********************      GETERS Y SETERS       ***********************************
	
	public ArrayList<Paquete> getListaDePaquetes() {
		return listaDePaquetes;
	}

	public void setListaDePaquetes(ArrayList<Paquete> listaDePaquetes) {
		this.listaDePaquetes = listaDePaquetes;
	} 
	
	@Override
	public Object getIntanciaDePaquete() {
		return this;
	}

	@Override
	public void setSubIndice(int subIndice) {
		this.subIndice=subIndice;
	}

	@Override
	public int getSubIndice() {
		return this.subIndice;
	}
	//como hacer para que estos metodos no le aparescan como una opcion de usarl
	@Override
	public boolean isReservado() {
		return false;
	}

	@Override
	public void setReservado(boolean reservado) {
		
	}
	//**************************************************************************************

	@Override
	public Double precioBase() {
		Double acumuladorDePreciosBase=0.0;
		for(Paquete paquete: this.listaDePaquetes){
			acumuladorDePreciosBase+=paquete.precioBase();
		}
		return acumuladorDePreciosBase;
	}

	@Override
	public Double precio() {
		return  CalculadorDePrecio.precio(this);
	}



}
