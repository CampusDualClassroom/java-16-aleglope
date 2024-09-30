package com.campusdual.classroom;

/**
 * La clase {@code Exercise16} contiene el método {@code main} que demuestra
 * la implementación del polimorfismo mediante las clases {@link Plane} y {@link Tractor}.
 * <p>
 * Se instancian objetos de ambas clases, se invocan sus métodos implementados
 * de la interfaz {@link IMachine} y métodos específicos de cada clase.
 * </p>
 *
 * @author
 * @version 1.0
 */
public class Exercise16 {

	/**
	 * Punto de entrada del programa.
	 * <p>
	 * Crea instancias de {@link Plane} y {@link Tractor}, y demuestra el uso
	 * de sus métodos implementados y específicos.
	 * </p>
	 *
	 * @param args Argumentos de la línea de comandos (no utilizados).
	 */
	public static void main(String[] args) {
		Plane plane = new Plane("Boeing");
		Tractor tractor = new Tractor(3500);

		// Iniciar las máquinas
		plane.start();
		tractor.start();

		// Ejecutar métodos específicos
		plane.fly();
		tractor.forward();


		tractor.backward();
		plane.stop();
		tractor.maintenance();
		plane.maintenance();
		tractor.stop();
		plane.start();
	}

}
