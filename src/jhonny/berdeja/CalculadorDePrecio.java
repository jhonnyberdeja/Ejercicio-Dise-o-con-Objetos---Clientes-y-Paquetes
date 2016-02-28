package jhonny.berdeja;

import java.util.ArrayList;

public class CalculadorDePrecio {
	private static int subIndice=-1;
	private static ArrayList<Double> porsentajesDeImpuestos=new ArrayList<Double>();
	
	
	//**********************      CONSTRUCTORES        ************************************

	//*************************************************************************************
	
	//**********************      GETERS Y SETERS       ***********************************

	public static  void setPorsentajeImpuesto(Double porsentajeDeImpuesto) {
		porsentajesDeImpuestos.add(porsentajeDeImpuesto);
		subIndice++;
	}
	
	public static Double getPorsentajeDeImpuesto(){
		return CalculadorDePrecio.porsentajesDeImpuestos.get(subIndice);
	}
	
	//*************************************************************************************
	//Calcula el precio del paquete
	public static Double precio(Paquete paquete){
		Double impuesto;
		if(paquete.getSubIndice()==-1){
			impuesto= paquete.precioBase() * porsentajesDeImpuestos.get(subIndice)/100;
			paquete.setSubIndice(subIndice);
		}else{
			impuesto= paquete.precioBase() * porsentajesDeImpuestos.get(paquete.getSubIndice())/100;
		}
		return paquete.precioBase()+impuesto;
	}
}
