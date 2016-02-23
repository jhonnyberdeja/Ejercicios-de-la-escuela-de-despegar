package paquete;

public class Pasajero extends Cliente {
	private Double indice;
	private static Double Comision=10.0;
	
	public Pasajero(String nombreCompleto,Double indice){
		super.setNombre(nombreCompleto);
		this.indice=indice;
	}
	
	public static void setComision(Double comision){
		Comision=comision;
	}
	
	public Double getComision(){
		return Comision;
	}
	
	@Override
	public Double getIndice(Double precioBase) {
		return precioBase*indice;
	}
}
