package paquete;

public class EmpleadoDeDespegar implements Cliente {
	private String nombre;
	private Double indice;
	
	
	public EmpleadoDeDespegar(String nombreCompleto,Double indice){
		this.nombre=nombreCompleto;
		this.indice=indice;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	@Override
	public Double getIndice(Double precioBase) {
		return precioBase*indice;
	}

	
}
