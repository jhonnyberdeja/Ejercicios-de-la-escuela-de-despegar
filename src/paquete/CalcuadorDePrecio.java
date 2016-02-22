package paquete;

public class CalcuadorDePrecio {
	
	public Double calcularPrecio(EmpleadoDeDespegar empleado,Double precioBase){
		
		return precioBase*empleado.getIndice(precioBase);
	}
	public Double calcularPrecio(Pasajero pasajero,Double precioBase){
		return precioBase*pasajero.getIndice(precioBase);
	}
}
