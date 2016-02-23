package paquete;

public class EmpleadoDeDespegar implements Cliente {
	private String nombre;
	public static Double Indice=0.7;
	private static Double Comision=0.0;
	
	
	public EmpleadoDeDespegar(String nombreCompleto){
		this.nombre=nombreCompleto;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public static void setIndice(Double indice){
		Indice=indice;
	}
	
	@Override
	public Double getIndice(Double precioBase) {
		return precioBase*Indice;
	}
	
	public static void setComision(Double comision){
		Comision=comision;
	}

	@Override
	public Double getComision() {
		return Comision;
	}

	
}
