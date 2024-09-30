package com.campusdual.classroom;

/**
 * La clase {@code Plane} representa un avión con un modelo específico.
 * <p>
 * Implementa la interfaz {@link IMachine}, proporcionando implementaciones
 * concretas para los métodos {@code start()}, {@code stop()} y {@code maintenance()}.
 * Además, ofrece una funcionalidad específica para volar.
 * </p>
 *
 * @author
 * @version 1.0
 */
public class Plane implements IMachine {

	/**
	 * Modelo del avión.
	 */
	private String model;

	/**
	 * Construye un nuevo avión con el modelo especificado.
	 *
	 * @param model El modelo del avión.
	 */
	public Plane(String model) {
		this.model = model;
	}

	/**
	 * Inicia el avión, indicando que está encendido.
	 */
	@Override
	public void start() {
		System.out.println("El avión " + model + " está encendido.");
	}

	/**
	 * Detiene el avión, indicando que está apagado.
	 */
	@Override
	public void stop() {
		System.out.println("El avión " + model + " está apagado.");
	}

	/**
	 * Realiza el mantenimiento del avión, indicando que está en mantenimiento.
	 */
	@Override
	public void maintenance() {
		System.out.println("El avión " + model + " está en mantenimiento.");
	}

	/**
	 * Hace que el avión vuele, mostrando un mensaje correspondiente.
	 */
	public void fly() {
		System.out.println("El avión " + model + " está volando.");
	}

	/**
	 * Obtiene el modelo del avión.
	 *
	 * @return El modelo del avión.
	 */
	public String getModel() {
		return model;
	}

	/**
	 * Establece el modelo del avión.
	 *
	 * @param model El nuevo modelo del avión.
	 */
	public void setModel(String model) {
		this.model = model;
	}
}
