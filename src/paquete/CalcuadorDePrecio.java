package paquete;

public class CalcuadorDePrecio {

	private static Double Iva=21.0;
	public Double calcularPrecio(Cliente cliente,Double precioBase){
		//return (precioBase*cliente.getIndice(precioBase)+cliente.getComision())*Iva;
		
		Double impuestoIva=(precioBase*cliente.getIndice(precioBase)+cliente.getComision())*100/Iva;
		
		return  (precioBase*cliente.getIndice(precioBase)+cliente.getComision())+impuestoIva;
	}
}
