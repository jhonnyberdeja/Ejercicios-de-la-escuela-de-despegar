package paquete;

public class Pasajero implements Cliente {
	private String nombre;
	private Double indice;
	private static Double Comision=10.0;
	
	public Pasajero(String nombreCompleto,Double indice){
		this.nombre=nombreCompleto;
		this.indice=indice;
	}
	
	public void setNombre(String nombreCompleto){
		this.nombre=nombreCompleto;
	}
	
	public String getNombre(){
		return this.nombre;
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
