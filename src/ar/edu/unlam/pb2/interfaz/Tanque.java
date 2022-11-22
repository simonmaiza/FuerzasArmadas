package ar.edu.unlam.pb2.interfaz;

public class Tanque extends Vehiculo implements Terrestre {
	
	private Double velocidad;
	
	public Tanque(Integer codigo, String descripcion) {
		super(codigo, descripcion);
		this.velocidad = 0.0;
	}

	@Override
	public Double getVelocidad() {
		return this.velocidad;
	}
	
	
	

}
