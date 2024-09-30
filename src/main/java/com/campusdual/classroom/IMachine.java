package com.campusdual.classroom;

/**
 * La interfaz {@code IMachine} define las operaciones básicas que debe
 * implementar cualquier máquina, como iniciar, detenerse y realizar mantenimiento.
 * <p>
 * Esta interfaz permite aplicar el polimorfismo, permitiendo que diferentes
 * clases de máquinas sean tratadas de manera uniforme.
 * </p>
 *
 * @author
 * @version 1.0
 */
public interface IMachine {

	/**
	 * Inicia la máquina. Este método debe ser implementado para encender la máquina correspondiente.
	 */
	void start();

	/**
	 * Detiene la máquina. Este método debe ser implementado para apagar la máquina correspondiente.
	 */
	void stop();

	/**
	 * Realiza el mantenimiento de la máquina. Este método debe ser implementado para llevar a cabo las
	 * tareas de mantenimiento necesarias.
	 */
	void maintenance();

}
