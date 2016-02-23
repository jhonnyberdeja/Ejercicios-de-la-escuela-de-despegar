package paquete;

public class Prueva {

	public static void main(String[] args) {
		Double precioBase=100.0;
		
		CalcuadorDePrecio calcuadorDePrecio=new CalcuadorDePrecio();
		
		//EMPLEAD0O
		EmpleadoDeDespegar empleado=new EmpleadoDeDespegar("Milton Ajhuacho");
		Double precioDePasajeParaEmpleado=calcuadorDePrecio.calcularPrecio(empleado, precioBase);
		System.out.println("Nombre del empleado : "+empleado.getNombre());
		System.out.println("Precio del empleado : "+precioDePasajeParaEmpleado);
		
		//PASAJERO
		Pasajero pasajero=new Pasajero("Jhonny Beredja",2.3);
		Double precioDePasajeParaPasajero=calcuadorDePrecio.calcularPrecio(pasajero,precioBase);
		System.out.println("Nombre del pasajero : "+pasajero.getNombre());
		System.out.println("Precio del pasajero : "+precioDePasajeParaPasajero);

		
	}

}
