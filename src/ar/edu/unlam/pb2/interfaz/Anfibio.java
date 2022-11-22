package ar.edu.unlam.pb2.interfaz;

public class Anfibio extends Vehiculo implements Acuatico, Terrestre{
	
	private Double profundidad;
	private Double velocidad;

	public Anfibio(Integer codigo, String descripcion) {
		super(codigo, descripcion);
		this.profundidad = 0.0;
		this.velocidad = 0.0;
	}
	
	public Double getProfundidad() {
		return this.profundidad;
	}
	
	public Double getVelocidad() {
		return this.velocidad;
	}
}
