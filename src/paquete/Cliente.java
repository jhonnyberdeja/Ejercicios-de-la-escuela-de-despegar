package paquete;

public abstract class Cliente {
	private String nombre;
	
	public void setNombre(String nombreCompleto){
		this.nombre=nombreCompleto;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public Double getIndice(Double precioBase){
		return 0.0;
	}
	public Double getComision(){
		return 0.0;
	}
	public Double calcularPrecio(Double precioBase){
		return precioBase*this.getIndice(precioBase)+this.getComision();
	}
}
