package paquete;

public class Pasajero implements Cliente {
	private String nombre;
	private Double indice;
	private Double comision;
	
	public Pasajero(String nombreCompleto,Double indice,Double comision){
		this.nombre=nombreCompleto;
		this.indice=indice;
		this.comision=comision;
	}
	
	public void setNombre(String nombreCompleto){
		this.nombre=nombreCompleto;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setComision(Double comision){
		this.comision=comision;
	}
	
	public Double getComision(){
		return this.comision;
	}
	
	@Override
	public Double getIndice(Double precioBase) {
		return precioBase*indice;
	}
}
