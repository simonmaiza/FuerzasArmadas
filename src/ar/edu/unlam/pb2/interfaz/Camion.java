package ar.edu.unlam.pb2.interfaz;

public class Camion extends Vehiculo implements Terrestre {
	
	private Double velocidad;
	
	public Camion(Integer codigo, String descripcion) {
		super(codigo, descripcion);
		this.velocidad = 0.0;
	}

	@Override
	public Double getVelocidad() {
		// TODO Auto-generated method stub
		return this.velocidad;
	}

}
