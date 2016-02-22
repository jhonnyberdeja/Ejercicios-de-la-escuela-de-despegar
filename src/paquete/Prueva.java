package paquete;

public class Prueva {

	public static void main(String[] args) {
		Double precioBase=1000.0;
		CalcuadorDePrecio calcuadorDePrecio=new CalcuadorDePrecio();
		//PASAJERO
		Pasajero pasajero=new Pasajero("Jhonny Beredja",2.3,1.2);
		Double precioDePasajeParaPasajero=calcuadorDePrecio.calcularPrecio(pasajero,precioBase);
		System.out.println("Nombre del pasajero : "+pasajero.getNombre());
		System.out.println("Precio del pasajero : "+precioDePasajeParaPasajero);
		
		//EMPLEAD0O
		EmpleadoDeDespegar empleado=new EmpleadoDeDespegar("Milton Ajhuacho",2.1);
		Double precioDePasajeParaEmpleado=calcuadorDePrecio.calcularPrecio(empleado, precioBase);
		System.out.println("Nombre del empleado : "+empleado.getNombre());
		System.out.println("Precio del empleado : "+precioDePasajeParaEmpleado);

		
	}

}
