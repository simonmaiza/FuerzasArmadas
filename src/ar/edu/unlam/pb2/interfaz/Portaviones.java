package ar.edu.unlam.pb2.interfaz;

public class Portaviones extends Vehiculo implements Acuatico {
	
	private Double profundidad;
	
	public Portaviones(Integer codigo, String descripcion) {
		super(codigo, descripcion);
		this.profundidad = 0.0;
	}

	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return profundidad;
	}

}
