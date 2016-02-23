package paquete;

public class EmpleadoDeDespegar extends Cliente {
	public static Double Indice=0.7;
	private static Double Comision=0.0;
	
	
	public EmpleadoDeDespegar(String nombreCompleto){
		super.setNombre(nombreCompleto);
	}


	
	public static void setIndice(Double indice){
		Indice=indice;
	}
	
	
	public Double getIndice(Double precioBase) {
		return precioBase*Indice;
	}
	
	public static void setComision(Double comision){
		Comision=comision;
	}

	public Double getComision() {
		return Comision;
	}

	
}
