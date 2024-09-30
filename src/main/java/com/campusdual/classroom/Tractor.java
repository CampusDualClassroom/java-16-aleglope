package com.campusdual.classroom;

/**
 * La clase {@code Tractor} representa un tractor con una potencia específica.
 * <p>
 * Implementa la interfaz {@link IMachine}, proporcionando implementaciones
 * concretas para los métodos {@code start()}, {@code stop()} y {@code maintenance()}.
 * Además, ofrece funcionalidades específicas como avanzar y retroceder.
 * </p>
 *
 * @author
 * @version 1.0
 */
public class Tractor implements IMachine {

	/**
	 * Potencia del tractor en caballos de fuerza.
	 */
	protected int horsePower = 0;

	/**
	 * Construye un nuevo tractor con la potencia especificada.
	 *
	 * @param hp La potencia del tractor en caballos de fuerza.
	 */
	public Tractor(int hp) {
		this.horsePower = hp;
	}

	/**
	 * Inicia el tractor, indicando que está encendido.
	 */
	@Override
	public void start() {
		System.out.println("El tractor está encendido.");
	}

	/**
	 * Detiene el tractor, indicando que está apagado.
	 */
	@Override
	public void stop() {
		System.out.println("El tractor está apagado.");
	}

	/**
	 * Realiza el mantenimiento del tractor, indicando que está en mantenimiento.
	 */
	@Override
	public void maintenance() {
		System.out.println("El tractor está en mantenimiento.");
	}

	/**
	 * Hace que el tractor avance, mostrando un mensaje correspondiente.
	 */
	public void forward() {
		System.out.println("El tractor avanza.");
	}

	/**
	 * Hace que el tractor retroceda, mostrando un mensaje correspondiente.
	 */
	public void backward() {
		System.out.println("El tractor retrocede.");
	}

	/**
	 * Obtiene la potencia del tractor.
	 *
	 * @return La potencia del tractor en caballos de fuerza.
	 */
	public int getHorsePower() {
		return horsePower;
	}

	/**
	 * Establece la potencia del tractor.
	 *
	 * @param horsePower La nueva potencia del tractor en caballos de fuerza.
	 */
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
}
